package Lista02.Questao02;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(){
        estoque = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public int getEstoque() {
        return estoque;
    }
    
    public void vender(int quantidade){
        if (this.estoque >= quantidade) {
            this.estoque -= quantidade;
        }
    }

    public void repor(int quantidade){
        if (quantidade > 0) {
            this.estoque += quantidade;
        }
    }
}
