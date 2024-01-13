package function_lambda;

import java.util.ArrayList;
import java.util.List;

public class Executor_Lambda {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv",900.00));
        list.add(new Produto("Mouse",50.00));
        list.add(new Produto("Tablet",350.50));
        list.add(new Produto("Hd Case",80.90));


        System.out.println(list);

        System.out.println("funcao de funcao");
        ClassesTeste classesTeste = new ClassesTeste();
        double soma = classesTeste.somaLista(list, p -> p.getNome().charAt(0) == 'T');
        System.out.println("soma: "+ String.format("%.2f",soma));
        System.out.println("consumer:");
        list.forEach(p->p.setPreco(p.getPreco()*1.1));
        list.forEach(System.out::println);
        System.out.println("function:");
        List<String>stringList= list.stream().map(p->p.getNome().toUpperCase()).toList();
        stringList.forEach(System.out::println);
        System.out.println("predicate:");
        list.removeIf(p-> p.getPreco()>=100);
        list.forEach(System.out::println);
    }
}
