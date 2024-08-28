import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int numero =sc.nextInt();
			int horasTrabalhadas = sc.nextInt();
			double valorHoraDeTrabalho = sc.nextDouble();
			//double salary = valorHoraDeTrabalho * horasTrabalhadas;
			
			System.out.println("Number = " + numero);
			System.out.printf("SALARY US = %.2f%n", valorHoraDeTrabalho * horasTrabalhadas);
		sc.close();

	}

}
