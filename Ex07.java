package ExerciciosJava130520;

import java.util.Scanner;

public class Ex07 {
	public static void main(String args[]) {
		// Cálculo do valor de E
		Scanner in = new Scanner(System.in);
		int i = 0, num;
		double fat = 0, res = 0;
		System.out.println("Informe um número inteiro: ");
		num = in.nextInt();
		while(i<=num) {
			if(i==0) {
				res+=1;
				fat = 1;
			}else {
				fat*=i;
				res+=(1/fat);
			}
			i++;
		}
		System.out.println("E = "+res);
	}
}
