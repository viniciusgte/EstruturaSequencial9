import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double F;
        double C;

        System.out.print("Escreva ao lado a temperatura em graus Fahrenheit: ");
        F = teclado.nextDouble();

        C = 5 * ((F-32) / 9);

        System.out.print("A Temperatura em Celsius é: ");
        System.out.printf("%.1f", C); System.out.print("°C");
        
        teclado.close();

    }

}    