/*
Author: Bruno do Nascimento Franco
2020
*/
package com.brunofranco.tictactoe;
import java.util.Random;

public class ComputadorB extends Computador{
	//faaz algumas jogadas especificas de defesa

	public int jogarB(Tabuleiro tabuleiro) {
		Tabuleiro tab =new Tabuleiro();
		
		//obj recebido na passagem
		tab=tabuleiro;
		int posicao;
		posicao=1;
		Random gerador = new Random();
		//gerando numeros aleatorios e jogadas aleatorias
		
	//1
	if(tab.mat[0][0]==1 && tab.mat[0][1]==1 && tab.mat[0][2]==0) {posicao=3;return posicao;}
	if(tab.mat[0][0]==1 && tab.mat[1][0]==1 && tab.mat[2][0]==0) {posicao=7;return posicao;}
	//3
	if(tab.mat[0][2]==1 && tab.mat[0][1]==1 && tab.mat[0][0]==0) {posicao=1;return posicao;}
	if(tab.mat[0][2]==1 && tab.mat[1][2]==1 && tab.mat[2][2]==0) {posicao=9;return posicao;}
	//7
	if(tab.mat[2][0]==1 && tab.mat[1][0]==1 && tab.mat[0][0]==0) {posicao=1;return posicao;}
	if(tab.mat[2][0]==1 && tab.mat[2][1]==1 && tab.mat[2][2]==0) {posicao=9;return posicao;}
	//9
	if(tab.mat[2][2]==1 && tab.mat[0][2]==1 && tab.mat[0][2]==0) {posicao=3;return posicao;}
	if(tab.mat[2][2]==1 && tab.mat[2][1]==1 && tab.mat[2][0]==0) {posicao=7;return posicao;}
		
	//5+
	if(tab.mat[1][1]==1 && tab.mat[0][1]==1 && tab.mat[2][1]==0) {posicao=8;return posicao;}
	if(tab.mat[1][1]==1 && tab.mat[2][1]==1 && tab.mat[0][1]==0) {posicao=2;return posicao;}
	if(tab.mat[1][1]==1 && tab.mat[1][2]==1 && tab.mat[1][0]==0) {posicao=4;return posicao;}
	if(tab.mat[1][1]==1 && tab.mat[1][0]==1 && tab.mat[1][2]==0) {posicao=6;return posicao;}
	
	//5x
	if(tab.mat[1][1]==1 && tab.mat[0][0]==1 && tab.mat[2][2]==0) {posicao=9;return posicao;}
	if(tab.mat[1][1]==1 && tab.mat[2][0]==1 && tab.mat[0][2]==0) {posicao=3;return posicao;}
	if(tab.mat[1][1]==1 && tab.mat[0][2]==1 && tab.mat[2][0]==0) {posicao=7;return posicao;}
	if(tab.mat[1][1]==1 && tab.mat[2][2]==1 && tab.mat[0][0]==0) {posicao=1;return posicao;}
	
			//jogada docomputador qual nivel???
			posicao=1+gerador.nextInt(9);//randomicos entre 1 e 9
			//System.out.print("posicao:");
			//System.out.println(posicao);
	
				//jogada docomputador qual nivel???
				posicao=1+gerador.nextInt(9);//randomicos entre 1 e 9
				return posicao;
	}

}
