import java.util.Scanner;

public class E533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner usuario = new Scanner(System.in);
		System.out.print("Introduzca primer n�mero:");
		int a = usuario.nextInt();
		System.out.print("Introduzca segundo n�mero:");
		int b = usuario.nextInt();
		
		
			if(a > b) {
				System.out.println("El primer numero es mayor que el segundo");
			}
			else {
				System.out.println("El primer numero es menor que el segundo");
			}
			
		
	}

}
