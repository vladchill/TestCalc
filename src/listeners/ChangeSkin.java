package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ChangeSkin implements ActionListener{
    
    private LookAndFeel laf1,laf2,laf;
    private JFrame frame;
        
    public ChangeSkin(JFrame frame, LookAndFeel laf1, LookAndFeel laf2){
        this.frame = frame;
        this.laf1 = laf1;
        this.laf2 = laf2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( UIManager.getLookAndFeel().equals(laf1)){
            System.out.println("11111111");
            laf = laf2;
        } else {
            System.out.println("222222");
            laf = laf1;
        }
        
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ChangeSkin.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }   

}
