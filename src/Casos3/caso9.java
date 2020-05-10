package Casos3;

import java.util.Scanner;

public class caso9 {
	public static void main(String[] args) {
		Scanner Uni = new Scanner(System.in);
		
		String n,e,cont="S", ma="",pra="";
		float mp=0,mnp=20,pr=0,pa=0;
		int c=0,cs=0,sic=0;
		
	 {
			c++;;
			System.out.println("=============");
			System.out.println("Registro"+c+"i");
			System.out.println("===============");
			
			System.out.print("Nombre del alumno: ");
			n = Uni.nextLine();
			System.out.print("Nota 1: ");
			int n1=Uni.nextInt();
			System.out.print("Nota 2: ");
			int n2=Uni.nextInt();
			System.out.print("Nota 3: ");
			int n3=Uni.nextInt();
			System.out.print("Asistencia [1-12] ");
			float as=Uni.nextInt();
			
			pr= ((n1*0.2f)+(n2*0.3f)+(n3*0.5f));
			pa= (as*100/12);
			
			if(pr>=13 & pa>=70){
				e= "Obtiene certificado.";
				cs=cs+1;
			}
			else {
				e= "Sin certificado.";
				sic++;
				
			}
			if(pr>mnp) {
				mnp=pr;
				ma=n;
				
			}
			
			System.out.println("========");
			System.out.println("RESULTADOS");
			System.out.println("========");
			
			System.out.println("Promedio: "+pr);
			System.out.println("Asistencia: "+pa+"%");
			System.out.println("Estado: "+e);
			System.out.println("=================");
			System.out.println("¿Registrar otro? [S/N] ");
			System.out.println("=================");
			Uni.hasNextLine();
			cont = Uni.nextLine();
		}
		System.out.println("========");
		System.out.println("RESUMEN");
		System.out.println("========");
		
		System.out.println("Numero de alumnos: "+c);
		System.out.println("Mayor promedio: "+mp+", pertenece a : "+pra);
		System.out.println("Menor promedio: "+mnp+", pertenece a :+pra");
		System.out.println("Numero de alumnos certificados: "+cs);
		System.out.println("Numero de alumnos sin certificado: "+sic);
	}

}


