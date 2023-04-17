package presentation;

import javax.swing.*;
import java.awt.*;

public class Title extends JLabel {

    public Title(String title, Color background)
    {
        this.setText(title);
        this.setBackground(background);
        this.setForeground(Color.black);
        this.setFont(new Font(Font.DIALOG, Font.BOLD+Font.ITALIC, 24));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setOpaque(true);
    }
}
