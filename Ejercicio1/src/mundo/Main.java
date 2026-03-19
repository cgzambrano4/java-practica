package mundo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la edad: ");
		int edad = sc.nextInt();
		
		if (edad >= 18) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Menor de edad");
		}
	}
}
