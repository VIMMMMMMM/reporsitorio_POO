package exercicio2;

import java.io.*;
import java.util.Scanner;

public class EstudoDoScanner {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        try(BufferedReader bf = new BufferedReader(new FileReader(file))) {

            String line = bf.readLine();
            while (line!=null){
                System.out.println(line);
                line=  bf.readLine();
            }
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------------------------------");

        try ( Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException f) {
            System.out.println("erro ao abrir arquivo" + f.getMessage());
        }
        System.out.println("------------------------------------------------------------");

        String[]linhas = {"kaique","viado","boiola"};
        String arquivo ="C:\\temp\\out.txt";
        try (BufferedWriter bw =new BufferedWriter(new FileWriter(arquivo,true)) ){
            for (String linha:linhas){
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
            String strPasta = sc.nextLine();
            File pasta = new File(strPasta);
            File[] arquivos= pasta.listFiles(File::isDirectory);
        System.out.println("pasta:");
        for (File arquivox:arquivos){
            System.out.println(arquivox);
        }

        File[] files=pasta.listFiles(File::isFile);
        System.out.println("arquivos");
        for (File pastax:files){
            System.out.println(pastax);
        }
        System.out.println("-------------------------------------------------------------------------------------");

        boolean sucesso = new File(strPasta+"\\teste").mkdir();
        System.out.println("pasta criada com sucesso "+sucesso);
        System.out.println("----------------------------------------------------------------------------------");

        String teste = sc.nextLine();
        File pasta2 = new File(teste);
        System.out.println("nome: "+pasta2.getName());
        System.out.println("caminho: "+pasta2.getParent());
        System.out.println("completo: "+pasta2.getPath());
    }

}
