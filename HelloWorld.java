import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite: ");
        String entrada = linhaDigitada.nextLine();

        System.out.println("voce digitou: " + entrada);
        linhaDigitada.close();
    }
}

