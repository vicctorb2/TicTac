import sun.font.FontLineMetrics;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

/**
 * Created by ррор on 24.02.2016.
 */
public class Button extends JButton {
    static Color col = new Color(211, 255, 147);
    static Font font;

    Color col1 = new Color(211, 255, 147);
    Color col2 = new Color(255, 251, 147);
    Color col3 = new Color(135, 255, 243);

    Font font2 = new Font("Buxton Sketch", Font.BOLD, 110);
    Font font1 = new Font("Century Gothic", Font.BOLD, 110);
    Font font3 = new Font("Mistral", Font.BOLD, 110);

    public Button() {
        setButtonFont(0);
        setText("");
        setBackground(col);
        setSize(200, 200);
        setFocusable(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public Button(String name) {
        setText(name);
    }

    public void setButtonFont(int i) {
        if (i == 0) {
            font = font1;
        }
        if (i == 1) {
            font = font2;
        }
        if (i == 2) {
            font = font3;
        }
    }

    public void setButtonBackground(int i){
        if(i==0){
            setBackground(col);
        }
        if(i==1){
            setBackground(col2);
        }
        if(i==2){
            setBackground(col3);
        }
    }

    public void setButtonAsX(Panel panel) {
        setText("X");
        setFont(font);
        if(panel.checkWinner()) {
            JOptionPane.showMessageDialog(null, "Победил Х!");
            panel.restart();
        }
    }

    public void setButtonAsO(Panel panel) {
        setText("O");
        setFont(font);
        if(panel.checkWinner()) {
            JOptionPane.showMessageDialog(null, "Победил O!");
            panel.restart();
        }
    }

    public void gamePlay(Panel panel) {
        if (panel.firstplayer) {
            if (this.getText() == "") {
                panel.count--;
                this.setButtonAsX(panel);
                if(!panel.playwithbot) {
                    panel.firstplayer = false;
                    panel.secondplayer = true;
                }
            }
        } else {
            if (this.getText() == "") {
                panel.count--;
                this.setButtonAsO(panel);
                if(!panel.playwithbot) {
                    panel.firstplayer = true;
                    panel.secondplayer = false;
                }
            }
        }

    }

}
