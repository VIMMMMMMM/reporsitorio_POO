package exercicio_megasena;

import java.util.*;

public class executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorios= new Random();
        TreeSet<Integer> sorteio =new TreeSet<>();
        TreeSet <Integer>cliente= new TreeSet<>();
        int numeroSorteio;
        int numeroCliente;

        System.out.println("digite 6 numeros de 1 a 60");
        for (int i = 0; i < 6; i++) {
            numeroCliente = sc.nextInt();
            cliente.add(numeroCliente);
        }
        System.out.println("numeros escolhidos:");
        System.out.println(cliente);

        for(int i=0;i<6;i++){
            numeroSorteio = aleatorios.nextInt(60);
            sorteio.add(numeroSorteio);

        }
        System.out.println("sorteado:");
        System.out.println(sorteio);

    sorteio.retainAll(cliente);
        System.out.println("iguais:"+sorteio.size());
        for (int i = 0; i < 6; i++) {
            if (sorteio.size()==i)
                System.out.println(i);
        }
        sorteio sorteio1 = new sorteio();
        cliente cliente1 = new cliente();
        TreeSet<Integer> ts = new TreeSet<>(sorteio1.logicaSorteio());
        TreeSet<Integer> cs = new TreeSet<>(cliente1.interacaoCliente());
        ts.retainAll(cs);
        System.out.println(ts);
        System.out.println("iguais:");
        for (int i = 0; i < 6; i++) {
            if (ts.size()==i)
                System.out.println(i);
        }

    }
}
