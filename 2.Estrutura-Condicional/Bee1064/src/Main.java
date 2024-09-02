import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int countPositivos = 0;
        double somaPositivos = 0.0;

        double valor1 = scanner.nextDouble();
        if (valor1 > 0) {
            countPositivos++;
            somaPositivos += valor1;
        }

        double valor2 = scanner.nextDouble();
        if (valor2 > 0) {
            countPositivos++;
            somaPositivos += valor2;
        }

        double valor3 = scanner.nextDouble();
        if (valor3 > 0) {
            countPositivos++;
            somaPositivos += valor3;
        }

        double valor4 = scanner.nextDouble();
        if (valor4 > 0) {
            countPositivos++;
            somaPositivos += valor4;
        }

        double valor5 = scanner.nextDouble();
        if (valor5 > 0) {
            countPositivos++;
            somaPositivos += valor5;
        }

        double valor6 = scanner.nextDouble();
        if (valor6 > 0) {
            countPositivos++;
            somaPositivos += valor6;
        }

        double mediaPositivos = somaPositivos / countPositivos;

        System.out.println(countPositivos + " valores positivos");
        System.out.printf("%.1f\n", mediaPositivos);

        scanner.close();
    }
}
