package testcalc;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;


public class MyJPanel extends JPanel{
    
    public MyJPanel(String name, int width, int height, LayoutManager layout) {        
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(Color.lightGray, Color.yellow), name));
        super.setLayout(layout);
    }
    

}
