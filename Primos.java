package NumerosPrimos;
import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);

		boolean continuar = true;
		
		do {
		    int numeroPrimo;
			int numeDivisores = 0;
			System.out.print("DIGITE UM NÚMERO: ");
			numeroPrimo = s.nextInt();
			
			
			for(int i =1; i <=numeroPrimo; i++) {
				if(numeroPrimo % i ==0) {
					numeDivisores ++;
				}
				
			}
			
			if( numeDivisores  == 2) {
				System.out.println("O número e Primo");
				
			}else {
				System.out.println("O número não e Primo");
			}

			
		}while(continuar);
		
	
	}

}
