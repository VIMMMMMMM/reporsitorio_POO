package prova;

import java.util.TreeSet;

public class Impressao {
public void impLab(TreeSet<String> lab) {
	Base base = new Base();
		System.out.println(base.laboratorio());
	
	
	
}
public void impProf(TreeSet<String> prof) {
	Base base = new Base();

		System.out.println(base.professor());
	
}
public void imprAln(TreeSet<String> aln) {
	Base base = new Base();

		System.out.println(base.aluno());

}
}
