import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite a hora: ");
        double total = linhaDigitada.nextDouble();
        double desconto = linhaDigitada.nextDouble();

        double final = total - desconto;

        System.out.println("media: " + media);

        linhaDigitada.close();
    }
}

