import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite a hora: ");
        double horas = linhaDigitada.nextDouble();

        double minutos = horas * 60;

        System.out.println("minutos: " + minutos);

        linhaDigitada.close();
    }
}

