import java.util.Scanner;
public class BaseDeDados {
    public aluno[] obterAlunos(int quantidade){
        Scanner sc = new Scanner(System.in);
        aluno[] vetor = new aluno[quantidade];

        aluno al;
        for (int i =0;i< vetor.length;i++){
            al = new aluno();
            al.setMatricula(sc.nextInt());
            al.setId(i+1);
            al.setNome(sc.next());
            vetor[i]=al;
        }
        imprimir(vetor);
        return vetor;
    }
    private void imprimir (aluno[]vetor){
for (int i = 0;i<vetor.length;i++){
    System.out.println(vetor[i].getNome()+" id: "+ vetor[i].getId()+" matricula: "+vetor[i].getMatricula());
}



    }

}
