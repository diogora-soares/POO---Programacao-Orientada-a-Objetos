package Lista01.Questao04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        
        System.out.println("Digite o nome da pessoa 1:");
        pessoa1.nome = sc.nextLine();

        System.out.println("Digite a altura da pessoa 1:");
        pessoa1.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 1:");
        pessoa1.peso = sc.nextDouble();

        // --------------------------------------------------------------

        System.out.println("Digite o nome da pessoa 2:");
        pessoa2.nome = sc.nextLine();

        System.out.println("Digite a altura da pessoa 2:");
        pessoa2.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 2:");
        pessoa2.peso = sc.nextDouble();


        // --------------------------------------------------------------

        System.out.println("Digite o nome da pessoa 3:");
        pessoa3.nome = sc.nextLine();

        System.out.println("Digite a altura da pessoa 3:");
        pessoa3.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 3:");
        pessoa3.peso = sc.nextDouble();

        // --------------------------------------------------------------

        pessoa3.exibirInformacoes();
        System.out.println("--------------------------------");
        pessoa2.exibirInformacoes();
        System.out.println("--------------------------------");
        pessoa1.exibirInformacoes();
    }
}
