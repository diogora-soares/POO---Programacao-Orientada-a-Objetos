package Lista02.Questao03;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    
    public void sacar(double valor){
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
        }
    }
}
