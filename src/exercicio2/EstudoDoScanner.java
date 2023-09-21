package exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EstudoDoScanner {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException f) {
            System.out.println("erro ao abrir arquivo" + f.getMessage());
        }
    }

}
