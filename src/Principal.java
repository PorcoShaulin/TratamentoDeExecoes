import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {	
	

	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2;
		double media;
		try {
		System.out.println("digite o primeiro valor");
		n1 = leia.nextInt();
		
			System.out.println("digite o segundo valor");
			n2 = leia.nextInt();
			media = n1/n2;
			
		}catch (InputMismatchException e) {
			System.out.println("vdc coloco um valor errado. " + "por exemplo, no lugar de um numero, vc colocous caractere")
			;
		}catch (ArithmeticException e) {
			System.out.println(" vc tentou fz uma divisao impossivel.");
		}
}
}



		         
	

                                     