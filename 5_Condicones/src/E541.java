import java.util.Scanner;

public class E541 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner (System.in);
		System.out.print("Introduzca primer n�mero:");
		int primerNumero = usuario.nextInt();
		System.out.print("Introduzca segundo n�mero:");
		int segundoNumero = usuario.nextInt();
		
		int a = primerNumero;
		int b = segundoNumero;
		
		if((a>0) && (b>0)) {
			System.out.println("Se cumple la condici�n");
		}
		else {
			System.out.println("No se cumple la condici�n");
		}
	}

}
