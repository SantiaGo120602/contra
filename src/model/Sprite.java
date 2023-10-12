package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sprite {
    private JLabel image;

    

    private void loadImage(String imagePath) {
        try {
            BufferedImage image0 = ImageIO.read(new File(imagePath));
            Image scaledImage = image0.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            image.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
