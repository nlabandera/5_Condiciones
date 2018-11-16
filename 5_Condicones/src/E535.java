import java.util.Scanner;
public class E535 {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		System.out.print("Introduzca número:");
		int Numero = usuario.nextInt();
		
		int x = Numero;
		if(x%2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("El numero es impar");
		}
	}

}
