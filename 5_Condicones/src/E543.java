import java.util.Scanner;
public class E543 {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner (System.in);
		System.out.print("Introduzca primer n�mero:");
		int a = usuario.nextInt();
		System.out.print("Introduzca segundo n�mero:");
		int b = usuario.nextInt();
		
		int cont=0; //variable que cuenta
		
		if (a%2==0) cont=cont+1;
		if  (b%2==0) cont=cont+1; {
		System.out.println("el n�mero de pares es "+cont);
		
		}
		
	}

}
