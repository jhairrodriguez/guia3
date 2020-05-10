package Casos3;
import java.util.Scanner;
public class caso3 {

	public static void main(String[] args) {
		Scanner Uni = new Scanner(System.in);
		
		int c = 1, num = 0, factorial = 1;
		
		System.out.print("Ingrese numero: ");
		num = Uni.nextInt();
		
		while (c <= num) {
			factorial *= c; //factorial = factorial * c;
			c++;
			
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
	}

}
