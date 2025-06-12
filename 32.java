import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite o valor e o desconto: ");
        double total = linhaDigitada.nextDouble();
        double desconto = linhaDigitada.nextDouble(); 
        total = total - desconto;

        System.out.println("total com desconto: " + total);

        linhaDigitada.close();
    }
}