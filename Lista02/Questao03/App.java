package Lista02.Questao03;

public class App {
    public static void main(String[] args) {
        
        ContaBancaria cb1 = new ContaBancaria();
        cb1.setTitular("João");
        cb1.setNumero("123456");
        
        ContaBancaria cb2 = new ContaBancaria();
        cb2.setTitular("Pedro");
        cb2.setNumero("654321");
        
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
