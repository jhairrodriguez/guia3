package Casos3;
import java.util.Scanner;
public class caso6 {

	public static void main(String[] args) {
		Scanner Uni = new Scanner(System.in);
		
		String Continuar = "S", nombre = "", estado = "";
		int edad = 0, c = 0, c_aptos = 0;
		
		while (Continuar.contentEquals("S") || Continuar.equals("s"))
			c++;
			System.out.println("Registro N " + c);
			System.out.println("=============");
			
			System.out.print("¿Desea continuar <S/N>: ");
			Continuar = Uni.nextLine();
	}

}
