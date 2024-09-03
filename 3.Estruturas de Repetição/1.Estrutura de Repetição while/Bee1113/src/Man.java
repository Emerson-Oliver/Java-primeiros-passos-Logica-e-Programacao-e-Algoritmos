import java.util.Scanner;

public class Man {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        while(valor1 != valor2){
            if(valor1 < valor2){
                System.out.println("Crescente");
            }
            else{
                System.out.println("Decrescente");
            }
            valor1 = sc.nextInt();
            valor2 = sc.nextInt();
        }
        sc.close();
    }
}
