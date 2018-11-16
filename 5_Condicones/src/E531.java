
import java.util.Scanner;

public class E531 {

	public static void main(String[] args) {
		// Condicion simple
		
		Scanner usuario = new Scanner(System.in);
		System.out.print("Introduzca número:");
		int Numero = usuario.nextInt();
		
		int x = Numero;
		
		if(x == 12) {
			System.out.println("El número es correcto");
		}
		else {
			System.out.println("El número es incorrecto");
		}
	}
}
