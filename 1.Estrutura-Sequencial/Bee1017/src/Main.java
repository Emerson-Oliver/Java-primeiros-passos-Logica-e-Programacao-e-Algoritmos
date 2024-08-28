import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double combustivelGasto = tempo;
		
		
				
		sc.close();
	}

}
