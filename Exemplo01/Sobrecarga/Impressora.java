package Exemplo01.Sobrecarga;

public class Impressora {
    public void imprimir(String texto){
        System.out.println(texto);
    }

    public void imprimir(String texto, int qtdVezes){
        for (int i = 0; i < qtdVezes; i++) {
            System.out.println(texto);
        }
    }
}
