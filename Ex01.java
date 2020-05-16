package ExerciciosJava130520;

import java.util.Scanner;

public class Ex01 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		// Soma dos ímpares múltiplos de 3, entre 1 e 500
		int i, soma = 0;
		for(i=1; i<=500; i++) {
			if(i%2!=0 && i%3==0) {
				soma += i;
			}
		}
		System.out.println("A soma dos números ímpares, múltiplos de 3 e menores que 500 é: " + soma);
	}
}
