
import javax.swing.*;
import java.awt.*;

/**
 * This class create the Panel and add the elements of the game field to the main frame of the app.
 * Panel class extends JPanel class. In this claas were created the elements of the game: 9 buttons (JButton class),
 * and added the listeners for each button.
 * Also there are some methods which do such functions as restart, autoplay and the method which check the winner
 * of the last game.
 * In the autoPlay method we also write a log, which contains all information of the last played game.
 * This log allow us to replay the last game.
 */

public class Panel extends JPanel {

    public static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    static boolean playwithbot = false;

    /**
     * In the constructor of this class we initialize 9 buttons and the file for our log and add this elements
     * on the panel, also there is method "setListeners" which add the event listeners for our buttons.
     */
    public Panel() {
        b1 = new Button();
        b2 = new Button();
        b3 = new Button();
        b4 = new Button();
        b5 = new Button();
        b6 = new Button();
        b7 = new Button();
        b8 = new Button();
        b9 = new Button();
        setLayout(new GridLayout(3, 3));
        addOnPanel();
        setListeners();
    }

    /**
     * This is the method for adding the event listeners to our buttons.
     */
    private void setListeners() {
        b1.addActionListener(e -> {
            if (b1.getText()==""){
                b1.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b2.addActionListener(e -> {
            if (b2.getText()=="") {
                b2.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b3.addActionListener(e -> {
            if (b3.getText()=="") {
                b3.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b4.addActionListener(e -> {
            if (b4.getText()=="") {
                b4.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b5.addActionListener(e -> {
            if (b5.getText()=="") {
                b5.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b6.addActionListener(e -> {
            if (b6.getText()=="") {
                b6.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b7.addActionListener(e -> {
            if (b7.getText()=="") {
                b7.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b8.addActionListener(e -> {
            if (b8.getText()=="") {
                b8.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });
        b9.addActionListener(e -> {
            if (b9.getText()=="") {
                b9.gamePlay(Panel.this);
                if (playwithbot) {
                    GamePlay.botGameplay();
                }
            }
        });

    }

    /**
     * Add the elements to the panel (9 buttons)
     */
    public void addOnPanel() {
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
    }
}

