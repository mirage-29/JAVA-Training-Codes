
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "                Main Menu\nClick ok to play game\nPress 'I' for instructions\nPress 'T' for tips and tricks\nPress 'N'to enter username\nPress 'R' to restart\nPress 'M' to return back to Main Menu\nPress 'Esc' to exit the game", "MAIN MENU", 1);
		Game g = new Game();	
		System.out.println("starting game");
		
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setFocusable(true);
		g.setSize(500,600);
		g.setVisible(true);
		g.setTitle("2048 GAME");
		
		for(int i=0;i<2;i++) {
			g.addNewNumber();
		}
		
		g.addButtons();
		
		g.printArray();
		g.keys();
		
	}
}
