import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double valorAPagar = 0.0;

        if(codigo == 1){
            valorAPagar = quantidade * 4.00;
        } else if(codigo == 2){
            valorAPagar = quantidade * 4.50;
        } else if(codigo == 3){
            valorAPagar = quantidade * 5.00;
        }else if(codigo == 4){
            valorAPagar = quantidade * 2.00;
        } else if(codigo == 5){
            valorAPagar = quantidade * 1.50;
        }
        System.out.printf("Total = %.2f%n", valorAPagar);

        sc.close();
    }
}
