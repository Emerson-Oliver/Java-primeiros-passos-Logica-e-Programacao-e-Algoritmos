import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int contadorIdades = 0;
        double soma = 0.0;

        while(idade >=0){
            soma+=1;
            contadorIdades += idade;
            idade = sc.nextInt();
        }
        double media = contadorIdades / soma;
        System.out.printf("%.2f%n", media);
        sc.close();
    }
}
