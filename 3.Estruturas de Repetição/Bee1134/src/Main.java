import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

        int codigo = sc.nextInt();

        while(codigo != 4){
           if(codigo == 1){
               Alcool+=1;
           }
           else if(codigo == 2){
               Gasolina +=1;
           }
           else if(codigo == 3){
               Diesel +=1;
           }
            codigo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);
        sc.close();
    }
}
