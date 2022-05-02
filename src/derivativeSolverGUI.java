import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class derivativeSolverGUI {
    /*
    This program will:
    1. ask for the full problem
    2. then solve for the derivative
    3. display solution
     */

    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel();
    static JTextField xFactor5Input = new JTextField(3);
    static JTextField xFactor4Input = new JTextField(3);
    static JTextField xFactor3Input = new JTextField(3);
    static JTextField xFactor2Input = new JTextField(3);
    static JTextField xFactor1Input = new JTextField(3);
    static JTextField doesntMatterMuch = new JTextField(3);
    static JButton submitButton = new JButton("Submit");
    static double xFactor1, xFactor2, xFactor3, xFactor4, xFactor5;

    public derivativeSolverGUI() {
        JOptionPane.showMessageDialog(null, "This program solves derivatives (Max power of 5)");

        displayFirstScreen();

    }

    public static void displayFirstScreen(){
        frame.setSize(700, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        submitButton.addActionListener(new submitActionListener());
        submitButton.setBounds(500, 150, 75, 25);

        panel.add(xFactor5Input);
        panel.add(new JLabel("x⁵+\n"));
        panel.add(xFactor4Input);
        panel.add(new JLabel("x⁴+\n"));
        panel.add(xFactor3Input);
        panel.add(new JLabel("x³+\n"));
        panel.add(xFactor2Input);
        panel.add(new JLabel("x²+\n"));
        panel.add(xFactor1Input);
        panel.add(new JLabel("x+\n"));
        panel.add(doesntMatterMuch);
        panel.add(submitButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static class submitActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            xFactor1 = parseXFactor(xFactor1Input);
            xFactor2 = parseXFactor(xFactor2Input);
            xFactor3 = parseXFactor(xFactor3Input);
            xFactor4 = parseXFactor(xFactor4Input);
            xFactor5 = parseXFactor(xFactor5Input);

            frame.setVisible(false);

            String finalOutput = "Answer: ";

            Boolean notFirstNum = false;

            if (xFactor5 != 0.0){
                notFirstNum = true;
                finalOutput += xFactor5 * 5.0;
                finalOutput += "x⁴";
            }
            if (xFactor4 != 0.0){
                if (notFirstNum){
                    finalOutput += "+";
            }

                finalOutput += xFactor5 * 4.0;
                finalOutput += "x³";
            }
            if (xFactor3 != 0.0){
                if (notFirstNum){
                    finalOutput += "+";
                }
                finalOutput += xFactor5 * 3.0;
                finalOutput += "x²";
            }
            if (xFactor2 != 0.0){
                if (notFirstNum){
                    finalOutput += "+";
                }
                finalOutput += xFactor5 * 2.0;
                finalOutput += "x";
            }
            if (xFactor1 != 0.0){
                if (notFirstNum){
                    finalOutput += "+";
                }
                finalOutput += xFactor5;
            }
            JOptionPane.showMessageDialog(null, finalOutput);
        }
    }

    public static double parseXFactor(JTextField textField){
        try{
            return Double.parseDouble(textField.getText());
        } catch (Exception e){
            if (!Objects.equals(textField.getText(), "")){
                JOptionPane.showMessageDialog(null, "Error: " + textField.getText() + " is not a number. Defaulting to 0.");
            }
            return 0.0;
        }
    }
}
