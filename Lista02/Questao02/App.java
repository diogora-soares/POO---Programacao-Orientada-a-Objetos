package Lista02.Questao02;

public class App {
    public static void main(String[] args) {
        Produto prod = new Produto();
        
        prod.setNome("Feijao");
        prod.setPreco(5);
        
        System.out.println("Nome: " + prod.getNome());
        System.out.println("Preco: " + prod.getPreco());
        System.out.println("Estoque: " + prod.getEstoque());
        
        prod.vender(2);
        
        System.out.println("Estoque: " + prod.getEstoque());
        
        prod.repor(3);
        
        System.out.println("Estoque: " + prod.getEstoque());

        prod.setPreco(-1);

        System.out.println("Preço: " + prod.getPreco());

        prod.setPreco(3);

        System.out.println("Preço: " + prod.getPreco());
    }
}
