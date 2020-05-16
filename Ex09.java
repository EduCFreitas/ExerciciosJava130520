package ExerciciosJava130520;

import java.util.Scanner;

public class Ex09 {
	public static void main(String args[]) {
		// Sistema disciplinas X e Y
		Scanner in = new Scanner(System.in);
		int[] matriculas = new int[1000];
		int[] disciplinas = new int[1000];
		int cont = 0, numMatricula, i;
		boolean cadastro = true, cursaAmbas = false;
		
		while(cadastro==true || cont<10000) {
			System.out.println("Informe o número do matrícula:\n(Informe valor negativo para encerrar cadastro) ");
			numMatricula = in.nextInt();
			if(numMatricula<0) {
				break;
			}
			matriculas[numMatricula] = numMatricula;
			System.out.println("Informe a disciplina cursada:\nX: Digite 1\nY: Digite 2\nAmbas: Digite 3 ");
			disciplinas[numMatricula] = in.nextInt();
			if(disciplinas[numMatricula]==3) {
				cursaAmbas=true;
			}
			cont++;
		}
		System.out.println("\nNúmero de matrícula dos alunos que cursam as duas matérias simultaneamente:");
		if(cursaAmbas==false) {
			System.out.println("Nenhum aluno cursa simultaneamente as disciplinas X e Y");
		}else {
			for(i=0; i<matriculas.length; i++) {
				if(disciplinas[i]==3) {
					System.out.println(matriculas[i]);
				}
			}
		}
	}
}
