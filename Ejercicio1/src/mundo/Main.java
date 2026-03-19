package mundo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Hola " + nombre);
	}
}
