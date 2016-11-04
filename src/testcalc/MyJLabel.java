package testcalc;

import javax.swing.JLabel;


public class MyJLabel extends JLabel{
    
    public MyJLabel(String text) {
        super.setText(text);
        super.setVerticalTextPosition(JLabel.BOTTOM);
    }

}
