package exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExecutorDoExercicio1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner= new Scanner(System.in);
        SimpleDateFormat dateFormat = new  SimpleDateFormat("dd/MM/yyyy");
        int quarto = scanner.nextInt();
        Date checkIn = dateFormat.parse(scanner.next());
        Date checkOut = dateFormat.parse(scanner.next());
      if (!checkOut.after(checkIn)){
          System.out.println("check out deve ser depois do check in");
      } else {
          exercicio1 exercicio1 = new exercicio1(quarto,checkIn,checkOut);
          System.out.println("Reserva: "+exercicio1);
          System.out.println("atualizacao de reserva:");
          checkIn = dateFormat.parse(scanner.next());
          checkOut = dateFormat.parse(scanner.next());
          exercicio1.atualizacaoDeDatas(checkIn,checkOut);
      }

    }
}
