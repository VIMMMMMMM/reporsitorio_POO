package exercicio_megasena;

import java.util.Scanner;
import java.util.TreeSet;

public class cliente {
    public TreeSet<Integer> interacaoCliente(){
        Scanner sc = new Scanner(System.in);
        TreeSet <Integer>ts= new TreeSet<Integer>();
        int numero;
        System.out.println("digite 6 numeros de 1 a 60");
        for (int i = 0; i < 6; i++) {
            numero = sc.nextInt();
            ts.add(numero);
        }
        return ts;
    }
}
