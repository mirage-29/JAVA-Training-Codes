import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.ArrayList;

public class Game extends JFrame implements KeyListener {
	
	JButton button[][] = new JButton[4][4],bscore,b20,b48,bname,binstructions,bnew,bexit;
	
	int gb[][]/*,ugb[][],lgb[][],rgb[][],dgb[][]*/,score;
	Random r = new Random();
	
	Game() {
		gb = new int[4][4];
	/*	ugb = new int[4][4];
		lgb = new int[4][4];
		dgb = new int[4][4];
		rgb = new int[4][4];*/
		score=0;
	}
	
	void addNewNumber() {
		int i = 0, j = 0;
		// used arraylist coz its size can vary but not of array
		ArrayList<Integer> x0 = new ArrayList<Integer>();
		ArrayList<Integer> y0 = new ArrayList<Integer>();
		//checking for the 0's present in the game board and adding there coordinates in the arraylist
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				if(gb[i][j] == 0) {
					x0.add(i);
					y0.add(j);
				}
			}
		}
		//chooses numbers randomly between 0(inclusive) and size of the arraylist (exclusive)
		int choice = r.nextInt(x0.size());
		//chooses numbers randomly between 0(inclusive) and 10(exclusive) (i.e. till 9) 
		int numberChooser = r.nextInt(10);
		//probability of occurring 2 shd be 90% and that of 4 shd be 10%
		int newNumber = 2;
		if(numberChooser == 0) {
			newNumber = 4;
		}
		int X = x0.get(choice);
		int Y = y0.get(choice);
		gb[X][Y] = newNumber;
	}
	
	
	void printArray() {
		//printing the array
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<4;j++) {
				System.out.print("\t"+gb[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println();
		movingButtons();

	}
	
	void moveUp() {
		//moving the array upwards (column by column) only once if 0 is encountered
		for(int j = 0; j<4; j++) {
			for(int i = 0; i<3; i++) {
				if(gb[i][j] == 0) {
					gb[i][j] = gb[i+1][j];
					gb[i+1][j] = 0;
				}
			}
		}
	}
	
	void addUp() {
		//checking for same number in a column and adding if two consecutive numbers are same
		for(int j = 0; j<4; j++) {
			for(int i=0; i<3; i++) {
				if(gb[i][j] == gb[i+1][j]) {
					gb[i][j] *= 2;
					gb[i+1][j] = 0;
					score +=gb[i][j];
				}
			}
		}
	}
	
	void pushUp() {
		int temp[][] = new int[4][4], i;
		
		//to check if we have to add number or not we make a temporary array
		for(i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				temp[i][j]=gb[i][j];
			}
		}
			
		//moving up 3 times so that all the numbers move up(by this way last number can come to top)
		for(int k = 0; k<3; k++) {
			moveUp();
		}
		//adding the same numbers
		addUp();
		
		//have to move up again coz adding numbers will make some place 0
		for(int k = 0; k<3; k++) {
			moveUp();
		}
		
		//checking to add newnumber
		int flag=0;
		//int temp[][] = new int [4][4];
		for(i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gb[i][j] != temp[i][j]){
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			addNewNumber();
		}
		
		//doing this to check end game condition
/*		for(i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				ugb[i][j]=gb[i][j];
			}
		}*/
		
	}
	
	void moveDown() {
		//moving down the same way as done in up
		for(int j=0;j<4;j++) {
			for(int i=3; i>0;i--) {
				if(gb[i][j] == 0) {
					gb[i][j] = gb[i-1][j];
					gb[i-1][j] = 0;
				}
			}
		}
	}
	void addDown() {
		//adding the same way as done in up
		for(int j=0;j<4;j++) {
			for(int i=3;i>0;i--) {
				if(gb[i][j] == gb[i-1][j]) {
					gb[i][j] *= 2;
					gb[i-1][j] = 0;
					score +=gb[i][j];
				}
			}
		}
	}
	
	void pushDown() {
		int temp[][] = new int [4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				temp[i][j] = gb[i][j];
			}
		}
		//pushing down the same way as done in up
		for(int k=0;k<3;k++) {
			moveDown();
		}
		addDown();
		for(int k=0;k<3;k++) {
			moveDown();
		}
	/*	for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				dgb[i][j]=gb[i][j];
			}
		}*/
		int flag=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gb[i][j] != temp[i][j]){
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			addNewNumber();
		}

	}


	void moveLeft() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				if(gb[i][j] == 0) {
					gb[i][j] = gb[i][j+1];
					gb[i][j+1] = 0;
				}
			}
		}
	}
	
	void addLeft() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				if(gb[i][j] == gb[i][j+1]) {
					gb[i][j] *= 2;
					gb[i][j+1] = 0;
					score +=gb[i][j];
				}
			}
		}
	}
	
	
	void pushLeft() {
		int temp[][] = new int [4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				temp[i][j] = gb[i][j];
			}
		}
		
		for(int k=0;k<3;k++) {
			moveLeft();
		}
		
		addLeft();
		
		for(int k=0;k<3;k++) {
			moveLeft();
		}	
		
	/*	for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				lgb[i][j]=gb[i][j];
			}
		}*/
		int flag=0;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gb[i][j] != temp[i][j]){
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			addNewNumber();
		}
	}
	
	void moveRight() {
		for(int i=0;i<4;i++) {
			for(int j=3;j>0;j--) {
				if(gb[i][j] == 0) {
					gb[i][j] = gb[i][j-1];
					gb[i][j-1] = 0;
				}
			}
		}
	}
	
	void addRight() {
		for(int i=0;i<4;i++) {
			for(int j=3;j>0;j--) {
				if(gb[i][j] == gb[i][j-1]) {
					gb[i][j] *= 2;
					gb[i][j-1] = 0;
					score +=gb[i][j];
				}
			}
		}
	}
	
	void pushRight() {
		int temp[][] = new int [4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				temp[i][j] = gb[i][j];
			}
		}
		for(int k=0;k<3;k++) {
			moveRight();
		}
		
		addRight();
		
		for(int k=0;k<3;k++) {
			moveRight();
		}	
		
	/*	for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				rgb[i][j]=gb[i][j];
			}
		}*/
		int flag=0;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gb[i][j] != temp[i][j]){
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			addNewNumber();
		}
	}
	void newGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,700);
		setVisible(true);
		setTitle("2048 GAME");
		
		for(int i=0;i<2;i++) {
			addNewNumber();
		}
		
		addButtons();
		
		printArray();
		keys();
	}
	
	void restart() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				gb[i][j] = 0;
			}
		}
		score = 0;
		addNewNumber();
		addNewNumber();
		movingButtons();
		printArray();
		
	}
	
	void wonGame() {
		boolean temp = false;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gb[i][j] == 2048) {
					temp = true;
					break;
				}
			}
		}
		if(temp) {
			System.out.println("yow won the game!!!");
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS!!!! YOU WON THE GAME\nPress NEW GAME button or r to restart\nPress EXIT button or Esc to end game", "Game Won", 1);			
		}
	}
	
	
	void endGame() {
		boolean end = true;
		boolean full = true;
		int temp[][] = new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				temp[i][j] = gb[i][j];
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(temp[i][j] == 0) {
					full = false;
					end = false;
					break;
				}
			}
		}
		if(full) {
			for(int j = 0; j<4; j++) {
				for(int i=0; i<3; i++) {
					if(temp[i][j] == temp[i+1][j]) {
						end = false;
						break;
					}
				}
			}
			for(int j=0;j<4;j++) {
				for(int i=3;i>0;i--) {
					if(temp[i][j] == temp[i-1][j]) {
						end = false;
						break;
					}
				}
			}
			for(int i=0;i<4;i++) {
				for(int j=0;j<3;j++) {
					if(temp[i][j] == temp[i][j+1]) {
						end = false;
						break;
					}
				}
			}
			for(int i=0;i<4;i++) {
				for(int j=3;j>0;j--) {
					if(temp[i][j] == temp[i][j-1]) {
						end = false;
						break;
					}
				}
			}
			
		}
		
	/*	pushLeft();
		pushRight();
		pushUp();
		pushDown();
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gb[i][j] == ugb[i][j] && gb[i][j] == lgb[i][j] && gb[i][j] == dgb[i][j] && gb[i][j] == rgb[i][j]) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
		}*/
		
		if(end) {
			System.out.println("yow Lost the game");
			JOptionPane.showMessageDialog(null, "YOU LOST THE GAME\nPress NEW GAME button or r to restart\nPress EXIT button or Esc to end game", "Game Won", 1);
		}
	}
	
	void addButtons() {
		String st;
		setLayout(new GridLayout(5,4));
		String str ="press n to\nenter\nname"; 
		bname = new JButton("<html>"+str.replaceAll("\\n","<br>")+"</html>");
		bname.setFont(new Font("clear sans",Font.PLAIN,21));
		add(bname);
		b20 = new JButton("<html>"+"welcome<br>to"+"<html>");
		b20.setFont(new Font("clear sans",Font.PLAIN,25));
		add(b20);
		b48 = new JButton("2048");
		b48.setFont(new Font("clear sans",Font.BOLD,38));
		add(b48);
		bscore = new JButton();
		add(bscore);
		bscore.setFont(new Font("clear sans",Font.PLAIN,25));
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
				st = gb[i][j]+"";
				if(gb[i][j] == 0)
					button[i][j] = new JButton("");
				else
					button[i][j] = new JButton(st);
				button[i][j].setFont(new Font("clear sans",Font.BOLD,38));
				add(button[i][j]);
			}
		}
		paintButtons();
		
	}
	
	void movingButtons() {
		String sc="score\n\t"+score;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gb[i][j] == 0) 
					button[i][j].setText("");
					else
						button[i][j].setText(gb[i][j]+"");
				bscore.setText("<html>"+sc.replaceAll("\\n", "<br>")+"</html>");
				}
			}
		paintButtons();
		}
	
	void paintButtons() {
		bname.setBackground(new Color(255, 172, 255 ));
		b20.setBackground(new Color(255, 172, 255 ));
		b48.setBackground(new Color(255, 172, 255 ));
		bscore.setBackground(new Color(255, 172, 255 ));
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				switch(gb[i][j]) {
				case 0 :				
					button[i][j].setBackground(new Color(210, 200, 203 ));
					break;
				case 2 :
					button[i][j].setBackground(new Color(240, 236, 237 ));
					button[i][j].setForeground(Color.black);
					break;
				case 4 :
					button[i][j].setBackground(new Color(224, 216, 218 ));
					button[i][j].setForeground(Color.black);
					break;
				case 8 :
					button[i][j].setBackground(new Color(247,185 ,117 ));
					button[i][j].setForeground(Color.white);
					break;
				case 16 :
					button[i][j].setBackground(new Color(255,150 ,100 ));
					button[i][j].setForeground(Color.white);
					break;
				case 32 :
					button[i][j].setBackground(new Color(255, 120, 70 ));
					button[i][j].setForeground(Color.white);
					break;
				case 64 :
					button[i][j].setBackground(new Color(220, 69, 22 ));
					button[i][j].setForeground(Color.white);
					break;
				case 128 :
					button[i][j].setBackground(new Color(255, 221, 117 ));
					button[i][j].setForeground(Color.white);
					break;
				case 256 :
					button[i][j].setBackground(new Color(255, 210, 74 ));
					button[i][j].setForeground(Color.white);
					break;
				case 512 :
					button[i][j].setBackground(new Color(174, 213, 139 ));
					button[i][j].setForeground(Color.white);
					break;
				case 1024 :
					button[i][j].setBackground(new Color(148, 198, 97 ));
					button[i][j].setForeground(Color.white);
					break;
				case 2048 :
					button[i][j].setBackground(new Color(0, 221, 221 ));
					button[i][j].setForeground(Color.white);
					break;
				
				}
			}
		}
	}
	
	void keys() {
		setFocusable(true);
		addKeyListener(this);
	}
	

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		if(ke.getKeyCode() == KeyEvent.VK_UP || ke.getKeyCode() == KeyEvent.VK_W) {
			System.out.println("up");
			pushUp();
			printArray();
			wonGame();
			endGame();
		}
		else if(ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_S) {
			System.out.println("down");
			pushDown();	
			printArray();
			wonGame();
			endGame();
		}
		else if(ke.getKeyCode() == KeyEvent.VK_LEFT || ke.getKeyCode() == KeyEvent.VK_A) {
			System.out.println("left");
			pushLeft();	
			printArray();
			wonGame();
			endGame();
		}
		else if(ke.getKeyCode() == KeyEvent.VK_RIGHT || ke.getKeyCode() == KeyEvent.VK_D) {
			System.out.println("right");
			pushRight();
			printArray();
			wonGame();
			endGame();
		}
		else if(ke.getKeyCode() == KeyEvent.VK_R) {
			System.out.println("r");
			restart();
		}
		else if(ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.out.println("esc");
			JOptionPane.showMessageDialog(null, "Thanks for palying the game.\nHope you enjoyed it.", "Game Ended", 1);
			System.exit(0);
		}
		else if(ke.getKeyCode() == KeyEvent.VK_I) {
			System.out.println("i");
			JOptionPane.showMessageDialog(null, "                        How to play :\nUse your arrow keys to move the tiles.\nWhen two tiles with the same number touch,\nthey merge into one! ", "Instructions", 1);

		}
		else if(ke.getKeyCode() == KeyEvent.VK_N) {
			System.out.println("n");
			String name = JOptionPane.showInputDialog("enter username");
			String name1;
			name1 = name.toUpperCase();
			bname.setText("<html>"+name1.replaceAll(" ", "<br>")+"</html>");
		}
		else if(ke.getKeyCode() == KeyEvent.VK_T) {
			System.out.println("t");
			JOptionPane.showMessageDialog(null, "2048 Game Tips & Tricks\n\n1. Take It Slow\n2048 is so easy to play, you might get into the habit of\ntearing through games without even really paying\nattention to what you're doing. That's not a good idea.\nTake your time - there's no penalty for thinking your\nmoves through after all. Also, try to predict where new\nblocks might come in and how you could deploy them.\nSomething like playing chess.\n\n\n2. Work The Corners\nIn order to win the game you should have a specific\nstrategy. If you do not have one, you will most probaly\nnot reach furthr than 512. So, a good strategy is to\nalways keep your highest value tile at one of the corners.\nJust chooose one corner and direct all your tiles there.\nIt is not as easy as it sounds, but you can master it\nquickly. In order to stop the highest value tile to leave\n''the king's place'', try to pack tiles around it.\nPreferably, they should be the other biggest tiles.\nMaster this simple strategy and you will soon reach\n1024 and even win the 2048 Game!\n\n\n3. How to make the highest valued tile in the right\nbottom corner and not to move it?\nOnce you have placed your highest tile value is in the\nright bottom corner, do not move it. To make sure it is\nnot moved,you have to make the last row always filled\nby pushing the down arrow so that the use of LEFT and\nRight Arrow would not move the highest valued tile.\nBasically, this is the most important cheat for 2048\nGame - keep the highest tile in the corner and do not\nmove it.", "Tips & Tricks", 1);
		}
		else if(ke.getKeyCode() == KeyEvent.VK_M) {
			System.out.println("m");
			JOptionPane.showMessageDialog(null, "                Main Menu\nClick ok to play game\nPress 'I' for instructions\nPress 'T' for tips and tricks\nPress 'N'to enter username\nPress 'R' to restart\nPress 'M' to return back to Main Menu\nPress 'Esc' to exit the game", "MAIN MENU", 1);
		}

	}

	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
				
	}
	



}