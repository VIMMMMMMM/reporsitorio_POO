package prova;

public class Aluno extends Pessoa {
private String matricula;

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}


public String toString() {
	return "Aluno [matricula=" + matricula +" id="+getId()+" nome="+getNome()+ "]\n";
}
}
