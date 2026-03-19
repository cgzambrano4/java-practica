package mundo;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Ana");
		nombres.add("Luis");
		
		for (String n : nombres) {
			System.out.println(n);
		}
	}
}
