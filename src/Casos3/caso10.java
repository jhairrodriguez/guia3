package Casos3;
import java.util.Scanner;
public class caso10 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);

				String continuar = "S", nombre_mayor = "",nombre_menor = "",empleado_tardon = "";
				float sueldo = 0, bonificacion = 0, sueldo_neto = 0, porcentaje = 0, descuento = 0;
				
				float sueldo_mayor = 0, sueldo_menor = 99999f;
				int c = 0, empleado_porcentaje = 0, mayor_tardanza = 0;
				
				while(continuar.contains("S")|| continuar.contentEquals("s")){
					c++;
					
					System.out.println("------------- R E S U L T A D O -------------");
					System.out.println("Resgistro de empleados: ("+c+")");
					
					System.out.print("Empleado: "); String nombre = sc.nextLine();
					System.out.print("Horas trabajadas: "); int horas = sc.nextInt();
					System.out.print("Tariafa por horas: "); float tarifa = sc.nextFloat();
					System.out.print("Minutos de tardanza: "); int minutos = sc.nextInt();
					sueldo = horas * tarifa;
					
					if(horas <=50) {
						bonificacion = 0;
					}
					if (horas >50 & horas <= 60) {
						bonificacion = (sueldo * 0.02f);
					}
					if (horas >60 & horas <=70) {
						bonificacion = (sueldo * 0.08f);
					}
					if (horas >70 & horas <= 80) {
						bonificacion = (sueldo * 0.13f);
					}
					if (horas >80 ) {
						bonificacion =(sueldo * 0.15f);
					}
					if (minutos <= 15) {
						descuento = 0;
					}
					if (minutos > 15 & minutos <= 30) {
						descuento = (sueldo * 0.003f) * minutos;
					}
					if (minutos > 30) {
						descuento = (sueldo * 0.05f) * minutos;
					}
					
					sueldo_neto = sueldo + bonificacion - descuento;
					
					porcentaje = (horas * 100/80);
					
					System.out.println("------------- R E S U L T A D O -------------");
					
					System.out.println("Sueldo bruto: $/" + sueldo);
					System.out.println("Bonificacion: $/" + bonificacion);
					System.out.println("Descuento: $/" + descuento);
					System.out.println("Sueldo: $/" + sueldo_neto);
					System.out.println("% Alcanzado: $/" + porcentaje);
					
					System.out.println("*********************** P R O C E S A N D O ***********************");
					System.out.print("�Nuevo empleado? [S/N]: ");
					sc.nextLine();
					continuar = sc.nextLine();
					
					System.out.println("*********************** P R O C E S A N D O ***********************");
					
					if (sueldo_neto > sueldo_mayor) {
						sueldo_mayor  = sueldo_neto;
						nombre_mayor = nombre;
					}
					if (sueldo_neto < sueldo_menor) {
						sueldo_menor = sueldo_neto;
						nombre_mayor = nombre;
					}
					if (minutos > mayor_tardanza) {
						mayor_tardanza = minutos;
						empleado_tardon = nombre;
					}
					if (porcentaje > 90) {
						empleado_porcentaje = empleado_porcentaje+1;
					}
					
					System.out.println("------------- R E S U L T A D O -------------");

					System.out.println("Numero de empleado : " + c);
					System.out.println("Sueldo neto mayo : $/" + sueldo_mayor + ", pertenece a: "+ nombre_mayor);
					System.out.println("Sueldo neto menor : $/" + sueldo_menor + ", pertenece a: " + nombre_menor);
					System.out.println("Empleado con la mator cantidad de minutos tardanza: " + empleado_tardon + "(" + mayor_tardanza + "");
					System.out.println("Cantidad de empleados con mas del 90% de la neta: $/" + empleado_porcentaje);

					}
			
			}

		}


	


