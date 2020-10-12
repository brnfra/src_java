package com.brunofranco.tictactoe;

import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import java.awt.*;
import java.awt.event.*;

public class Janela {

	private JFrame frmTictactoe;
	private final Label labTitulo = new Label("Tic");
	private static Tabuleiro tab;
	private static Computador cpu;
	private Jogador player;
	private static int jogada, moves;
	private static int vez;
	private static JButton btn1,btn2,btn3,btn4,btn5;
	private static JButton btn6,btn7,btn8,btn9;
	private static JLabel label1,label2,label3,label4,label5;
	private static JLabel label6,label7,label8,label9;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		Tabuleiro tab =new Tabuleiro();
		Jogador jogador = new Jogador();
		Computador comp = new Computador();
		setTab(tab);
		setComputador(comp);
		setVez(1);
		//var usada para setar vez
		int set=0;
		int estado = 0;//0-jogo continua;
		moves=0;

		/* ******************************************************** */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frmTictactoe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		/* ******************************************************** */

		  /*
		*setVez(first.getOpcao());
		*
		*estado=1- vitoria jogador humano;-1- vitoria jogador computador;
		*estado=2- empate
		*/		

		tab.inicializar();//inicializa tabuleiro
							//tab.visualizar();//exibe estado atual do tabuleiro no jogo

		while(estado==0 ) {// situa��o em tabuleiro; 0-jogo nao acabou; 1-jogo com humano vencendo; 
							//2-computador vence; 3- empate com fim de jogo
			
		if(moves==0) {
			set=getVez();
			
		}
			
					if(set==1) { //Jogador Humano
						//pos=jogador.getJogada();
						setJogada(0);

					    Jogador.setJogada(jogada);
						Jogador.jogar(1,jogada,getTab());

						estado=tab.situacao();
							if(estado==1 || estado==2) {
								mostraVencedor(estado);
								tab=newGame(tab);
								setJogada(0);
								estado=0;
								continue;
								
							}
						//muda jogador	cpu
							set=-1;
						moves++;
						
					}
					estado=tab.situacao();
					
						if(	set==-1) {//Jogador virtual
							setJogada(0);

							//pos=comp.jogar(tab);//jogada depende do retorno da classe e da opcao
							
							//comp=getComputador();
							jogada=cpu.jogar(getTab());
							cpuJoga(jogada);	
							//view.cpuJogar();
							
							//tab.visualizar();
							
							estado=tab.situacao();
									if(estado==-1 || estado==2) {
										mostraVencedor(estado);
										tab=newGame(tab);
										setJogada(0);
										estado=0;
										continue;
									}
									//troca vez
									set=1;		
									moves++;
						}
						estado=tab.situacao();
						if(estado==2) {
							mostraVencedor(estado);

							tab=newGame(tab);
							estado=0;
							set=1;
							continue;
						}
					
					
					}//laço while

		
		}//la�o estado//newGame

	//posicao que joga
	public static void setJogada(int pos) {
		jogada=pos;
	}
	public static int getJogada() {
		return jogada;
	}
	private static void setVez(int quemJoga ) {
		vez=quemJoga;
	}
	public static int getVez() {
		return vez;
	}

		//obter tabela de posições
	 public static Tabuleiro getTab() {
		 return tab;
	 	}
	 
	 public static void setTab(Tabuleiro tabuleiro) {
 		 tab=tabuleiro;
	 	}

	//obter obj computador criado
	 	 public static Computador getComputador() {
	 		 return cpu;
		 	}
	 	 public static void setComputador(Computador computador) {
	 		 cpu=computador;
		 	}

	 	//construtor para receber o  obj jogador
	public void setJogador(Jogador jogador) {
			
			 this.player=jogador;
		 }
		 
		//obter jogador computador criado
	private Jogador getJogador() {
				
			 return this.player;
		}	 

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTictactoe = new JFrame();
		frmTictactoe.setTitle("Tic-Tac-Toe");
		frmTictactoe.setBounds(100, 100, 584, 451);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(111, 245, 341, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(111, 161, 341, 2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(221, 82, 2, 240);
		separator_2.setOrientation(SwingConstants.VERTICAL);
	
		frmTictactoe.getContentPane().setLayout(null);
		frmTictactoe.getContentPane().add(separator);
		frmTictactoe.getContentPane().add(separator_1);
		frmTictactoe.getContentPane().add(separator_2);
		labTitulo.setForeground(Color.BLUE);
		
		labTitulo.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		labTitulo.setAlignment(Label.CENTER);
		labTitulo.setBounds(200, 10, 56, 35);
		frmTictactoe.getContentPane().add(labTitulo);
		

		JLabel label1 = new JLabel("");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(111, 82, 100, 68);
		frmTictactoe.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(235, 82, 100, 68);
		frmTictactoe.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(352, 82, 100, 68);
		frmTictactoe.getContentPane().add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(111, 166, 100, 68);
		frmTictactoe.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("");
		label5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(233, 166, 100, 68);
		frmTictactoe.getContentPane().add(label5);
		
		JLabel label6 = new JLabel("");
		label6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setBounds(352, 166, 100, 68);
		frmTictactoe.getContentPane().add(label6);
		
		JLabel label7 = new JLabel("");
		label7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setBounds(111, 254, 100, 68);
		frmTictactoe.getContentPane().add(label7);
		
		JLabel label8 = new JLabel("");
		label8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setBounds(235, 254, 100, 68);
		frmTictactoe.getContentPane().add(label8);
		
		JLabel label9 = new JLabel("");
		label9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setBounds(352, 254, 100, 68);
		frmTictactoe.getContentPane().add(label9);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(345, 82, 2, 240);
		frmTictactoe.getContentPane().add(separator_2_1);

		JButton btn1 = new JButton("");
		btn1.addMouseListener(new MouseAdapter() {
	
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=1;
				Jogador.setJogada(jogada);
				btn1.setVisible(false);
				label1.setForeground(Color.blue);
				label1.setText("X");
			
			}
		});
		btn1.setBounds(111, 82, 100, 68);
		
		
		frmTictactoe.getContentPane().add(btn1);
		JButton btn2 = new JButton("");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=2;
				  Jogador.setJogada(jogada);
				  label2.setForeground(Color.blue);
				btn2.setVisible(false);
				label2.setText("X");
				
			}
		});
		btn2.setBounds(235, 82, 100, 68);
		frmTictactoe.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=3;
				  Jogador.setJogada(jogada);
				btn3.setVisible(false);
				label3.setForeground(Color.blue);
				label3.setText("X");
				
				
			}
		});
		btn3.setBounds(352, 82, 100, 68);
		frmTictactoe.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.addMouseListener(new MouseAdapter() {			
		
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=4;
				btn4.setVisible(false);
				label4.setForeground(Color.blue);
				label4.setText("X");
				  Jogador.setJogada(jogada);
				
				
			}
		});
		btn4.setBounds(111, 166, 100, 68);
		frmTictactoe.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=5;
				  Jogador.setJogada(jogada);
				btn5.setVisible(false);
				label5.setForeground(Color.blue);
				label5.setText("X");
				
				
			}
		});
		btn5.setBounds(235, 166, 100, 68);
		frmTictactoe.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=6;
				  Jogador.setJogada(jogada);
				btn6.setVisible(false);
				label6.setForeground(Color.blue);
				label6.setText("X");
				
				
			}
		});
		btn6.setBounds(352, 166, 100, 68);
		frmTictactoe.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=7;
				  Jogador.setJogada(jogada);
				  label7.setForeground(Color.blue);
				btn7.setVisible(false);
				label7.setText("X");
				
				
			}
		});
		btn7.setBounds(111, 254, 100, 68);
		frmTictactoe.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.addMouseListener(new MouseAdapter() {			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=8;
				  Jogador.setJogada(jogada);
				btn8.setVisible(false);
				label8.setForeground(Color.blue);
				label8.setText("X");
				
				
			}
		});
		btn8.setBounds(235, 254, 100, 68);
		frmTictactoe.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.addMouseListener(new MouseAdapter() {			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				jogada=9;
				Jogador.setJogada(jogada);
				btn9.setVisible(false);
				label9.setForeground(Color.blue);
				label9.setText("X");
				
				
			}
		});
		btn9.setBounds(352, 254, 100, 68);
		frmTictactoe.getContentPane().add(btn9);
		
		setButton1(btn1);	
		setButton2(btn2);	
		setButton3(btn3);	
		setButton4(btn4);	
		setButton5(btn5);	
		setButton6(btn6);	
		setButton7(btn7);	
		setButton8(btn8);	
		setButton9(btn9);	
			
		setJLabel1(label1);
		setJLabel2(label2);
		setJLabel3(label3);
		setJLabel4(label4);
		setJLabel5(label5);
		setJLabel6(label6);
		setJLabel7(label7);
		setJLabel8(label8);
		setJLabel9(label9);
		
		Label labTitulo_1 = new Label("Tac");
		labTitulo_1.setForeground(Color.RED);
		labTitulo_1.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		labTitulo_1.setAlignment(Label.CENTER);
		labTitulo_1.setBounds(261, 26, 50, 35);
		frmTictactoe.getContentPane().add(labTitulo_1);
		
		Label labTitulo_2 = new Label("Toe");
		labTitulo_2.setForeground(Color.BLUE);
		labTitulo_2.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		labTitulo_2.setAlignment(Label.CENTER);
		labTitulo_2.setBounds(317, 10, 50, 35);
		frmTictactoe.getContentPane().add(labTitulo_2);
		
		JMenuBar menuBar = new JMenuBar();
		frmTictactoe.setJMenuBar(menuBar);
		
		JMenu menub1 =  new JMenu("Game");
		menuBar.add(menub1);
		
		JMenuItem menuI1 = new JMenuItem("New Game");
		
		menuI1.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent arg0) {
				newGame(getTab());
			}
			public void menuKeyReleased(MenuKeyEvent arg0) {
				newGame(getTab());
			}
			public void menuKeyTyped(MenuKeyEvent arg0) {
			}
		});
		menuI1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				newGame(getTab());
			}
		});
		menub1.add(menuI1);
		
		JMenuItem menuI3 = new JMenuItem("Exit");
		menuI3.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent arg0) {
				System.exit(0);
			}
			public void menuKeyReleased(MenuKeyEvent arg0) {
				System.exit(0);
			}
			public void menuKeyTyped(MenuKeyEvent arg0) {
			}
		});
		menuI3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JMenu menuI2 = new JMenu("Beginning");
		menub1.add(menuI2);
		
		//come�a marcado blue
		JRadioButtonMenuItem inicioBlue = new JRadioButtonMenuItem("Blue",true);
		inicioBlue.setForeground(Color.BLUE);
		menuI2.add(inicioBlue);
		inicioBlue.addActionListener(e -> {

			setVez(1);
			JOptionPane.showMessageDialog(null, "Player BLUE Start in the next game...","Info", 1);
		});
		
		JRadioButtonMenuItem inicioRed = new JRadioButtonMenuItem("Red");
		inicioRed.setForeground(Color.RED);
		menuI2.add(inicioRed);
		inicioRed.addActionListener(e -> {

			setVez(-1);
			JOptionPane.showMessageDialog(null, "Player RED Start in the next game...","Info", JOptionPane.INFORMATION_MESSAGE);
		});
		//grupo1
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(inicioBlue);
		grupo1.add(inicioRed);
		//set variaveis para checar as escolhas, tanto da dificuldade quanto inicio
		boolean buttonCheck1,buttonCheck2,buttonCheck3;
		 
		//String anwser = grupo1.getSelection().getActionCommand();
		
		
		//checklist
		buttonCheck1 = inicioBlue.isSelected();
		if(buttonCheck1)setVez(1);
		buttonCheck2 = inicioRed.isSelected();
		if(buttonCheck2) setVez(-1);
		
		
		JMenu menuI4 = new JMenu("CPU Level");
		menub1.add(menuI4);
		
		//come�a marcado level 1
		JRadioButtonMenuItem level1 = new JRadioButtonMenuItem("Level 1 (Easy)",true);
		level1.addMenuKeyListener(new MenuKeyListener() {
			
			@Override
			public void menuKeyTyped(MenuKeyEvent e) {
				
				getComputador().setNivel(1);
				
			}
			
			@Override
			public void menuKeyReleased(MenuKeyEvent e) {
				getComputador().setNivel(1);
				}
			
			@Override
			public void menuKeyPressed(MenuKeyEvent e) {
				
				getComputador().setNivel(1);
			}
		});
		level1.addMouseListener(new MouseAdapter() {
						
			@Override
			public void mousePressed(MouseEvent e) {
				
				getComputador().setNivel(1);
			}
						
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getComputador().setNivel(1);
			}
		});
		menuI4.add(level1);
		
		
		JRadioButtonMenuItem level2 = new JRadioButtonMenuItem("Level 2 (Medium)");
	level2.addMenuKeyListener(new MenuKeyListener() {
			
			@Override
			public void menuKeyTyped(MenuKeyEvent e) {
				
				getComputador().setNivel(2);
			}
			
			@Override
			public void menuKeyReleased(MenuKeyEvent e) {
				getComputador().setNivel(2);
				}
			
			@Override
			public void menuKeyPressed(MenuKeyEvent e) {
				
				getComputador().setNivel(2);
			}
		});
		level2.addMouseListener(new MouseAdapter() {
						
			@Override
			public void mousePressed(MouseEvent e) {
				
				getComputador().setNivel(2);
			}
						
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getComputador().setNivel(2);
			}
		});
		menuI4.add(level2);

		JRadioButtonMenuItem level3 = new JRadioButtonMenuItem("Level 3 (Hard)");
	    level3.addMenuKeyListener(new MenuKeyListener() {
			
			@Override
			public void menuKeyTyped(MenuKeyEvent e) {
				
				getComputador().setNivel(3);
			}
			
			@Override
			public void menuKeyReleased(MenuKeyEvent e) {
				getComputador().setNivel(3);
				}
			
			@Override
			public void menuKeyPressed(MenuKeyEvent e) {
			
				getComputador().setNivel(3);
			}
		});
		level3.addMouseListener(new MouseAdapter() {
						
			@Override
			public void mousePressed(MouseEvent e) {
				
				getComputador().setNivel(3);
			}
						
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getComputador().setNivel(3);
			}
		});
		menuI4.add(level3);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(level1);
		grupo2.add(level2);
		grupo2.add(level3);
		//checklist
		buttonCheck1 = level1.isSelected();
		if(buttonCheck1)getComputador().setNivel(1);
		buttonCheck2 = level2.isSelected();
		if(buttonCheck2)getComputador().setNivel(2);
		buttonCheck3 = level3.isSelected();
		if(buttonCheck3)getComputador().setNivel(3);
		
		
		menub1.add(menuI3);
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		JMenuItem help = new JMenuItem("Help");
		help.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "In order to win the game, a player must place three of their marks in a horizontal, vertical, or diagonal row.\r\n" + 
						"\r\n" + "The following example game is won by the first player, X:\r\n" + 
						"Game of Tic-tac-toe, won by X\r\n" +"\r\n" + "Players soon discover that the best play from both parties leads to a draw. X\r\n" + 
						"Hence, tic-tac-toe is most often played by young children, who often have not yet discovered the optimal strategy.\r\n" + 
						"\r\n" + "Because of the simplicity of tic-tac-toe, it is often used as a pedagogical tool for teaching the concepts of good \n " +  
						"sportsmanship and the branch of artificial intelligence that deals with the searching of game trees. It is straightforward to \n " +  
						"write a computer program to play tic-tac-toe perfectly or to enumerate the 765 essentially different positions (the state space complexity) \n" + 
						"or the 26,830 possible games up to rotations and reflections (the game tree complexity) on this space.\r\n" + 	"\r\n" + 
						"The game can be generalized to an m,n,k-game in which two players alternate placing stones of their own color on an m�n board,\n" + 
						" with the goal of getting k of their own color in a row. Tic-tac-toe is the (3,3,3)-game. Harary's generalized tic-tac-toe is \n" + 
						"an even broader generalization of tic-tac-toe. It can also be generalized as a nd game. Tic-tac-toe is the game where n \n" + 
						"equals 3 and d equals 2. If played optimally by both players, the game always ends in a draw, making tic-tac-toe a futile game.\n" + 
						"(Font: https://en.wikipedia.org/wiki/Tic-tac-toe) ","Help", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		help.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				JOptionPane.showMessageDialog(null, "In order to win the game, a player must place three of their marks in a horizontal, vertical, or diagonal row.\r\n" + 
						"\r\n" + "The following example game is won by the first player, X:\r\n" + 
						"Game of Tic-tac-toe, won by X\r\n" +"\r\n" + "Players soon discover that the best play from both parties leads to a draw. X\r\n" + 
						"Hence, tic-tac-toe is most often played by young children, who often have not yet discovered the optimal strategy.\r\n" + 
						"\r\n" + "Because of the simplicity of tic-tac-toe, it is often used as a pedagogical tool for teaching the concepts of good \n " +  
						"sportsmanship and the branch of artificial intelligence that deals with the searching of game trees. It is straightforward to \n " +  
						"write a computer program to play tic-tac-toe perfectly or to enumerate the 765 essentially different positions (the state space complexity) \n" + 
						"or the 26,830 possible games up to rotations and reflections (the game tree complexity) on this space.\r\n" + 	"\r\n" + 
						"The game can be generalized to an m,n,k-game in which two players alternate placing stones of their own color on an m�n board,\n" + 
						" with the goal of getting k of their own color in a row. Tic-tac-toe is the (3,3,3)-game. Harary's generalized tic-tac-toe is \n" + 
						"an even broader generalization of tic-tac-toe. It can also be generalized as a nd game. Tic-tac-toe is the game where n \n" + 
						"equals 3 and d equals 2. If played optimally by both players, the game always ends in a draw, making tic-tac-toe a futile game.\n" + 
						"(Font: https://en.wikipedia.org/wiki/Tic-tac-toe) ","Help", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		helpMenu.add(help);
		
		JMenuItem about = new JMenuItem("About");
		about.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Game Tic-Tac-Toe\nAuthor: Bruno Franco. 2020","About", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		about.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				JOptionPane.showMessageDialog(null, "Game Tic-Tac-Toe\\nAuthor: Bruno Franco. 2020","About", 1);
			}
		});
		helpMenu.add(about);
		
	}

	//GETS AND SETS BUTONS AND LABELS
	private  void setButton1(JButton btn) {
		this.btn1=btn;
	}
	private static JButton getButton1() {
		return btn1;
	}
	private  void setJLabel1(JLabel label) {
		this.label1=label;
	}
	private static JLabel getLabel1() {
		return label1;
	}
	
	private  void setButton2(JButton btn) {
		btn2=btn;
	}
	private static JButton getButton2() {
		return btn2;
	}
	private  void setJLabel2(JLabel label) {
		label2=label;
	}
	private static JLabel getLabel2() {
		return label2;
	}
	
	private  void setButton3(JButton btn) {
		btn3=btn;
	}
	private static JButton getButton3() {
		return btn3;
	}
	private  void setJLabel3(JLabel label) {
		label3=label;
	}
	private static JLabel getLabel3() {
		return label3;
	}
	
	private  void setButton4(JButton btn) {
		btn4=btn;
	}
	private static JButton getButton4() {
		return btn4;
	}
	private  void setJLabel4(JLabel label) {
		label4=label;
	}
	private static JLabel getLabel4() {
		return label4;
	}
	
	private  void setButton5(JButton btn) {
		btn5=btn;
	}
	private static JButton getButton5() {
		return btn5;
	}
	private void setJLabel5(JLabel label) {
		label5=label;
	}
	private static JLabel getLabel5() {
		return label5;
	}
	
	private  void setButton6(JButton btn) {
		btn6=btn;
	}
	private static JButton getButton6() {
		return btn6;
	}
	private  void setJLabel6(JLabel label) {
		label6=label;
	}
	private static JLabel getLabel6() {
		return label6;
	}
	
	private  void setButton7(JButton btn) {
		btn7=btn;
	}
	private static JButton getButton7() {
		return btn7;
	}
	private  void setJLabel7(JLabel label) {
		label7=label;
	}
	private static JLabel getLabel7() {
		return label7;
	}
	
	private  void setButton8(JButton btn) {
		btn8=btn;
	}
	private static JButton getButton8() {
		return btn8;
	}
	private  void setJLabel8(JLabel label) {
		label8=label;
	}
	private static JLabel getLabel8() {
		return label8;
	}
	

	private  void setButton9(JButton btn) {
		btn9=btn;
	}
	private static JButton getButton9() {
		return btn9;
	}
	private  void setJLabel9(JLabel label) {
		label9=label;
	}
	private static JLabel getLabel9() {
		return label9;
	}

	//inicia uma nova partida
	public static Tabuleiro newGame(Tabuleiro tab ) {
		
		//tab.inicializar();//inicializa tabuleiro
		tab.inicializar();
		setTab(tab);
	
	//n�o esta zerandoa tabela
		
		//tab.visualizar();
		
		btn1.setVisible(true);
		btn2.setVisible(true);
		btn3.setVisible(true);
		btn4.setVisible(true);
		btn5.setVisible(true);
		btn6.setVisible(true);
		btn7.setVisible(true);
		btn8.setVisible(true);
		btn9.setVisible(true);
		
		label1.setText("");
		label2.setText("");
		label3.setText("");
		label4.setText("");
		label5.setText("");
		label6.setText("");
		label7.setText("");
		label8.setText("");
		label9.setText("");
		moves=0;
		return tab;
	}

	//exibe popup com info
	public static void mostraVencedor(int estado) {
		switch(estado) {
		case 1:
			JOptionPane.showMessageDialog(null, "Congratulations,  You Win!","Result", 1);
			return ;
		case -1:
			JOptionPane.showMessageDialog(null, "Saddly, You Lose.", "Result", 1);
			return ;
		case 2:
			JOptionPane.showMessageDialog(null, "Draw Game!", "Result", 1);
			return ;
		}
	}
	
	//marca circulo no tabuleiro
	public static void cpuJoga(int pos) {
		int position=1;
		position=pos;
				
		JButton btnX;
		JLabel labelX;

		/*
		 TODO cpu vai jogar O em 1? defina uma forma do cpu jogar corretamente...
		 exibir a jogada do cpu
		*/

		switch(position) {
	    case 1:
	    	    	
	    	btnX = getButton1();
			labelX =getLabel1();
			btnX.setVisible(false);
			labelX.setForeground(Color.red);
			labelX.setText("O");
	    	break;
	    case 2:
	    	
	    	btnX = getButton2();
			labelX =getLabel2();
			btnX.setVisible(false);
			labelX.setForeground(Color.red);
			labelX.setText("O");
	    	break;
	    case 3:
	    	
	    	btnX = getButton3();
			labelX =getLabel3();
			btn3.setVisible(false);
			labelX.setForeground(Color.red);
			label3.setText("O");
	    	break;
	    case 4:
	    	
	    	btnX = getButton4();
			labelX =getLabel4();
			btn4.setVisible(false);
			labelX.setForeground(Color.red);
			label4.setText("O");
	    	break;
	    case 5:
	    	
	    	btnX = getButton5();
			labelX =getLabel5();
			btnX.setVisible(false);
			labelX.setForeground(Color.red);
			labelX.setText("O");
	    	break;
	    case 6:
	    	
	    	btnX = getButton6();
			labelX =getLabel6();
			btnX.setVisible(false);
			labelX.setForeground(Color.red);
			labelX.setText("O");
	    	break;
	    case 7:
	    	
	    	btnX = getButton7();
			labelX =getLabel7();
			btnX.setVisible(false);
			labelX.setForeground(Color.red);
			labelX.setText("O");
	    	break;
	    case 8:
	    	
	    	btnX = getButton8();
			labelX =getLabel8();
			btnX.setVisible(false);
			labelX.setForeground(Color.red);
			labelX.setText("O");
	    	break;
	    case 9:
	    	
	    	btnX = getButton9();
			labelX =getLabel9();
			btnX.setVisible(false);
			labelX.setForeground(Color.red);
			labelX.setText("O");
	    	break;
	    
	    	    }
			
	}
}
