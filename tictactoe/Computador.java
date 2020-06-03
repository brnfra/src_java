/*
Author: Bruno do Nascimento Franco
2020
*/
package com.brunofranco.tictactoe;


//nesta classe resume a estrategia por nivel e a posi��o da jogada calculada

public class Computador {
	
	private static int nivel;
	private static int jogada;
	
	public static int getNivel() {
		return nivel;
	}
	
	public  void setNivel(int opcao) {
		nivel=opcao;
		
	}

	public int getJogada() {
		return jogada;
	}
	
	public static void setJogada(int posicao) {
	jogada=posicao;
		
	}
	
	//computador chama esse metodo para criar o obj e jogar de acordo com o nivel
	private static int cpuJogar(Tabuleiro tabuleiro) {
		Tabuleiro tab =new Tabuleiro();
		tab=tabuleiro;
		int cpu, posicao;
		cpu=getNivel();
		//gera posição dependendo do nivel
	switch (cpu) {
	case 1:
		ComputadorA compA = new ComputadorA();
		posicao=compA.jogarA(tab);
		return posicao;
		
	case 2:
		ComputadorB compB = new ComputadorB();
		posicao=compB.jogarB(tab);
		return posicao;
	case 3:
		ComputadorC compC = new ComputadorC();
		posicao=compC.jogarC(tab);
		return posicao;

		}
	
	return -1;
	
	}
	
	
	public static int jogar(Tabuleiro tabuleiro) {
	Tabuleiro tab =new Tabuleiro();
	
	//obj recebido na passagem
	tab=tabuleiro;
	boolean valido=false;
	int	posicao=1;//inicializando a variavelposicao
	posicao=cpuJogar(tab);
	//cpuJogar(tab);
	valido=tab.jogar(-1,posicao);
	while(posicao<1 && posicao>9 || !valido) {
		
		if(!valido) {
		
			posicao=1;
			posicao=cpuJogar(tab);
			//pos=teclado.nextInt();
			valido=tab.jogar(-1,posicao);
			
			}
								
		}
	setJogada(posicao);
	/*
	System.out.print("(Computador)Jogou posi��o:(");
	System.out.println(posicao);
	System.out.print(")");
	System.out.println();
	*/
		return posicao;
	}//metodo jogar computador
	
	
	
}
