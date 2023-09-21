package exercicio2;

import exercicio2.DominioExecoes.DominioExecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExecutorDaReserva {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        SimpleDateFormat dateFormat = new  SimpleDateFormat("dd/MM/yyyy");
       try {
           int quarto = scanner.nextInt();
           Date checkIn = dateFormat.parse(scanner.next());
           Date checkOut = dateFormat.parse(scanner.next());

           reserva reserva = new reserva(quarto,checkIn,checkOut);
           System.out.println("Reserva: "+ reserva);

           System.out.println("atualizacao de reserva:");
           checkIn = dateFormat.parse(scanner.next());
           checkOut = dateFormat.parse(scanner.next());
           reserva.atualizacaoDeDatas(checkIn,checkOut);
           reserva.atualizacaoDeDatas(checkIn,checkOut);
           System.out.println("reserva"+reserva);
       }
       catch (ParseException p){
           System.out.println(" data invalida ");
       }
       catch (DominioExecoes i){
           System.out.println("erro na reserva"+i.getMessage());
       }
       catch (RuntimeException r){
           System.out.println("erro inesperado");
       }





    }
}
