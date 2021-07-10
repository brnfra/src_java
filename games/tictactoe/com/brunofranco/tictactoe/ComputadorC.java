/*
Author: Bruno do Nascimento Franco
2020
*/
package tictactoe.com.brunofranco.tictactoe;
import java.util.Random;
public class ComputadorC extends Computador{
	//defende e ataca para ganhar o jogo

	public int jogarC(Tabuleiro tabuleiro) {
		Tabuleiro tab =new Tabuleiro();
		
		int	posicao, soma, jogadas; 
		//obj recebido na passagem
		tab=tabuleiro;
		soma=0;
		posicao=1;
		Random gerador = new Random();
		//gerando numeros aleatorios e jogadas aleatorias
		//estrategia baseada nas jogadas do player...acompanha as jogadas
				//	System.out.println(tab.mat[0][0]);
					
							
					/*tentativa de leitura das jogadas baseada nas somas*/
				jogadas=0;
						for (int i = 0; i < tab.mat.length; i++) {//linhas
							for (int k = 0; k < tab.mat.length; k++) {//colunas
								
									if(tab.mat[i][k]!=0) {
										jogadas=jogadas+1;
									}
								
								}
								
							}
						if (jogadas<3)
						{
							posicao=1+gerador.nextInt(9);//randomicos entre 1 e 9
							return posicao;
						}
						//debug
						//	System.out.print("jogadas=");
						//System.out.println(jogadas);
					
					
					//	teste diagonal principal
						for (int i = 0; i < tab.mat.length; i++) {
						soma = soma + tab.mat[i][i];
						}
						
						if (soma==2) {
								for (int i = 0; i < tab.mat.length; i++) {
									if(tab.mat[i][i]==0) {
											switch (i) {
												case 0:
													posicao =1;
													return posicao;
												case 1:
													posicao =5;
													return posicao;
												case 2:
													posicao =9;
													return posicao;
											
													}
												}
								
								
								}//for defesa
							
						}else if(soma==-2){
								for (int i = 0; i < tab.mat.length; i++) {
									if(tab.mat[i][i]==0) {
											switch (i) {
												case 0:
													posicao =1;
													return posicao;
												case 1:
													posicao =5;
													return posicao;
												case 2:
													posicao =9;
													return posicao;
											
													}
												}
								
								
								}//for ataque
							
							
							
						}

						soma = 0;
						//teste diagonal secundária
						soma= tab.mat[2][0] + tab.mat[1][1] + tab.mat[0][2];
						
						if (soma==2) {
							
							if(tab.mat[2][0]==0) {
								posicao =7;
								return posicao;
							}
									if(tab.mat[1][1]==0) {
										posicao =5;
										return posicao;
									}
											if(tab.mat[0][2]==0){
												posicao =3;
												return posicao;
											}
									// defesa
							
						}else if(soma==-2){
							
							if(tab.mat[2][0]==0) {
								posicao =7;
								return posicao;
							}
									if(tab.mat[1][1]==0) {
										posicao =5;
										return posicao;
									}
											if(tab.mat[0][2]==0){
												posicao =3;
												return posicao;
											}
									// ataque
							
						}



					soma = 0;
					//teste linhas horizontais
					for (int i = 0; i < tab.mat.length; i++) {
						soma=0;
						for (int j = 0; j < tab.mat.length; j++) {//colunas
						soma = soma + tab.mat[i][j];
						
						if (soma==2) {
							
							for (int k = 0; k < tab.mat.length; k++) {
										if(tab.mat[i][k]==0) {
											if(i==0) {
												
												switch (k) {
													case 0:
														posicao =1;
														return posicao;
													case 1:
														posicao =2;
														return posicao;
													case 2:
														posicao =3;
														return posicao;
												
														}
													}
												
											
											if(i==1) {
												
												switch (k) {
													case 0:
														posicao =4;
														return posicao;
													case 1:
														posicao =5;
														return posicao;
													case 2:
														posicao =6;
														return posicao;
												
														}
													}
												
											
											if(i==2) {
												
												switch (k) {
													case 0:
														posicao =7;
														return posicao;
													case 1:
														posicao =8;
														return posicao;
													case 2:
														posicao =9;
														return posicao;
												
														}
													}
												
											}
							
							
							}//for defesa
							
						}else if(soma==-2){
							for (int k = 0; k < tab.mat.length; k++) {
								if(tab.mat[i][k]==0) {
									if(i==0) {
										
										switch (k) {
											case 0:
												posicao =1;
												return posicao;
											case 1:
												posicao =2;
												return posicao;
											case 2:
												posicao =3;
												return posicao;
										
												}
											}
										
									
									if(i==1) {
										
										switch (k) {
											case 0:
												posicao =4;
												return posicao;
											case 1:
												posicao =5;
												return posicao;
											case 2:
												posicao =6;
												return posicao;
										
												}
											}
										
									
									if(i==2) {
										
										switch (k) {
											case 0:
												posicao =7;
												return posicao;
											case 1:
												posicao =8;
												return posicao;
											case 2:
												posicao =9;
												return posicao;
										
												}
											}
										
									}
					
					
							}//for ataque
							
				
						}//else
						
					}//colunas
						
				}//linhas horizontais




		soma = 0;
		//teste linhas verticais
		for (int j = 0; j < tab.mat.length; j++) {
			soma=0;
			for (int i = 0; i < tab.mat.length; i++) {//colunas
			    soma = soma + tab.mat[i][j];
			
						if (soma==2) {
							for (int k = 0; k < tab.mat.length; k++) {
								if(tab.mat[k][j]==0) {
									if(j==0) {
										
										switch (k) {
											case 0:
												posicao =1;
												return posicao;
											case 1:
												posicao =4;
												return posicao;
											case 2:
												posicao =7;
												return posicao;
										
												}
											}
										
									
									if(j==1) {
										
										switch (k) {
											case 0:
												posicao =2;
												return posicao;
											case 1:
												posicao =5;
												return posicao;
											case 2:
												posicao =8;
												return posicao;
										
												}
											}
										
									
									if(j==2) {
										
										switch (k) {
											case 0:
												posicao =3;
												return posicao;
											case 1:
												posicao =6;
												return posicao;
											case 2:
												posicao =9;
												return posicao;
										
												}
											}
										
									}//if ==0
							
												
							}//for defesa	
				
				
					}else if(soma==-2){
							for (int k = 0; k < tab.mat.length; k++) {
								if(tab.mat[k][j]==0) {
									if(j==0) {
										
										switch (k) {
											case 0:
												posicao =1;
												return posicao;
											case 1:
												posicao =4;
												return posicao;
											case 2:
												posicao =7;
												return posicao;
										
												}
											}
										
									
									if(j==1) {
										
										switch (k) {
											case 0:
												posicao =2;
												return posicao;
											case 1:
												posicao =5;
												return posicao;
											case 2:
												posicao =8;
												return posicao;
										
												}
											}
										
									
									if(j==2) {
										
										switch (k) {
											case 0:
												posicao =3;
												return posicao;
											case 1:
												posicao =6;
												return posicao;
											case 2:
												posicao =9;
												return posicao;
										
												}
											}
										
									}
					
					
							}//for ataque	
							
				
			
						}
						
						
					}//coluna
			
			
				}//linhas verticais

				
					
						
			

				//jogada docomputador qual nivel???
				posicao=1+gerador.nextInt(9);//randomicos entre 1 e 9
				//System.out.print("posicao:");
				//System.out.println(posicao);
				return posicao;
			
	}

}
