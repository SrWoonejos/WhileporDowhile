//2//DesafíoLATAM(2023),desafío guiado nro.2 - Ciclos, SumaPares en nros Z
package cl.dmiranda;
import java.util.*;
public class SumaPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);           
		int nro = 0;
		boolean validInput = false;
		        while (!validInput) {
		            System.out.println("Ingrese un número: ");
		            if (sc.hasNextInt()) {
		                nro = sc.nextInt();
		            if (nro >= 0) {
		                    validInput = true;
		            }
		            } else {
		                System.out.println("¡Error!. Solo debes ingresar nros.");
		                sc.next();
		            }
		        }
		        int i = 0;		        		;
		        do {
		            System.out.println(i * 2);
		            i++;
		        } while (i < nro);
		        sc.close();
	}
}
