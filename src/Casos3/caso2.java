package Casos3;
import java.util.Scanner;
public class caso2 {

	public static void main(String[] args) {
		Scanner Uni = new Scanner(System.in);
		
		int c = 1, num = 0, suma = 0;
		
		System.out.print("Ingrese numero: ");
		num = Uni.nextInt();
		
		while(c <= num) {
			suma += c; //suma = suma +c;
			c++;
		}
		
		System.out.println("La sumatoria de " + num + " es: " + suma);
		}

	}


