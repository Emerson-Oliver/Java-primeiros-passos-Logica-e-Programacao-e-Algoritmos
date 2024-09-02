import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        if (X % 2 == 0) {
            X++;
        }

        System.out.println(X);
        System.out.println(X + 2);
        System.out.println(X + 4);
        System.out.println(X + 6);
        System.out.println(X + 8);
        System.out.println(X + 10);

        scanner.close();
    }
}
