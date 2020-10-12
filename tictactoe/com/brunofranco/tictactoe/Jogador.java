/*
Author: Bruno do Nascimento Franco
2020
*/
package com.brunofranco.tictactoe;
import java.util.Scanner;
//import com.brunofranco.tictactoe.Janela;

public class Jogador {
	static Scanner teclado = new Scanner(System.in);
	private String nome;
	private String tipo;
	private static int jogada;
	
	public String getNome() {
		return this.nome;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	//mouse event
	public static void setJogada(int posicao) {
		jogada=posicao;
	}
	public static int getJogada() {
		return jogada;
	}
	public static void jogar(int player, int pos, Tabuleiro tabuleiro) {
		
		 boolean valido=false;	//verifica se a jogada é válida
		 Tabuleiro tab =new Tabuleiro();
		//obj recebido na passagem
		tab=tabuleiro;
		
		int posicao=Janela.getJogada();
		/*
		System.out.print("Jogue na Pos[1-9] no tabuleiro: ");
		int posicao = teclado.nextInt();
	    System.out.print("Sua jogada :Pos(");
	    System.out.print(posicao);
	    System.out.println(")");
	    */
		//valido=tab.jogar(1,posicao);//registra ajogada e retorna se foi válida
		valido=tab.jogar(1,posicao);//registra ajogada e retorna se foi válida
		//filtro para nova inserção de de posição correta ou jogada válida
		
		
		while(posicao<1 && posicao>9 || !valido) {
			//loop caso inserir dado invalido
			if(!valido) {
				 //System.out.print(posicao);
				    
				posicao=getJogada();
				//posicao=teclado.nextInt();
				
				valido=tab.jogar(1,posicao);
				}
													
		}//filtro jogada humano
			
		/*
		 System.out.print("Sua jogada :Pos(");
		    System.out.print(posicao);
		    System.out.println(")");
		
		*/
		setJogada(posicao);
		
	}
}
