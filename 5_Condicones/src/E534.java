import java.util.Scanner;

public class E534 {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		System.out.print("Introduzca número:");
		int Numero = usuario.nextInt();
		
		int x = Numero;
			if(x%3 == 0) {
				System.out.println("Es múltiplo de 3");
			}
			else {
				System.out.println("El numero no es multiplo");
			}
	}

}
