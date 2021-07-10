/*
Author: Bruno do Nascimento Franco
2020
*/
package tictactoe.com.brunofranco.tictactoe;

public class Tabuleiro {
	public int mat[][] = new int[3][3];
	private int jogador;//get set
	//1 - X - Jogador humano
	//-1 - O - Computador
	//0 - Espa�o vazio
	
	public void inicializar(){

/*
		//System.out.println("Jogue de acordo com a posição no TABULEIRO!");
		//System.out.println();
	*/	
	for (int i = 0; i < mat.length; i++) {//linhas
		for (int j = 0; j < mat.length; j++) {//colunas
			this.mat[i][j]=0;
		}//coluna
	}//linha
	
	for (int i = 0; i < mat.length; i++) {//linhas
		for (int j = 0; j < mat.length; j++) {//colunas
			if(this.mat[i][j]==0) {
				////System.out.print("- ");
				
				  if(this.mat[i][j]==0) {
				   if(i==0 && j==0){
                                       ////System.out.print(" 1-");
                                   }
														
			}
			   if(mat[i][j]==0) {
				   if(i==0 && j==1) {
                                       ////System.out.print("|-2-|");
                                   }
				  					
			}
			   if(mat[i][j]==0) {
				   if(i==0 && j==2) {
                                       ////System.out.print("-3");
                                   }
				 
			}
			   if(mat[i][j]==0) {
				 //  if(i==1 && j==0) //System.out.print(" 4-");
				  
			}
			   if(mat[i][j]==0) {
				 //  if(i==1 && j==1) //System.out.print("|-5-|");
				   
			}
			   if(mat[i][j]==0) {
				  // if(i==1 && j==2) //System.out.print("-6");
				  
			}
			   if(mat[i][j]==0) {
				  // if(i==2 && j==0) //System.out.print(" 7-");
				
			}
			   if(mat[i][j]==0) {
				  // if(i==2 && j==1) //System.out.print("|-8-|");
				   
			}
			   if(mat[i][j]==0) {
				  // if(i==2 && j==2) //System.out.print("-9");
				 
			}
			
			
				
				
			}
			
			}//coluna
		if(i < 2) {
			/*
			//System.out.println();
			//System.out.println("---+---+---");
			*/
			}else {
				
				////System.out.println();
			}
		
		
		}//linha
	////System.out.println();
	
	}//FUNÇÃO
	
	
	///ver tabela
	public void visualizar() {
		//System.out.println();
		//System.out.println("TABULEIRO ");
		//System.out.println();
		for (int i = 0; i < mat.length; i++) {//linhas
			for (int j = 0; j < mat.length; j++) {//colunas
				if(this.mat[i][j]==1) {
					
					 
					if(i==0 && j==0) { //System.out.print(" X-");
																
					}
					   if(mat[i][j]==1) {
						  // if(i==0 && j==1) //System.out.print("|-X-|");
						  					
					}
					   if(mat[i][j]==1) {
						   //if(i==0 && j==2) //System.out.print("-X");
						 
					}
					   if(mat[i][j]==1) {
						 //  if(i==1 && j==0) //System.out.print(" X-");
						  
					}
					   if(mat[i][j]==1) {
						  // if(i==1 && j==1) //System.out.print("|-X-|");
						   
					}
					   if(mat[i][j]==1) {
						  // if(i==1 && j==2) //System.out.print("-X");
						  
					}
					   if(mat[i][j]==1) {
						 //  if(i==2 && j==0) //System.out.print(" X-");
						
					}
					   if(mat[i][j]==1) {
						 //  if(i==2 && j==1) //System.out.print("|-X-|");
						   
					}
					   if(mat[i][j]==1) {
						 //  if(i==2 && j==2) //System.out.print("-X");
						 
					}
					
				
				}else if(this.mat[i][j]==-1) {
					
					 
					if(i==0 && j==0) { //System.out.print(" O-");
																
					}
					   if(mat[i][j]==-1) {
						//   if(i==0 && j==1) //System.out.print("|-O-|");
						  					
					}
					   if(mat[i][j]==-1) {
						//  if(i==0 && j==2) //System.out.print("-O");
						 
					}
					   if(mat[i][j]==-1) {
						//   if(i==1 && j==0) //System.out.print(" O-");
						  
					}
					   if(mat[i][j]==-1) {
						 //  if(i==1 && j==1) //System.out.print("|-O-|");
						   
					}
					   if(mat[i][j]==-1) {
						 //  if(i==1 && j==2) //System.out.print("-O");
						  
					}
					   if(mat[i][j]==-1) {
						 //  if(i==2 && j==0) //System.out.print(" O-");
						
					}
					   if(mat[i][j]==-1) {
						//   if(i==2 && j==1) //System.out.print("|-O-|");
						   
					}
					   if(mat[i][j]==-1) {
						 //  if(i==2 && j==2) //System.out.print("-O");
						 
					}
					
					
					
				}
				
				else if(this.mat[i][j]==0) {
					////System.out.print("- ");
					
					  if(this.mat[i][j]==0) {
					 //  if(i==0 && j==0) //System.out.print("  -");
															
				}
				   if(mat[i][j]==0) {
					   //if(i==0 && j==1) //System.out.print("|- -|");
					  					
				}
				   if(mat[i][j]==0) {
					  // if(i==0 && j==2) //System.out.print("- ");
					 
				}
				   if(mat[i][j]==0) {
					 //  if(i==1 && j==0) //System.out.print("  -");
					  
				}
				   if(mat[i][j]==0) {
					 //  if(i==1 && j==1) //System.out.print("|- -|");
					   
				}
				   if(mat[i][j]==0) {
					//   if(i==1 && j==2) //System.out.print("- ");
					  
				}
				   if(mat[i][j]==0) {
					//   if(i==2 && j==0) //System.out.print("  -");
					
				}
				   if(mat[i][j]==0) {
					//   if(i==2 && j==1) //System.out.print("|- -|");
					   
				}
				   if(mat[i][j]==0) {
					//   if(i==2 && j==2) //System.out.print("- ");
					 
				}
				
				
					
					
				}//else
				
				
				
				
			}//coluna
			if(i < 2) {
				//System.out.println();
				//System.out.println("---+---+---");
				
				}else {
					//System.out.println();
				}
		}//linhas
		
		//System.out.println();
	}//fim da função
	
	public boolean jogar(int jogador, int jogada) {
		  
		
		////jogadas +1=humano & -1=virtual
		for (int i = 0; i < mat.length; i++) {//linhas
			for (int j = 0; j < mat.length; j++) {//colunas
				  
				   if(this.mat[0][0]==0 && jogada==1 ) {
					  
					   
						if(jogador==1 ) {
							
							this.mat[0][0]=1;
							return true;///verificar retorno e tipo
							
						}else if(jogador==-1 ){
							this.mat[0][0]=-1;
							return true;///verificar retorno e tipo
							
						}	
						
				   }else if(this.mat[0][0]!=0 && jogada==1 && jogador==1)  {
							  ////System.out.println("Posi��o 1 inv�lida ");
							return false;
				}//jog 1
				   
				   
				   if(this.mat[0][1]==0 && jogada==2) {
					 
						if(jogador==1 ) {
							// //System.out.println("entrei no if 2 pos 2 ");
							this.mat[0][1]=1;
							return true;///verificar retorno e tipo
							
						}else if(jogador==-1 ){
							this.mat[0][1]=-1;
							return true;///verificar retorno e tipo
							
						}	
				   
				   }else if(this.mat[0][1]!=0 && jogada==2 && jogador==1)  {
					 					   
							 // //System.out.println("Posi��o 2 inv�lida ");
							return false;
					}//jog 2
					  					
				
				   if(this.mat[0][2]==0 && jogada==3) {
					  
						if(jogador==1 ) {
							this.mat[0][2]=1;
							return true;///verificar retorno e tipo
							
						}else if(jogador==-1 ){
							this.mat[0][2]=-1;
							return true;///verificar retorno e tipo
							
						}	
						
						}else if(this.mat[0][2]!=0 && jogada==3 && jogador==1)  {
							 // //System.out.println("Posi��o 3 inv�lida ");
							return false;
											 
				}//jog 3
				   
				   if(this.mat[1][0]==0 && jogada==4) {
					   					   
						if(jogador==1 ) {
							
							this.mat[1][0]=1;
							return true;///verificar retorno e tipo
							
						}else if(jogador==-1 ){
							this.mat[1][0]=-1;
							return true;///verificar retorno e tipo
							
						}	
						
						}else if(this.mat[1][0]!=0 && jogada==4 && jogador==1)  {
							 // //System.out.println("Posi��o 4 inv�lida ");
							return false;
						}//jog 4
					  
				
				   if(this.mat[1][1]==0 && jogada==5 ) {
					   
						if(jogador==1 ) {
							this.mat[1][1]=1;
							return true;///verificar retorno e tipo
						}else if(jogador==-1 ){
							this.mat[1][1]=-1;
							return true;///verificar retorno e tipo
							
						}	
						
						}else if(this.mat[1][1]!=0 && jogada==5 && jogador==1)  {
							//  //System.out.println("Posi��o 5 inv�lida ");
							return false;
						}//jog 5
					   
				
				   if(this.mat[1][2]==0 && jogada==6 ) {
					   
						if(jogador==1 ) {
							this.mat[1][2]=1;
							return true;///verificar retorno e tipo
						}else if(jogador==-1 ){
							this.mat[1][2]=-1;
							return true;///verificar retorno e tipo
							
						}	
						
						}else if(this.mat[1][2]!=0 && jogada==6 && jogador==1)  {
							//  //System.out.println("Posi��o 6 inv�lida ");
							return false;
						}//jog 6
					  
				
				   if(this.mat[2][0]==0 && jogada==7 ) {
					   
						if(jogador==1 ) {
							this.mat[2][0]=1;
							return true;///verificar retorno e tipo
						}else if(jogador==-1 ){
							this.mat[2][0]=-1;
							return true;///verificar retorno e tipo
							
						}	
						
						}else if(this.mat[2][0]!=0 && jogada==7 && jogador==1)  {
							 // //System.out.println("Posi��o 7 inv�lida ");
							return false;
						}//jog 7
					
				
				   if(this.mat[2][1]==0  && jogada==8) {
						if(jogador==1 ) {
							this.mat[2][1]=1;
							return true;///verificar retorno e tipo
						}else if(jogador==-1 ){
							this.mat[2][1]=-1;
							return true;///verificar retorno e tipo
							
						}	
						
						}else if(this.mat[2][1]!=0 && jogada==8 && jogador==1)  {
							 // //System.out.println("Posi��o 8 inv�lida ");
							return false;
						}//jog 8
					   
				
				   if(this.mat[2][2]==0 && jogada==9 ) {
						
					   if(jogador==1 ) {
							this.mat[2][2]=1;
							return true;///verificar retorno e tipo
					   }else if(jogador==-1 ){
							this.mat[2][2]=-1;
							return true;///verificar retorno e tipo
							
						}	//jogador
						
				   } else if(this.mat[2][2]!=0 && jogada==9 && jogador==1)  {
							//  //System.out.println("Posi��o 9 inv�lida ");
							return false;
						}//invalido
					 
				
				   
			}
			//System.out.println();
		}
		
	
		return false;
		
	}

	public int situacao() {
		 int soma, jogadas; 
		soma = 0;
		//problema com a ultima jogada
		////System.out.print("Não houve vencedores."); 
		//return 2 ;
	
	//	teste diagonal principal
		for (int i = 0; i < mat.length; i++) {
		soma = soma + this.mat[i][i];
		}
		
		if (soma==3) {
		
			////System.out.print("Você venceu!Parabéns!");
			return 1;
			
		}else if(soma==-3){
			
			////System.out.print("Computador Venceu.");
			return -1;
			
		}
		
		soma = 0;
		//teste diagonal secundária
		soma= this.mat[2][0] + this.mat[1][1] + this.mat[0][2];
		
		if (soma==3) {
			
			////System.out.print("Você venceu!Parabéns");
			return 1;
			
		}else if(soma==-3){
			
			////System.out.print("Computador Venceu");
			return -1;
			
		}
		
		
		
		soma = 0;
		//teste linhas horizontais
		for (int i = 0; i < mat.length; i++) {
			soma=0;
			for (int j = 0; j < mat.length; j++) {//colunas
			soma = soma + this.mat[i][j];
			}
			if (soma==3) {
				
				//System.out.print("Você venceu!Parabéns");
				return 1;
				
			}else if(soma==-3){
				
				//System.out.print("Computador Venceu");
				return -1;
				
			}
		}//linhas horizontais
		
		
		
		
		soma = 0;
		//teste linhas verticais
		for (int j = 0; j < mat.length; j++) {
			soma=0;
			for (int i = 0; i < mat.length; i++) {//colunas
			soma = soma + this.mat[i][j];
			}
			if (soma==3) {
				
			//	//System.out.print("Você venceu!Parabéns");
				return 1;
				
			}else if(soma==-3){
				
			//	//System.out.print("Computador Venceu");
				return -1;
				
			}//linhas verticais
		
		
		
		
		
		}//verifica vencedores
		
		jogadas=0;
		for (int i = 0; i < mat.length; i++) {//linhas
			for (int k = 0; k < mat.length; k++) {//colunas
				
					if(this.mat[i][k]!=0) {
						jogadas=jogadas+1;
					}
				
				}
				
			}
		
		//debug
		//	//System.out.print("jogadas=");
		////System.out.println(jogadas);
	
	if(jogadas>8) {
		
		return 2;
	}
	
		
		return 0;
	}//situacao

	
}//fim

