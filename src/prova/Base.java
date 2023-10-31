package prova;
import java.util.TreeSet;

public class Base {

public TreeSet<String> laboratorio() {
	Equipamentos ep = new Equipamentos();
	Laboratorio lab = new Laboratorio();
	TreeSet<String>tsl=new TreeSet<>();
	for (int i = 1; i <=5; i++) {
		lab.setId(""+i);
		lab.setSigla("LAB"+i);
		lab.setConjuntoDeEquipamentos(ep);
		ep.setId(""+i);
		ep.setDescricao("EQ"+i);
		tsl.add(lab.toString());


	
	}
	return tsl;
}
public TreeSet<String> professor() {
	Professor prof = new Professor();

	TreeSet<String>tsp=new TreeSet<>();
	for (int i = 1; i <=3; i++) {
		prof.setId(""+i);
		prof.setCurso("c"+i);
		prof.setNome("PROF"+i);
		tsp.add(prof.toString());
		
	}
	return tsp;
	
}
public TreeSet<String> aluno() {
	Aluno aln = new Aluno();
	
	TreeSet<String>tsa=new TreeSet<>();
	for (int i = 1; i <=20; i++) {
		aln.setId(""+i);
		aln.setMatricula("M"+i);
		aln.setNome("ALN"+i);
		tsa.add(aln.toString());
		
	}
	return tsa;
	
}
}
