import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int soma = 0;
        int contadorIdades = 0;
        double media = 0;
        while(idade >=0){
            soma += idade;
            contadorIdades +=1;
            idade = sc.nextInt();
        }

        if(contadorIdades > 0){
            media = (double) soma / contadorIdades;
            System.out.printf("%.2f%n", media);
        }
        else{
            System.out.println("Impossível Calcular");
        }

        sc.close();
    }
}
