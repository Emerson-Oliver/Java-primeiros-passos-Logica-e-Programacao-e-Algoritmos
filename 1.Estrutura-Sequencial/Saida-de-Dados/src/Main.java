import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        int y = 32;
        double x = 39.58974;
        System.out.print("Olá, Mundo!");
        System.out.println("Bom dia!");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println(x + " metros");
        System.out.printf("Resultado: %.2f metros %n ", x);
    }
}
