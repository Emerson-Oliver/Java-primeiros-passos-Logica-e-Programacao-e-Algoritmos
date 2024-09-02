import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ddd = sc.nextInt();
        String cidade;

        if(ddd == 61){
            cidade = "Brasilia";
            System.out.println(cidade);
        }
        else if(ddd == 71){
            cidade = "Salvador";
            System.out.println(cidade);
        }
        else if(ddd == 11){
            cidade = "Sao Paulo";
            System.out.println(cidade);
        }
        else if(ddd == 21){
            cidade = "Rio de Janeiro";
            System.out.println(cidade);
        }
        else if(ddd == 32){
            cidade = "Juiz de Fora";
            System.out.println(cidade);
        }
        else if(ddd == 19){
            cidade = "Campinas";
            System.out.println(cidade);
        }
        else if(ddd == 27){
            cidade = "Vitoria";
            System.out.println(cidade);
        }
        else if(ddd == 31){
            cidade = "Belo Horizonte";
            System.out.println(cidade);
        }

        else{
            System.out.println("DDD não cadastrado");
        }

        sc.close();
    }
}
