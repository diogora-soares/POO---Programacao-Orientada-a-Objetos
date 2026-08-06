package Lista01.Questao04;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Digite o nome da pessoa "+(i+1)+": ");
            pessoa.nome = sc.nextLine();
    
            System.out.println("Digite a altura da pessoa "+(i+1)+": ");
            pessoa.altura = sc.nextDouble();
    
            System.out.println("Digite o peso da pessoa "+(i+1)+": ");
            pessoa.peso = sc.nextDouble();

            pessoas[i] = pessoa;
        }

        for (int i = pessoas.length - 1; i >= 0; i--) {
            pessoas[i].exibirInformacoes();
        }
    }
}
