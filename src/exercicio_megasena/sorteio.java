package exercicio_megasena;
import java.util.Random;
import java.util.TreeSet;

public class sorteio {
  public TreeSet<Integer> logicaSorteio(){
        Random aleatorios= new Random();
        int numeros;
        TreeSet <Integer> ts =new TreeSet<Integer>();
        for(int i=0;i<6;i++){
            numeros = aleatorios.nextInt(60);
            ts.add(numeros);
        }
      System.out.println(ts);
        return ts;
    }


}
