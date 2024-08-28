import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroPeca1 = sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double precoPeca1 = sc.nextDouble();
		
		int numeroPeca2 = sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double precoPeca2 = sc.nextDouble();
		
		double valorAPagar = (quantidadePeca1 * precoPeca1) + (quantidadePeca2 * precoPeca2); 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorAPagar );
		
		sc.close();
	}

}

