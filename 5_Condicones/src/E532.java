
import java.util.Scanner;

public class E532 {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		System.out.print("Introduzca número:");
		int Numero = usuario.nextInt();
		
		int x = Numero; 
				if(x == 0) {
					System.out.println("El número es 0");
				}
				else {
					if(x > 0) {System.out.println("El número es positivo");
					}
						
					else {
						System.out.println("El número es negativo");
						}
					}
				}
	}


