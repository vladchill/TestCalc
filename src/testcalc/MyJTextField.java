package testcalc;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;


public class MyJTextField extends JTextField{
    
    public MyJTextField(String digit, int columns) {
        super.setColumns(columns);  
        super.setFont(new Font("Courier", Font.ITALIC, 12));
        super.setForeground(Color.GRAY);
        super.setText(digit);
    }
    
    public MyJTextField(int columns, Color color) {
        super.setColumns(columns);  
        super.setFont(new Font("Courier", Font.ITALIC, 12));
        super.setForeground(color);
        
    }

}
