package prova;

public class Professor extends Pessoa {
private String curso;


public String getCurso() {
	return curso;
}


public void setCurso(String curso) {
	this.curso = curso;
}


public String toString() {
	return "prova1.Professor [curso=" + curso +" id="+getId()+" nome="+getNome()+ "]\n";
}
}
