import java.awt.Color;
import java.awt.Font;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JavaPanel extends JFrame {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("test.jpg");
        JavaPanel frame = new JavaPanel();
        // ImageIcon image1 = new ImageIcon("me.jpg");
        Border border = BorderFactory.createLineBorder(Color.PINK, 24);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("My First GUI");

        frame.setIconImage(image.getImage());

        JLabel label = new JLabel();
        label.setText("Hii I am BEAR.");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setFont(new Font("MV Boli", Font.ITALIC, 20));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(new Color(200, 175, 180));
        label.setIconTextGap(0);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setBounds(150,150, 250,250);

        frame.add(label);
        frame.setLayout(null);
        frame.setSize(600, 600);

    }
}