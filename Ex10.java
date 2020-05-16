package ExerciciosJava130520;

import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[][] n1 = new int [4][6];
		int[][] n2 = new int [4][6];
		int[][] m1 = new int [4][6];
		int[][] m2 = new int [4][6];

		// Formando as matrizes
		// Matriz N1
		System.out.println("Construindo matriz N1[4][6]\n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				n1[linha][coluna] = in.nextInt();
			}
		}
		
		// Matriz N2
		System.out.println("\nConstruindo matriz N2[4][6]\n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				n2[linha][coluna] = in.nextInt();
			}
		}
		
		// Matriz M1
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				m1[linha][coluna] = n1[linha][coluna]+n2[linha][coluna];
			}
		}
		
		// Matriz M2
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				m2[linha][coluna] = n1[linha][coluna]-n2[linha][coluna];
			}
		}
		
		// Escrevendo as matrizes
		// Matriz N1
		System.out.println("\nMatriz N1 \n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t %d \t", n1[linha][coluna]);
			}
			System.out.println();
		}
		
		// Matriz N2
		System.out.println("\nMatriz N2 \n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t %d \t", n2[linha][coluna]);
			}
			System.out.println();
		}
		
		// Matriz M1
		System.out.println("\nMatriz M1 \n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t %d \t", m1[linha][coluna]);
			}
			System.out.println();
		}
		
		// Matriz M2
		System.out.println("\nMatriz M2 \n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t %d \t", m2[linha][coluna]);
			}
			System.out.println();
		}
	}
}
