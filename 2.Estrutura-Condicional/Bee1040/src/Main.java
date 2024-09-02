import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, n4, media, notaExame, mediaFinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = (n1*2 + n2*3 + n3*4 + n4 *1) / 10f;

        if(media >= 7f){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado");
        }
        else if(media < 5f){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno Reprovado");
        }
        else if(media >= 5f || media <= 6.9f){
            System.out.println("Aluno em exame");
            System.out.print("Nota exame: ");
            notaExame = sc.nextFloat();
            mediaFinal = (media + notaExame) / 2f;
            if(mediaFinal >= 5f){
                System.out.println("Aluno aprovado");
                System.out.printf("Media Final: %.1f%n", mediaFinal);
            }
        }

        sc.close();
    }
}
