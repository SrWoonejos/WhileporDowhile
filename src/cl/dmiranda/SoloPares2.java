
package cl.dmiranda;
import java.util.*;
public class SoloPares2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);           
		 
		int nro = 0;
		boolean validInput = false;
		  
		while (!validInput) {
		System.out.println("Ingrese un número: ");
		
		if (sc.hasNextInt()) {
		    nro = sc.nextInt();
		  if (nro >= 2) {
		      validInput = true;
		      }
		} else {
		  System.out.println("¡Error!. Solo debes ingresar nros.");
		  sc.next();
		}
		}
		System.out.println("El resultado es: ");
		int i = 1;		        		
		do {
		System.out.println(i * 2);
	    i++;
		} while (i < nro);
		sc.close();
	}
}
