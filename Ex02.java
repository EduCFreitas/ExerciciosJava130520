package ExerciciosJava130520;

import java.util.Scanner;

public class Ex02 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		//N�meros de 1000 a 1999 que s�o divis�veis por 11 ou com resto 5
		int i;
		System.out.println("Os n�meros de 1000 a 1999 que s�o divis�veis por 11 ou com resto 5 s�o:\n");
		for(i=1000; i<=1999; i++) {
			if(i%11==0 || i%11==5) {
				System.out.println(i);
			}
		}
	}
}
