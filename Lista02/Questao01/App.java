package Lista02.Questao01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Digite o nome da pessoa "+(i+1)+": ");
            String nome = sc.nextLine();
            pessoa.setNome(nome);
    
            System.out.println("Digite a altura da pessoa "+(i+1)+": ");
            double altura = sc.nextDouble();
            pessoa.setAltura(altura);
    
            System.out.println("Digite o peso da pessoa "+(i+1)+": ");
            double peso = sc.nextDouble();
            pessoa.setPeso(peso);

            pessoas[i] = pessoa;
        }

        for (int i = pessoas.length - 1; i >= 0; i--) {
            pessoas[i].exibirInformacoes();
        }
    }
}
