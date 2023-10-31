package prova;

public class Laboratorio {
private String id;
private String sigla;
private final int capacidade=20;
private Equipamentos conjuntoDeEquipamentos;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

public String getSigla() {
	return sigla;
}

public void setSigla(String sigla) {
	this.sigla = sigla;
}

public Equipamentos getConjuntoDeEquipamentos() {
	return conjuntoDeEquipamentos;
}

public void setConjuntoDeEquipamentos(Equipamentos conjuntoDeEquipamentos) {
	this.conjuntoDeEquipamentos = conjuntoDeEquipamentos;
}

public int getCapacidade() {
	return capacidade;
}
@Override
public String toString() {
	return "Laboratorio [id=" + id + ", sigla=" + sigla  + ", Equipamentos="
			+ conjuntoDeEquipamentos + ", capacidade=" + capacidade +"]\n";
}




}
