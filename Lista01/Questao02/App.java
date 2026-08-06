package Lista01.Questao02;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa usuario = new Pessoa();
        
        System.out.println("Digite sua altura:");
        usuario.altura = sc.nextDouble();
        
        System.out.println("Digite seu peso:");
        usuario.peso = sc.nextDouble();

        System.out.println("O seu IMC é de: " + usuario.calcularImc());
    }
}
