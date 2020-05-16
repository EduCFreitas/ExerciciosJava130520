package ExerciciosJava130520;

import java.util.Scanner;

public class Ex02 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		//Números de 1000 a 1999 que são divisíveis por 11 ou com resto 5
		int i;
		System.out.println("Os números de 1000 a 1999 que são divisíveis por 11 ou com resto 5 são:\n");
		for(i=1000; i<=1999; i++) {
			if(i%11==0 || i%11==5) {
				System.out.println(i);
			}
		}
	}
}
