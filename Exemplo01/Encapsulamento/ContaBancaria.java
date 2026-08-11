package Exemplo01.Encapsulamento;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;
    private boolean ativa;
    public static int id;

    public ContaBancaria() {
        this.id++;
    }

    public static int getId(){
        return id;
    }

    void sacar(double valor){
        saldo = saldo - valor;
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
}
