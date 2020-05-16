package ExerciciosJava130520;

import java.util.Scanner;

public class Ex03 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		// Contagem de 233 a 456
		int i = 233;
		System.out.println("Contagem:");
		while(i<=456) {
			if(i>=300 && i<=400) {
				System.out.println(i);
				i+=3;
			}else {
				System.out.println(i);
				i+=5;
			}
		}
	}
}
