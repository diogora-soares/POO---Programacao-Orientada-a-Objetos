package Lista02.Questao03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        ContaBancaria cb1 = new ContaBancaria();
        Scanner sc = new Scanner(System.in);

        System.out.print("Titular da conta 1: ");
        cb1.setTitular(sc.nextLine());

        System.out.print("Número da conta 1: ");
        cb1.setNumero(sc.nextLine());

        ContaBancaria cb2 = new ContaBancaria();
        System.out.print("Titular da conta 2: ");
        cb2.setTitular(sc.nextLine());

        System.out.print("Número da conta 2: ");
        cb2.setNumero(sc.nextLine());
        
        cb1.depositar(1000); 
        System.out.println("Conta 1 Saldo: " + cb1.getSaldo());
        
        cb1.depositar(700); 
        System.out.println("Conta 1 Saldo: " + cb1.getSaldo());
        
        System.out.println();

        cb2.depositar(5000);
        System.out.println("Conta 2 Saldo: " + cb2.getSaldo());
        
        cb2.sacar(3000);
        System.out.println("Conta 2 Saldo: " + cb2.getSaldo());
        
        cb2.transferir(cb1, 1800);
        System.out.printf("%nTitular: %s %nNúmero: %s %nSaldo: %.2f%n",cb1.getTitular(), cb1.getNumero(), cb1.getSaldo());

        System.out.printf("%nTitular: %s %nNúmero: %s %nSaldo: %.2f%n",cb2.getTitular(), cb2.getNumero(), cb2.getSaldo());
    }
}
