import java. util.Scanner;

public class E544 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner (System.in);
		System.out.print("Introduzca primer n�mero:");
		int a = usuario.nextInt();
		System.out.print("Introduzca segundo n�mero:");
		int b = usuario.nextInt();
		System.out.print("Introduzca tercer n�mero:");
		int c = usuario.nextInt();
		
		
		if((a>b) && (a>c)) { //A es el mayor de todos
			System.out.println("El primer n�mero es el mayor");
		}
		else { //A no es el mayor
			
		
			if(b>c) {
				System.out.println("El segundo n�mero es el mayor");
			}
			else {
				System.out.println("El tercer n�mro es el mayor");
			}
		}		
				
	}
}
