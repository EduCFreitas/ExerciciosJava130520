package ExerciciosJava130520;

import java.util.Scanner;

public class Ex08 {
	public static void main(String args[]) {
		// Pesquisa prefeitura
		Scanner in = new Scanner(System.in);
		int i, numPessoas = 5;
		double salario, numFilhos, somaSalario = 0, mediaSalario, somaFilhos = 0, mediaFilhos, maiorSalario = 0, qtdSalariosAbaixo100 = 0, percentualSalarioAbaixo100;
		for(i=0; i<numPessoas; i++) {
			System.out.println("Informe o seu salário: ");
			salario = in.nextDouble();
			System.out.println("Informe o número de filhos: ");
			numFilhos = in.nextDouble();
			somaSalario+=salario;
			somaFilhos+=numFilhos;
			if(salario>maiorSalario) {
				maiorSalario = salario;
			}
			if(salario<100) {
				qtdSalariosAbaixo100++;
			}
		}
		mediaSalario = somaSalario/numPessoas;
		mediaFilhos = somaFilhos/numPessoas;
		percentualSalarioAbaixo100 = (qtdSalariosAbaixo100/numPessoas)*100;
		System.out.println("A média de salário da população é: "+mediaSalario);
		System.out.println("A média de filhos da população é: "+mediaFilhos);
		System.out.println("O maior salário é: "+maiorSalario);
		System.out.println("A porcentagem de pessoas com salário até R$100,00 é: "+percentualSalarioAbaixo100+"%");
	}
}
