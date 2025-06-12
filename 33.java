import java.util.Scanner;

public class AnoParaDias {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite a quantidade de anos: ");
        int anos = Integer.parseInt(linhaDigitada.nextLine());
        int dias = anos * 365;

        System.out.println("dias: " + dias);

        linhaDigitada.close();
    }
}