import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite 4 valores: ");
        double valor1 = linhaDigitada.nextDouble();
        double valor2 = linhaDigitada.nextDouble();
        double valor3 = linhaDigitada.nextDouble();
        double valor4 = linhaDigitada.nextDouble();

        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        System.out.println("media: " + media);

        linhaDigitada.close();
    }
}

