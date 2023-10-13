import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       char resp;

       do {
           System.out.print("Digite a temperatura em Celsius: ");
           double C = sc.nextDouble();
           double F = 9.0 * C / 5.0 + 32.0;
           System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
           System.out.print("Deseja repetir (s/n)?");
           resp = sc.next().charAt(0);
       }   while (resp != 'n');

       sc.close();

        }
    }
