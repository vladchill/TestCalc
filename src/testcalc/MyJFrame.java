package testcalc;

import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame{
//       BufferedImage img;
    
    public MyJFrame(String tittle, int width, int height, LayoutManager layout){        
        super.setTitle(tittle);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);
//        try {
//            img = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png"));
//        } catch (IOException ex) {
//            Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        super.setIconImage((Image)img);        
        super.setIconImage( new ImageIcon(getClass().getResource("/icon/pdf.png")).getImage() );
    }   
      

}
