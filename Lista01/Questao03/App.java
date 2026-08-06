package Lista01.Questao03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        
        System.out.println("Digite a altura da pessoa 1: ");
        pessoa1.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 1: ");
        pessoa1.peso = sc.nextDouble();

        System.out.println("O IMC da pessoa 1 é:  " + pessoa1.calcularImc());

        //------------------------------------------------------------------
        System.out.println("Digite a altura da pessoa 2: ");
        pessoa2.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 2: ");
        pessoa2.peso = sc.nextDouble();

        System.out.println("O IMC da pessoa 2 é:  " + pessoa2.calcularImc());

        //------------------------------------------------------------------
        System.out.println("Digite a altura da pessoa 3: ");
        pessoa3.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 3: ");
        pessoa3.peso = sc.nextDouble();

        System.out.println("O IMC da pessoa 3 é: " + pessoa3.calcularImc());
    }
}
