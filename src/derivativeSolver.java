import javax.swing.*;

public class derivativeSolver {
    /*
    This program will:
    1. ask for the full problem
    2. then solve for the derivative
    3. display solution
     */

    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel();
    static JTextField xFactor5Input, xFactor4Input, xFactor3Input, xFactor2Input, xFactor1Input, doesntMatterMuch;
    static JLabel problemLabel = new JLabel("x⁵ +      x⁴ +      x³ +      x² +      x +");

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This program solves derivatives (Max power of 5)");

        createTextFields();

    }

    public static void createTextFields(){
        System.out.println("running createTextFields function");

        xFactor5Input = new JTextField(3);
        xFactor4Input = new JTextField(3);
        xFactor3Input = new JTextField(3);
        xFactor2Input = new JTextField(3);
        xFactor1Input = new JTextField(3);
        doesntMatterMuch = new JTextField(3);

        System.out.println("Text fields created successfully");
    }
}
