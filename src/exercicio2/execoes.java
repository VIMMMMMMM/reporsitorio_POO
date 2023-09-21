package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class execoes {
    public static void main(String[] args) {
        metodo1();
        System.out.println("fim");
    }
    public static void metodo1(){
        metodo2();
    }
    public static void metodo2(){
        try (Scanner scanner = new Scanner(System.in)) {
            String[] vetor = scanner.nextLine().split(" ");
            int posicao = scanner.nextInt();
            System.out.println(vetor[posicao]);

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("posicao invalida");
            a.printStackTrace();
        } catch (InputMismatchException i) {
            System.out.println("nao e um numero");
            i.printStackTrace();
        } finally {
            System.out.println("finally funcionou");
        }
    }
}
