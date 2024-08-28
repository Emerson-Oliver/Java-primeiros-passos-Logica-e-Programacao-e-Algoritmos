import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		char sexo = sc.next().charAt(0);
		
		System.out.println("Voce digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(sexo);
		
		
		sc.close();

	}

}
