package listeners;

import com.sun.corba.se.impl.protocol.giopmsgheaders.KeyAddr;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import testcalc.TestCalc;


public class TextFieldListener implements FocusListener{
    
    JPanel panel;
    TestCalc calc;
    
    public TextFieldListener(JPanel panel, TestCalc calc){
        this.panel = panel;
        this.calc = calc;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if ( e.getSource()instanceof JTextField) {
            JTextField text = (JTextField)e.getSource();
            String t = text.getText();
            if (t.trim().equals(TestCalc.INPUT_CHISLO)) {
                text.setText(null);
                text.setForeground(Color.BLACK);
            }            
//            System.out.println(t);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if ( e.getSource()instanceof JTextField) {
            JTextField text = (JTextField)e.getSource();
            String t = text.getText();
            if ( t.trim().equals("")){
                text.setText(TestCalc.INPUT_CHISLO);
                text.setForeground(Color.GRAY);
            }else if  ( text.getName().equals("dig1")) {
                calc.a = Double.parseDouble(t);
            }else if  ( text.getName().equals("dig2")) {
                calc.b = Double.parseDouble(t);
            }            
//            System.out.println(calc.a);
        }
    }

}
