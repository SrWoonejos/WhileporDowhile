package cl.dmiranda;
import java.util.*;
public class SecuenciaFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el n° que deseas ver de la secuencia Fibonacci: ");
        int n = sc.nextInt();
        
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < n; i++) {   
            fib[i] = fib[i-1] + fib[i-2];         
        }
        
        System.out.println("Los " + n + " primeros números de la serie de Fibonacci son: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        sc.close();
	}
}
