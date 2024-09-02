import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        if(v1 % v2 == 0 || v2 % v1 == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}
