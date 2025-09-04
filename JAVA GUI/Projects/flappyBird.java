package Projects;
import java.awt.*;
import javax.swing.*;

public class flappyBird extends JFrame {
    public flappyBird() {
        setTitle("Flappy Bird");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JButton startButton = new JButton("Start Game");
        startButton.setBounds(350, 250, 100, 50);
        add(startButton);
        
        JPanel GamePanel = new JPanel();
        GamePanel.setLayout(new GridLayout(700, 500));

        startButton.addActionListener(e -> {
            try {
                remove(startButton);
                revalidate();
                repaint();
                GamePanel.setBackground(Color.CYAN);
                
                
             
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter only integers in element fields.");
            }
        });
        
        add(GamePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new flappyBird());
    }


}
