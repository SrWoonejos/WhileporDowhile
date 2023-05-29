//3//DesafíoLATAM(2023),desafío guiado nro.2 - Ciclos, SoloImpares
package cl.dmiranda;
import java.util.Scanner;
public class SoloImpares {

	public static void main(String[] args) {
		int sumaimp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i += 2) {
			sumaimp += i;
		}
		System.out.printf("La suma de los números impares desde 1 hasta %d es %d.\n", n, sumaimp);
		sc.close();

	}

}
