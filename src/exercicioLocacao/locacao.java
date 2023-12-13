package exercicioLocacao;

import java.util.Date;

public class locacao {
    private Date horaInicial;
    private Date horaFinal;
    private double valorLocacaoHora;
    private double valorLocacaoDia;
    private final double impostoMaior=0.2;
    private final double impostoMenor=0.15;


    public double getValorLocacaoHora() {
        return valorLocacaoHora;
    }

    public void setValorLocacaoHora(double valorLocacaoHora) {
        this.valorLocacaoHora = valorLocacaoHora;
    }

    public double getValorLocacaoDia() {
        return valorLocacaoDia;
    }

    public void setValorLocacaoDia(double valorLocacaoDia) {
        this.valorLocacaoDia = valorLocacaoDia;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public double getImpostoMaior() {
        return impostoMaior;
    }

    public double getImpostoMenor() {
        return impostoMenor;
    }
}
