package prova;

public  class Equipamentos {
private String id;
private String descricao;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public enum tipo{
	computador,projetor
}

@Override
public String toString() {
	return "Equipamentos [id=" + id + "tipo= "+tipo.computador+", descricao=" + descricao + "]\n";
}
	
}
