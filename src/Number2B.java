import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Number2B {
    
    
    Number2B(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("What level are you: ");
        String[] level= {"","100", "200", "300", "400"};
        JComboBox<String> levelComboBox = new JComboBox<>(level);
        JLabel welcomLabel = new JLabel("Welcome Page");
        welcomLabel.setForeground(Color.RED);
        welcomLabel.setFont(new Font("Arial", Font.ITALIC, 32));
        
        JButton button = new JButton("Proceed");
        button.addActionListener(e -> {
            String selectedLevel = (String) levelComboBox.getSelectedItem();
            if(selectedLevel.equals("100")){
                welcomLabel.setText("Welcome dear Fresher");
            }else if(selectedLevel.equals("200")){
                welcomLabel.setText("Welcome dear 200L DE Fresher");
            }else if(selectedLevel.equals("300")){
                welcomLabel.setText("Welcome dear 300L Staylite");
            }else if(selectedLevel.equals("400")){
                welcomLabel.setText("Welcome dear 400L Staylite");
            }
        });
    

        Container getContentPane= frame.getContentPane();
        getContentPane.add(label);
        getContentPane.add(levelComboBox);
        getContentPane.add(button);
        getContentPane.add(welcomLabel);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Number2B();
    }
}
