import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPares = 0;

        int valor1 = scanner.nextInt();
        if (valor1 % 2 == 0) {
            countPares++;
        }

        int valor2 = scanner.nextInt();
        if (valor2 % 2 == 0) {
            countPares++;
        }

        int valor3 = scanner.nextInt();
        if (valor3 % 2 == 0) {
            countPares++;
        }

        int valor4 = scanner.nextInt();
        if (valor4 % 2 == 0) {
            countPares++;
        }

        int valor5 = scanner.nextInt();
        if (valor5 % 2 == 0) {
            countPares++;
        }

        System.out.println(countPares + " valores pares");

        scanner.close();
    }
}
