package application;

import java.util.Scanner;

import entities.Processo;
import services.Processos;

public class Program {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Insira o numero de processos: ");
			int nProcessos = sc.nextInt();
			Processo[] processos = new Processo[nProcessos];
			
			System.out.println("Existe tempo entre os processos? (s/n)");
			char resp = sc.next().charAt(0);
			if(resp == 's') {
				System.out.println("Quanto tempo?");
				int tempoEntreProcessos = sc.nextInt();
				for(int i=0; i< nProcessos; i++) {
					sc.nextLine();
					System.out.println("Insira o nome do Processo " );
					String nome = sc.nextLine();
					System.out.println("Insira a duração do Processo " );
					int duracao = sc.nextInt();
					System.out.println("Insira a prioridade (1 - 5): ");
					int prioridade = sc.nextInt();
					if(prioridade > 5 || prioridade < 1) {
						while(prioridade > 5 || prioridade < 1 ) {
							System.out.println("O valor da prioridade deve ser entre (1-5)! Insira novamente: ");
							prioridade = sc.nextInt();
						}
					}
					processos[i] = new Processo(nome, duracao, prioridade, tempoEntreProcessos);
				}
			} else {
				for(int i=0; i< nProcessos; i++) {
					sc.nextLine();
					System.out.println("Insira o nome do Processo # " );
					String nome = sc.nextLine();
					System.out.println("Insira a duração do Processo ");
					int duracao = sc.nextInt();
					System.out.println("Insira a prioridade (1 - 5): ");
					int prioridade = sc.nextInt();
					if(prioridade > 5 || prioridade < 1) {
						while(prioridade > 5 || prioridade < 1 ) {
							System.out.println("O valor da prioridade deve ser entre (1-5)! Insira novamente: ");
							prioridade = sc.nextInt();
						}
					}
					processos[i] = new Processo(nome, duracao, prioridade);
				}
			}
			Processos.fifo(processos);
			Processos.sjf(processos);
			Processos.prioridade(processos);

			sc.close();

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		} 		
	}

}
