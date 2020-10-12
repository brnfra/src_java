/*
Author: Bruno do Nascimento Franco
2020
*/
package com.brunofranco.tictactoe;
import java.util.Random;
public class ComputadorA extends Computador{
	//joga numeros aleatorios
	
	public int jogarA(Tabuleiro tabuleiro) {
		Tabuleiro tab =new Tabuleiro();
		//obj recebido na passagem
		tab=tabuleiro;
		int posicao;
		posicao=1;
		Random gerador = new Random();
		//gerando numeros aleatorios e jogadas aleatorias
		
		//jogada docomputador qual nivel???
		posicao=1+gerador.nextInt(9);//randomicos entre 1 e 9
		return posicao;
	}

}
