package function_lambda;

public class ProdutoExercicio {
    private String nome;
    private Double preco;
    private String gmail;

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ProdutoExercicio(String nome, String gmail ,Double preco) {
        this.nome = nome;
        this.gmail=gmail;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                "gmail= " + gmail +
                String.format("%.2f",preco);
    }
}
