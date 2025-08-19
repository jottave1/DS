public class Produto {
    private int numero;
    private String descricao;
    private double preco;

    // Construtor vazio
    public Produto() {}

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
