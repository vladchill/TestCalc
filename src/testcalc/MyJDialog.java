package testcalc;

import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JDialog;


public class MyJDialog extends JDialog{
    
    public MyJDialog(String tittle, int width, int height, LayoutManager layout) {
        super.setTitle(tittle);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);        
        super.setLayout(layout);        
        super.setIconImage(new ImageIcon("d:\\new\\pdf.png").getImage());
    }

}
