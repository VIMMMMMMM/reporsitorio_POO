package exercicioLocacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class validacaoLocacao implements IvalicadarLocacao{
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    public void userInteraction(){
        try {
            locacao locacao = new locacao();
            validacaoLocacao validacaoLocacao = new validacaoLocacao();

            Scanner scan = new Scanner(System.in);

            System.out.println("enter rental data");
            System.out.println("car model:");
            String modelo= scan.next();
            scan.nextLine();
            System.out.println("pickup (dd/MM/yyyy hh:mm):");
            locacao.setHoraInicial(simpleDateFormat.parse(scan.nextLine()));
            System.out.println("return (dd/MM/yyyy hh:mm):");
            locacao.setHoraFinal(simpleDateFormat.parse(scan.nextLine()));
            System.out.println("enter price per hour:");
            locacao.setValorLocacaoHora(scan.nextDouble());
            System.out.println("enter pricer per day:");
            locacao.setValorLocacaoDia(scan.nextDouble());
            validacaoLocacao.ValidarLocacao(locacao);

        }
        catch (ParseException p){
            p.printStackTrace();

        }

    }
    public void ValidarLocacao(locacao locacao){
    calculoLocacao calculoLocacao=new calculoLocacao();

        calculoLocacao.setDuracaoLocacao((locacao.getHoraFinal().getTime() - locacao.getHoraInicial().getTime())/1000);

        if (calculoLocacao.getDuracaoLocacao()>43200){
            double valorDia=Math.ceil((double) calculoLocacao.getDuracaoLocacao() /86400);
            calculoLocacao.setValorDiaTotal(locacao.getValorLocacaoDia() * valorDia);
            if (calculoLocacao.getValorDiaTotal()>100){
                calculoLocacao.setValorImposto(calculoLocacao.getValorDiaTotal() * locacao.getImpostoMenor());
            }else {
                calculoLocacao.setValorImposto(calculoLocacao.getValorDiaTotal() * locacao.getImpostoMaior());
            }
            calculoLocacao.setValorTotal(calculoLocacao.getValorDiaTotal()+ calculoLocacao.getValorImposto());
            System.out.println("invoice: ");
            System.out.println("basic payment: "+calculoLocacao.getValorDiaTotal());
            System.out.println("tax: "+calculoLocacao.getValorImposto());
            System.out.println("total payment: "+calculoLocacao.getValorTotal());
        }else {
            double valorHora= Math.ceil((double) calculoLocacao.getDuracaoLocacao() /3600);
            calculoLocacao.setValorHoraTotal(locacao.getValorLocacaoHora() * valorHora);
            if (calculoLocacao.getValorHoraTotal()>100){
                calculoLocacao.setValorImposto(calculoLocacao.getValorHoraTotal() * locacao.getImpostoMenor());
            }else {
                calculoLocacao.setValorImposto(calculoLocacao.getValorHoraTotal() * locacao.getImpostoMaior());
            }
            calculoLocacao.setValorTotal(calculoLocacao.getValorHoraTotal()+ calculoLocacao.getValorImposto());
            System.out.println("invoice: ");
            System.out.println("basic payment: "+calculoLocacao.getValorHoraTotal());
            System.out.println("tax: "+calculoLocacao.getValorImposto());
            System.out.println("total payment: "+calculoLocacao.getValorTotal());
        }

    }
}
