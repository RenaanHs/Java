
public class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private double preco;

    public Produto(String nome, int codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularValorTotal() {
        return quantidade * preco;
    }
}
    
