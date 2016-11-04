package listeners;

import calc.Operations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import testcalc.TestCalc;


public class ButtonListener implements ActionListener{
    
    JPanel panel;
    TestCalc calc;
    
    
    public ButtonListener(JPanel panel, TestCalc calc) {
        this.panel = panel;
        this.calc = calc;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() instanceof JButton){
            JButton button = (JButton)e.getSource();
            if ( (button.getText()).equals("Сложение")){ // JOptionPane.showMessageDialog(panel, "Text");
                calc.updateRes(Double.toString((Operations.add(calc.a, calc.b))));
                
            } else if ( (button.getText()).equals("Вычитание") ){
                calc.updateRes(Double.toString((Operations.subtract(calc.a, calc.b))));
                
            } else if ( (button.getText()).equals("Умножение") ){
                calc.updateRes(Double.toString((Operations.multiply(calc.a, calc.b))));
                
            } else if ( (button.getText()).equals("Деление") ){
                calc.updateRes(Double.toString((Operations.divide(calc.a, calc.b))));
                
            }
            
        }
        
        
    }
    
    
    

}
