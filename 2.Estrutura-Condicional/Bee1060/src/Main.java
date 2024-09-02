import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int countPositivos = 0;

        double valor1 = scanner.nextDouble();
        if (valor1 > 0) {
            countPositivos++;
        }

        double valor2 = scanner.nextDouble();
        if (valor2 > 0) {
            countPositivos++;
        }

        double valor3 = scanner.nextDouble();
        if (valor3 > 0) {
            countPositivos++;
        }

        double valor4 = scanner.nextDouble();
        if (valor4 > 0) {
            countPositivos++;
        }

        double valor5 = scanner.nextDouble();
        if (valor5 > 0) {
            countPositivos++;
        }

        double valor6 = scanner.nextDouble();
        if (valor6 > 0) {
            countPositivos++;
        }

        System.out.println(countPositivos + " valores positivos");

        scanner.close();
    }
}
