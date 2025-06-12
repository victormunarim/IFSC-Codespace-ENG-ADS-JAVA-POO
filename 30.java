import java.util.Scanner;

public class MinutosParaHoras {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite os minutos: ");
        double minutos = linhaDigitada.nextDouble();

        double horas = minutos / 60;

        System.out.println("horas: " + horas);

        linhaDigitada.close();
    }
}

