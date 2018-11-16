import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		Scanner usuario = new Scanner (System.in);
		System.out.print("Introduzca nota:");
		int nota = usuario.nextInt();
		
		switch(nota) {
		case 1:
        case 2: 
        case 3:
        case 4:
        	System.out.println( "Suspenso" ); 
        	break;
        case 5: System.out.println( "Suficiente" ); 
        	break;
        case 6: System.out.println( "Bien" ); 
        	break;
        case 7: 
        case 8: System.out.println( "Notable" ); 
        	break;
        case 9: 
        case 10:System.out.println( "Sobresaliente" ); 
        	break;
		}
		

	}

}
