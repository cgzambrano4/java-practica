package mundo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Saludar");
		System.out.println("2. Salir");
		
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
			System.out.println("Hola usuario");
		}
	}
}
