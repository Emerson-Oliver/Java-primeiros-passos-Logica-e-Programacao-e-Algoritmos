import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f\n", area);
        }

        scanner.close();
    }
}
