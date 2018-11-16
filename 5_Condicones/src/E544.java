import java. util.Scanner;

public class E544 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner (System.in);
		System.out.print("Introduzca primer número:");
		int a = usuario.nextInt();
		System.out.print("Introduzca segundo número:");
		int b = usuario.nextInt();
		System.out.print("Introduzca tercer número:");
		int c = usuario.nextInt();
		
		
		if((a>b) && (a>c)) { //A es el mayor de todos
			System.out.println("El primer número es el mayor");
		}
		else { //A no es el mayor
			
		
			if(b>c) {
				System.out.println("El segundo número es el mayor");
			}
			else {
				System.out.println("El tercer númro es el mayor");
			}
		}		
				
	}
}
