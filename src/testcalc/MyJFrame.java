package testcalc;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {

    public MyJFrame(String tittle, int width, int height, LayoutManager layout, boolean isPictureFromNet) {
        super.setTitle(tittle);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);
        if (isPictureFromNet) {
            super.setIconImage(getImageFromNet());
        } else {
            super.setIconImage(new ImageIcon(getClass().getResource("/icon/pdf.png")).getImage());
        }
    }

    private BufferedImage getImageFromNet() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png"));
        } catch (IOException ex) {
            Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }


}
