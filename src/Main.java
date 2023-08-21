import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
       aluno aluno=new aluno();
       vetor vetor =new vetor();
       int[] matricula=new int[5];
       String[] nome=new String[5];
       for (int i=0;i<matricula.length;i++){
        matricula[i]= scan.nextInt();
        aluno.setMatricula(matricula);
       }
       for (int i =0; i< matricula.length;i++){
       System.out.println(aluno.getMatricula());
       }
    }
}