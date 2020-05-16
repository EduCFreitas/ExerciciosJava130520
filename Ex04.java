package ExerciciosJava130520;

import java.util.Scanner;

public class Ex04 {
	public static void main(String args[]) {
		// Cálculo de média ponderada de 5 alunos
		Scanner in = new Scanner(System.in);
		String nome;
		int i = 0;
		double notaA = 0, notaB = 0, media = 0;
		
		while(i<=5) {
			System.out.println("Entre com o nome do aluno: ");
			nome = in.next();
			
			while(notaA==0) {
				System.out.println("Entre com a nota A: ");
				notaA = in.nextDouble();
				if(notaA<0 || notaA>10) {
					notaA = 0;
				}
			}
			while(notaB==0) {
				System.out.println("Entre com a nota B: ");
				notaB = in.nextDouble();
				if(notaB<0 || notaB>10) {
					notaB = 0;
				}
			}
			
			media = (notaA + notaB*2)/3;
			System.out.println("O aluno "+nome+" tem uma média "+media+".");
			notaA = 0;
			notaB = 0;
			i++;
		}
	}
}
