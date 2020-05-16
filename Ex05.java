package ExerciciosJava130520;

import java.util.Scanner;

public class Ex05 {
	public static void main(String args[]) {
		// Somatório sucessivo
		Scanner in = new Scanner(System.in);
		int qtd = 0;
		double num = 0, soma = 0, media = 0;
		
		while(num>=0) {
			System.out.println("Informe valor a ser acrescido à soma:\n(Para encerrar, informe um valor negativo)");
			num = in.nextDouble();
			if(num>=0) {
				soma+=num;
				qtd+=1;
				media = soma/qtd;
			}
		}
		System.out.println("Total do somatório: "+soma+"\nMédia dos valores: "+media+"\nQuantidade de valores informados: "+qtd);
	}
}
