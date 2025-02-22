import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;


public class NumberOneB {

public static void main(String[] args) {
    NumberOneB numberOneB = new NumberOneB();
}

    JFrame frame;
        JPanel bodyPanel;
        JLabel label, displayLabel;
        JTextField txtField;
        JButton button;
        public NumberOneB(){
            frame= new JFrame();
            Container getContentPane = frame.getContentPane();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            label= new JLabel("Enter a number: ");
            label.setFont( new Font("Calibri", Font.BOLD, 26));
            txtField = new JTextField(20);
            txtField.setFont( new Font("Times New Roman", Font.PLAIN, 26));
            button = new JButton("Click me");
            displayLabel = new JLabel("Result is displayed here....");
            displayLabel.setFont( new Font("Calibri", Font.BOLD, 26));
            button.addActionListener((ActionListener) e -> detectNumberType());
            bodyPanel = new JPanel();
            bodyPanel.add(label);
            bodyPanel.add(txtField);
            bodyPanel.add(button);
            bodyPanel.add(displayLabel);
            bodyPanel.setLayout(new FlowLayout());
            getContentPane.add(bodyPanel);
            frame.pack();
            frame.setVisible(true);
        }
    public void detectNumberType(){
            String input = txtField.getText().trim();
            try{
                double number = Double.parseDouble(input);
                if( number < 0)
                    displayLabel.setText("Number is negative");
                else if (number >0)
                    displayLabel.setText("Number is positive");
                else if (input.contains("."))
                    displayLabel.setText("Number is decimal");
                else
                    displayLabel.setText("Number is Zero");
            }catch(NumberFormatException nfe){
                displayLabel.setText("Invalid response!!!! Please input number.");
            }catch(NullPointerException npe){
                displayLabel.setText("You didn't input anything");
                System.out.println("You didn't input anything");
            }
    }
}
