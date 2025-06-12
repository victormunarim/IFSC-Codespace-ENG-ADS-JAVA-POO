import java.util.Scanner;

public class DolaresParaReais {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite a quantidade de dolares: ");
        double dolares = linhaDigitada.nextDouble();
        double reais = dolares * 5.64;

        System.out.println("reais: " + reais);

        linhaDigitada.close();
    }
}