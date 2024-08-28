import java.util.Locale;
public class Main {
    public static void main(String[] args){

        String produto1 = "Computador";
        String produto2 = "Mesa de escritorio";
        int idade = 39;
        int codigo = 18934;
        char genero = 'M';

        double preco1 = 2100.00;
        double preco2 = 650.00;

        double medida = 53.234567;

        System.out.println("Produtos");
        System.out.printf("%s custa: R$ %.2f%n", produto1, preco1);
        System.out.printf("%s custa: R$ %.2f%n", produto2, preco2);
        System.out.println("Registro: " + idade + " Anos," + " Codigo: " + codigo + " e genero: " + genero);

        System.out.println("Medida usando virgula como separador decimal " + medida);
        System.out.printf("Medida com tres casas decimais %.3f%n " , medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Medida usando ponto como separador decimal %.3f%n " , medida);
    }
}
