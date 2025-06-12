import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite a base: ");
        double base = linhaDigitada.nextDouble();

        System.out.print("digite a altura: ");
        double altura = linhaDigitada.nextDouble();

        double area = base * altura / 2;

        System.out.println("area: " + area);

        linhaDigitada.close();
    }
}

