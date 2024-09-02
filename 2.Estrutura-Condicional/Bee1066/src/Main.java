import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPares = 0;
        int countImpares = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        int valor1 = scanner.nextInt();
        if (valor1 % 2 == 0) {
            countPares++;
        } else {
            countImpares++;
        }
        if (valor1 > 0) {
            countPositivos++;
        } else if (valor1 < 0) {
            countNegativos++;
        }

        int valor2 = scanner.nextInt();
        if (valor2 % 2 == 0) {
            countPares++;
        } else {
            countImpares++;
        }
        if (valor2 > 0) {
            countPositivos++;
        } else if (valor2 < 0) {
            countNegativos++;
        }

        int valor3 = scanner.nextInt();
        if (valor3 % 2 == 0) {
            countPares++;
        } else {
            countImpares++;
        }
        if (valor3 > 0) {
            countPositivos++;
        } else if (valor3 < 0) {
            countNegativos++;
        }

        int valor4 = scanner.nextInt();
        if (valor4 % 2 == 0) {
            countPares++;
        } else {
            countImpares++;
        }
        if (valor4 > 0) {
            countPositivos++;
        } else if (valor4 < 0) {
            countNegativos++;
        }

        int valor5 = scanner.nextInt();
        if (valor5 % 2 == 0) {
            countPares++;
        } else {
            countImpares++;
        }
        if (valor5 > 0) {
            countPositivos++;
        } else if (valor5 < 0) {
            countNegativos++;
        }

        System.out.println(countPares + " valor(es) par(es)");
        System.out.println(countImpares + " valor(es) impar(es)");
        System.out.println(countPositivos + " valor(es) positivo(s)");
        System.out.println(countNegativos + " valor(es) negativo(s)");

        scanner.close();
    }
}
