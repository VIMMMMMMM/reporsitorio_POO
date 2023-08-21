import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseDeDados dados = new BaseDeDados();
        dados.obterAlunos(scan.nextInt());

    }
}