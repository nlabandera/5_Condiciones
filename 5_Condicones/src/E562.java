import java.util.Scanner;

public class E562 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner (System.in);
		
		System.out.print("Introduzca n�mero:");
		int a = usuario.nextInt();
		
		System.out.print("Introduzca n�mero:");
		int b = usuario.nextInt();
		
	
		
		int menor = a > b ? b : a;
		
		System.out.print("El menor es: ");
		System.out.println(menor);
		
		
	}

}
