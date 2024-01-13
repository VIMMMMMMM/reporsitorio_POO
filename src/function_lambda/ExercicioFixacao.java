package function_lambda;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExercicioFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome do arquivo");
        String arquivo = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            List<ProdutoExercicio> list= new ArrayList<>();
            String linha = br.readLine();
            while (linha!=null){
                String[] espaco = linha.split(",");
                list.add(new ProdutoExercicio(espaco[0],espaco[1], Double.parseDouble(espaco[2])));
                linha = br.readLine();
            }
            System.out.println("digite o salario");
            Double valor = scanner.nextDouble();
            Comparator<String> comparator = (s1,s2)-> s1.toUpperCase().compareTo(s2.toUpperCase());
           List<String> gmail = list.stream()
                    .filter(p->p.getPreco()>valor)
                   .map(ProdutoExercicio::getGmail)
                   .sorted(comparator)
                   .toList();
            System.out.println("lista de pessoas que tem o salario maior que "+valor);
           gmail.forEach(System.out::println);
           Double salario = list.stream()
                   .filter(p->p.getNome().charAt(0)=='M')
                   .map(ProdutoExercicio::getPreco)
                   .reduce(0.0, Double::sum);
            System.out.println("soma de todos que comecam com M "+salario);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
