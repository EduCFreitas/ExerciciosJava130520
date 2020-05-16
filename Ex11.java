package ExerciciosJava130520;

import java.util.Scanner;

public class Ex11 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[][] m = new int[5][5];
		int[] sl = new int[5];
		int[] sc = new int[5];
		
		System.out.println("Construindo matriz M[5][5]\n");
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				m[linha][coluna] = in.nextInt();
				sc[coluna]+=m[linha][coluna];
				sl[linha]+=m[linha][coluna];
			}
		}
		
		System.out.println("\nMatriz M \n");
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				System.out.printf("\t %d \t", m[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println("\nSoma das colunas: ");
		for(int i=0; i<5; i++) {
			System.out.println("Coluna "+(i+1)+": "+sc[i]);
		}
		System.out.println("\nSoma das linhas: ");
		for(int i=0; i<5; i++) {
			System.out.println("Linha "+(i+1)+": "+sl[i]);
		}
	}
}
