import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String args[]){
		Scanner teclado=new Scanner (System.in);
		int n1,n2;
		
		System.out.print("Introduzca numero entero: ");		
		n1=teclado.nextInt();
		System.out.print("Introduzca otro numero entero: ");		
		n2=teclado.nextInt();
		
		System.out.printnl("El resultado es: "+(n1+n2));
				
	}

}

