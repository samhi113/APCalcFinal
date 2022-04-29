import javax.swing.*;

public class derivativeSolver {
    /*
    This program will:
    1. ask for the full problem
    2. then solve for the derivative
    3. display solution
     */

    static JFrame frame = new JFrame();
    static JPanel panel1, panel2 = new JPanel();
    static JTextField xFactor5Input, xFactor4Input, xFactor3Input, xFactor2Input, xFactor1Input, doesntMatterMuch = new JTextField(3);
    static JLabel problemLabel = new JLabel("x⁵ +      x⁴ +      x³ +      x² +      x +");
    static JButton submitButton = new JButton("Submit");
    static JButton returnButton = new JButton("Return");

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This program solves derivatives (Max power of 5)");

        displayFirstScreen();

    }

    public static void displayFirstScreen(){
        frame.setSize(700, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //submitButton.addActionListener(new submitListener());
        submitButton.setBounds(500, 150, 75, 25);

        problemLabel.setBounds(75, 100, 500, 25);

        xFactor5Input.setLocation(50, 100);
        xFactor4Input.setLocation(150, 100);
        xFactor3Input.setLocation(250, 100);
        xFactor2Input.setLocation(350, 100);
        xFactor1Input.setLocation(450, 100);
        doesntMatterMuch.setLocation(550, 100);

        panel1.add(submitButton);
        panel1.add(problemLabel);
        panel1.add(xFactor5Input);
        panel1.add(xFactor4Input);
        panel1.add(xFactor3Input);
        panel1.add(xFactor2Input);
        panel1.add(xFactor1Input);
        panel1.add(doesntMatterMuch);

        frame.add(panel1);
        frame.setVisible(true);
    }
}
