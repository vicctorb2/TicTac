import javax.swing.*;
import java.awt.*;

/**
 * This class extends JButton class and have methods for working with gamefield buttons.
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

    /**
     * This is the constructor of this class wich set some params such as font, background color and the text for each button.
     */
    public Button() {
        setButtonFont(0);
        setText("");
        setBackground(col);
        setSize(200, 200);
        setFocusable(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * The another constructor of the class which set the text of the new button when it was initialized with params.
     * name parameter - is the String object.
     *
     * @param name String objects with the text wich we want to set.
     */
    public Button(String name) {
        setText(name);
    }

    /**
     * This method set the font of the button.
     *
     * @param i int identificator for choose the font of the button. 1 - classic font. 2 - styled font. 3 - "Mistral" font.
     */
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

    /**
     * This method set the background color of the button.
     *
     * @param i is the int identificator for choose the color. 1 - green color. 2 - yellow color. 3 - blue color.
     */
    public void setButtonBackground(int i) {
        if (i == 0) {
            setBackground(col);
        }
        if (i == 1) {
            setBackground(col2);
        }
        if (i == 2) {
            setBackground(col3);
        }
    }

    /**
     * This method marks the button as "X".
     */
    public void setButtonAsX() {
        setText("X");
        setFont(font);
    }

    /**
     * This method marks the button as "O".
     */
    public void setButtonAsO() {
        setText("O");
        setFont(font);
    }

    /**
     * This method set text of the button.
     *
     * @param str String object with the text we want to set as button text.
     */
    public void setButtonAs(String str) {
        setText(str);
        setFont(font);
    }

    /**
     * This method contains the algorithm which provides the main gameplay for two players.
     *
     * @param panel is the object of JPanel class.
     */
    public void gamePlay(Panel panel) {
        if (GamePlay.firstplayer) {
            if (this.getText() == "") {
                GamePlay.count--;
                this.setButtonAsX();
                if (!Panel.playwithbot) {
                    GamePlay.firstplayer = false;
                    GamePlay.secondplayer = true;
                }
            }
        } else {
            if (this.getText() == "") {
                GamePlay.count--;
                this.setButtonAsO();
                if (!Panel.playwithbot) {
                    GamePlay.firstplayer = true;
                    GamePlay.secondplayer = false;
                }
            }
        }

    }

}
