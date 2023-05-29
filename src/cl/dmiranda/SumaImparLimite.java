package cl.dmiranda;
import java.util.*;
public class SumaImparLimite {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el límite inferior: ");
		int min = sc.nextInt();
		
		System.out.println("Ingrese el límite superior: ");
		int max = sc.nextInt();
		int sumaimp = 0;
		
		for (int i = min; i <= max; i++) {
			if (i%2!= 0) {
				sumaimp += i;
			}
		}
		System.out.printf("La suma de los números impares entre %d y %d es %d.", min, max, sumaimp);
		sc.close();

	}

}
