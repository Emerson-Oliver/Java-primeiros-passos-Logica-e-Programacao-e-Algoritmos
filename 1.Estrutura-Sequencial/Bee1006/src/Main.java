import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();

        float media  = (nota1 * 2f + nota2 * 3f + nota3 * 5f) / 10f;

        System.out.printf("MEDIA = %.1f%n ", media );

        sc.close();
    }
}

