package testcalc;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import listeners.ButtonListener;
import listeners.ChangeSkin;
import listeners.TextFieldListener;

public class TestCalc {
    
    public static final String INPUT_CHISLO = "vvedite chislo";
        
    private MyJFrame frame;
        
    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;  
    
    private MyJLabel labelDig1;
    private MyJLabel labelDig2;
    private MyJLabel labelRes;
    
    private MyJTextField textDig1;
    private MyJTextField textDig2;
    private MyJTextField textRes;
 
    private MyJButton addButt;
    private MyJButton subButt;
    private MyJButton multButt;
    private MyJButton divButt; 
    private MyJButton skinButt;
    TestCalc cal;
    public double a;
    public double b;
    
    
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new SmartLookAndFeel());  //SmartLookAndFeel()    NimbusLookAndFeel()
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestCalc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        TestCalc calc = new TestCalc();
        calc.cal = calc;
        
        calc.createButtons();
        calc.createLabels();
        calc.createTextField();        
        calc.createPanels();        
        calc.createFrame();
            
    }
    
    private void createButtons() {        
        addButt = new MyJButton("Сложение");
        addButt.setVerticalAlignment(JButton.BOTTOM);               
        subButt = new MyJButton("Вычитание");        
        multButt = new MyJButton("Умножение");
        divButt = new MyJButton("Деление");
        skinButt = new MyJButton("Сменить скин");
        
        addButtonListeners();
    }
    
    private void createLabels() {
        labelDig1 = new MyJLabel("Число 1");        
        labelDig2 = new MyJLabel("Число 2");
        labelRes = new MyJLabel("Результат");        
    }
    
    private void createTextField() {
        textDig1 = new MyJTextField(INPUT_CHISLO,10);
        textDig2 = new MyJTextField(INPUT_CHISLO,10);        
        textDig1.setName("dig1");        
        textDig2.setName("dig2");
        addTextListeners();        
        
        textRes = new MyJTextField(15, Color.RED);
        textRes.setEditable(false);
        textRes.setFocusable(false);        
    }
    
    private void createPanels() {
        panel1 = new MyJPanel("panel1", 100, 100, new FlowLayout(FlowLayout.LEFT)); 
        panel1.setPreferredSize(new Dimension(200, 50));        
        panel1.add(labelDig1);
        panel1.add(textDig1);
        panel1.add(labelDig2);
        panel1.add(textDig2);
        
        panel2 = new MyJPanel("panel2", 100, 100, new FlowLayout(FlowLayout.LEFT));
        panel2.setPreferredSize(new Dimension(200, 50));        
        panel2.add(addButt);
        panel2.add(subButt);
        panel2.add(multButt);
        panel2.add(divButt);
        
        panel3 = new MyJPanel("panel2", 100, 100, new FlowLayout(FlowLayout.LEFT));
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.add(labelRes);
        panel3.add(textRes);   
        panel3.add(skinButt);
        
    }
    
 
    private void createFrame() {
        frame = new MyJFrame("My calculator", 430, 200, new BorderLayout(2, 2),false);
        frame.setMinimumSize(new Dimension(430, 200));
        frame.setResizable(false);
        
        frame.getContentPane().add(panel1, BorderLayout.NORTH);        
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);
        
        createSkinListener();
        frame.setVisible(true);
        
        
    }
    
    private void addButtonListeners() {        
        ButtonListener bl = new ButtonListener(panel2, cal);
        
        addButt.addActionListener(bl);
        subButt.addActionListener(bl);
        divButt.addActionListener(bl);
        multButt.addActionListener(bl);
    }
    
    private void addTextListeners() {
        TextFieldListener ls = new TextFieldListener(panel1, cal);
        textDig1.addFocusListener(ls);
        textDig2.addFocusListener(ls);        
        KeyAdapter key = new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()))e.consume();
            }
            
};
    textDig1.addKeyListener(key);
    textDig2.addKeyListener(key);
    }    
    
    public void updateRes(String res){
        textRes.setText(res);
    }
    
    private void createSkinListener(){
        skinButt.addActionListener(new ChangeSkin(frame, new AeroLookAndFeel(), new SmartLookAndFeel()));
    }
    
}
