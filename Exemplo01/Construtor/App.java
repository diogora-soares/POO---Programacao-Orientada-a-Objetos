package Exemplo01.Construtor;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Branco","BMW 320", 2026, 123456);
        Carro carro2 = new Carro();

        carro2.setAno(1976);
        carro2.setModelo("Fusca");
        carro2.setCor("Azul");
        carro2.setRenavam(9876);


        if (carro1.isDocumentoEmDia()) {
            System.out.println(carro1.getRenavam());
        }
    }
}
