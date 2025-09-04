import javax.swing.*;
import java.awt.*;


public class ArraySumUI extends JFrame {
    private JTextField sizeField;
    private JPanel elementsPanel;
    private JButton calculateButton;
    private JLabel resultLabel;
    private JTextField[] elementFields;

        ArraySumUI() {
        setTitle("Array Sum Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new BorderLayout());
           // Custom JPanel with background image
        JPanel panel = new JPanel() {
            private Image backgroundImage = new ImageIcon("bg.jpg").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        panel.setLayout(new BorderLayout());
        setContentPane(panel);

        // Top panel for array size input
        JPanel topPanel = new JPanel();
        JLabel topLabel= new JLabel("Enter array size:");
        topLabel.setForeground(Color.RED);
        topPanel.add(topLabel);
        sizeField = new JTextField(5);
        topPanel.add(sizeField);
        JButton setSizeButton = new JButton("Set Size");
        topPanel.add(setSizeButton);
        topPanel.setOpaque(false); 
        panel.add(topPanel, BorderLayout.NORTH);

        // Center panel for entering elements
        elementsPanel = new JPanel();
        elementsPanel.setLayout(new GridLayout(0, 1));
        elementsPanel.setOpaque(false);
        panel.add(elementsPanel, BorderLayout.CENTER);

        // Bottom panel for calculate button and result
        JPanel bottomPanel = new JPanel();
        calculateButton = new JButton("Calculate Sum");
        calculateButton.setEnabled(false);
        resultLabel = new JLabel("Sum: ");
        resultLabel.setForeground(Color.RED);
        bottomPanel.add(calculateButton);
        bottomPanel.add(resultLabel);
        bottomPanel.setOpaque(false);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        // Listener to set size and generate input fields
        setSizeButton.addActionListener(e -> {
            try {
                int size = Integer.parseInt(sizeField.getText());
                elementsPanel.removeAll();
                elementFields = new JTextField[size];

                for (int i = 0; i < size; i++) {
                    elementFields[i] = new JTextField(10);
                    elementsPanel.add(new JLabel("Element " + (i + 1) + ":"));
                    elementsPanel.add(elementFields[i]);
                }

                calculateButton.setEnabled(true);
                elementsPanel.revalidate();
                elementsPanel.repaint();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.");
            }
        });

        // Listener to calculate sum
        calculateButton.addActionListener(e -> {
            try {
                int sum = 0;
                for (JTextField field : elementFields) {
                    sum += Integer.parseInt(field.getText());
                }
                resultLabel.setText("Sum: " + sum);
                
             
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter only integers in element fields.");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ArraySumUI::new);
    }
}
