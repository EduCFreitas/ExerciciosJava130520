package ExerciciosJava130520;

import java.util.Scanner;

public class Ex06 {
	public static void main(String args[]) {
		// Pesquisa temperamento
		Scanner in = new Scanner(System.in);
		int i, idade, sexo, opcao, pCalma=0, mNervosa=0, hAgressivo=0, pNervosaAcima40=0, pCalmaAbaixo18=0;
		
		for(i=0; i<150; i++) {
			System.out.println("Informe a idade: ");
			idade = in.nextInt();
			System.out.println("\nInforme o sexo:\n1- Feminino\n2- Masculino");
			sexo = in.nextInt();
			System.out.println("\nInforme o seu temperamento:\n1- Calma(o)\n2- Nervosa(o)\n3- Agressiva(o)");
			opcao = in.nextInt();
			if(opcao==1) {
				pCalma++;
			}
			if(sexo==1 && opcao==2) {
				mNervosa++;
			}
			if(sexo==2 && opcao==3) {
				hAgressivo++;
			}
			if(opcao==2 && idade>40) {
				pNervosaAcima40++;
			}
			if(opcao==1 && idade<18) {
				pCalmaAbaixo18++;
			}
		}
		System.out.println("Número de pessoas calmas: "+pCalma);
		System.out.println("Número de mulheres nervosas: "+mNervosa);
		System.out.println("Número de homens agressivos: "+hAgressivo);
		System.out.println("Número de pessoas nervosas acima dos 40 anos: "+pNervosaAcima40);
		System.out.println("Número de pessoas calmas abaixo dos 18 anos: "+pCalmaAbaixo18);
	}
}
