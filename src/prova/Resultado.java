package prova;

public class Resultado {

	public static void main(String[] args) {
		Impressao impressao = new Impressao();
		Base base = new Base();
		impressao.impLab(base.laboratorio());
		impressao.impProf(base.professor());
		impressao.imprAln(base.aluno());

	}

}
