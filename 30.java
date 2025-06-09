import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite a hora: ");
        double minutos = linhaDigitada.nextDouble();

        double horas = horas / 60;

        System.out.println("horas: " + horas);

        linhaDigitada.close();
    }
}

