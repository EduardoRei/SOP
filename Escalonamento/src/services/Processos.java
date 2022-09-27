package services;

import entities.Processo;

public class Processos {
	
	public static void fifo(Processo[] processos) {
		System.out.println("-----ESCALONAMENTO FIFO-----");
		int sum = 0;
		double temp = 0;
		for (int i=0; i < processos.length; i++) {
			System.out.println("Processo " + processos[i].getNome() + " executando" );
			for (int j = sum; j <= processos[i].getDuracao() + sum ; j ++) {
				System.out.println("Tempo " + j + " processando" );
			}
			if(processos[i].getTempoEntreProcesso() != null) {
				sum += processos[i].getDuracao() + processos[i].getTempoEntreProcesso();
				temp += sum;
				if(i + 1 == processos.length) {
					temp -= processos[i].getTempoEntreProcesso();
				}
			} else {
				sum += processos[i].getDuracao();
				temp += sum;
			}
			
			System.out.println("Processo " + processos[i].getNome() + " encerrado" );
			System.out.println();
		}
		double resultado = temp / processos.length ;
		System.out.println("Fim da execução , Resultado = " + String.format("%.2f", resultado));
		System.out.println();
	}
	
	public static void sjf(Processo[] processos) {
		System.out.println("-----ESCALONAMENTO SJF -----");
		int sum = 0;
		double temp = 0;
		int auxiliarDeTempo = 0;
		String auxiliarDeNome;
		for(int z = 0; z < processos.length; z ++) {
			
			for(int x = 0; x < processos.length; x ++) {
				if(processos[z].getDuracao() < processos[x].getDuracao()) {
					auxiliarDeTempo = processos[x].getDuracao();
					processos[x].setDuracao(processos[z].getDuracao());
					processos[z].setDuracao(auxiliarDeTempo);
					auxiliarDeNome = processos[x].getNome();
					processos[x].setNome(processos[z].getNome());
					processos[z].setNome(auxiliarDeNome);
				}
			}
		}
		for (int i=0; i < processos.length; i++) {
			System.out.println("Processo " + processos[i].getNome() + " executando" );
			for (int j = sum; j <= processos[i].getDuracao() + sum ; j ++) {
				System.out.println("Tempo " + j + " processando" );
			}
			if(processos[i].getTempoEntreProcesso() != null) {
				sum += processos[i].getDuracao() + processos[i].getTempoEntreProcesso();
				temp += sum;
				if(i + 1 == processos.length) {
					temp -= processos[i].getTempoEntreProcesso();
				}
			} else {
				sum += processos[i].getDuracao();
				temp += sum;
			}
			
			System.out.println("Processo " + processos[i].getNome() + " encerrado" );
			System.out.println();
		}
		double resultado = temp / processos.length ;
		System.out.println("Fim da execução , Resultado = " + String.format("%.2f", resultado));
		System.out.println();
	}
	
	public static void prioridade(Processo[] processos) {
		System.out.println("-----ESCALONAMENTO POR ORDEM DE PRIORIDADE -----");
		int sum = 0;
		double temp = 0;
		int auxiliarDePrioridade = 0;
		int auxiliarDeTempo = 0;
		String auxiliarDeNome;
		for(int z = 0; z < processos.length; z ++) {
			for(int x = 0; x < processos.length; x ++) {
				if(processos[z].getPrioridade() < processos[x].getPrioridade()) {
					auxiliarDePrioridade = processos[x].getPrioridade();
					processos[x].setPrioridade(processos[z].getPrioridade());
					processos[z].setPrioridade(auxiliarDePrioridade);
					auxiliarDeTempo = processos[x].getDuracao();
					processos[x].setDuracao(processos[z].getDuracao());
					processos[z].setDuracao(auxiliarDeTempo);
					auxiliarDeNome = processos[x].getNome();
					processos[x].setNome(processos[z].getNome());
					processos[z].setNome(auxiliarDeNome);
				}
			}
		}
		for (int i=0; i < processos.length; i++) {
			System.out.println("Processo " + processos[i].getNome() + " executando" );
			for (int j = sum; j <= processos[i].getDuracao() + sum ; j ++) {
				System.out.println("Tempo " + j + " processando" );
			}
			if(processos[i].getTempoEntreProcesso() != null) {
				sum += processos[i].getDuracao() + processos[i].getTempoEntreProcesso();
				temp += sum;
				if(i + 1 == processos.length) {
					temp -= processos[i].getTempoEntreProcesso();
				}
			} else {
				sum += processos[i].getDuracao();
				temp += sum;
			}
			
			System.out.println("Processo " + processos[i].getNome() + " encerrado" );
			System.out.println();
		}
		double resultado = temp / processos.length ;
		System.out.println("Fim da execução , Resultado = " + String.format("%.2f", resultado));
		System.out.println();
	}
	

}
	
