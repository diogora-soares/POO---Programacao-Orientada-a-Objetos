package Lista01.Questao01;

public class Pessoa {
 
    double peso;
    double altura;

    double calcularImc(){
        return peso/(altura*altura);
    }
}
