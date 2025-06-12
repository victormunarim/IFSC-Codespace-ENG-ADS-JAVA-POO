import java.util.Scanner;
import static java.lang.Math.sqrt;

public class AnoParaDias {
    public static void main(String[] args) {
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.print("digite a, b e c: ");
        double a = Integer.parseInt(linhaDigitada.nextLine());
        double b = Integer.parseInt(linhaDigitada.nextLine());
        double c = Integer.parseInt(linhaDigitada.nextLine());

        double delta = b - 4*a*c;

        if(delta >= 0){
            double x1 = (-b + Math.sqrt(delta)) / 2*a;
            double x2 = (-b - Math.sqrt(delta)) / 2*a;

            System.out.println("raizes: " + x1 + " e " + x2);
        } else {
            System.out.println("raizes não existem");
        }
        
        linhaDigitada.close();
    }
}