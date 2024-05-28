package Main;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public abstract class EventWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    public EventWindow(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setLocation(350, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xB2B26));
    }

    protected void addImage(String imagePath) {
        ImageIcon image = new ImageIcon(imagePath);
        Image i1 = image.getImage().getScaledInstance(520, 520, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBackground(new Color(0xB2B26));
        Border border = BorderFactory.createLineBorder(Color.WHITE, 7);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(label);
    }

    protected void addFooter(String text) {
        JLabel footer = new JLabel(text);
        footer.setForeground(new Color(255, 250, 240));
        getContentPane().add(footer, BorderLayout.SOUTH);
    }
}