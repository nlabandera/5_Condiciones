import java.util.Scanner;

public class E561 {

	public static void main(String[] args) {
		

		Scanner usuario = new Scanner (System.in);
		System.out.print("Introduzca número de número:");
		int x = usuario.nextInt();
		int par;
		
		par = x % 2 == 0 ? 1: 0;
		System.out.print( "\"par\" vale... " ); 
        System.out.println( par );
		
		
	}

}
