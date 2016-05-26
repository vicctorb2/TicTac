import javax.swing.*;

/**
 * This class checks the winner of the game in another thread of the app.
 */
public class CheckWinners implements Runnable {

    private static volatile boolean run = true;

    public static void start() {
        run = true;
    }

    public static void stop() {
        run = false;
    }

    /**
     * This method check the winner of the played last game and show the information of this to the screen.
     * After we have show the winner to te screen, we run restart method, if we need it.
     * Works in another thread
     */
    @Override
    public void run() {

        while (true) {

            if (run) {
                if (Panel.b1.getText() != "" && Panel.b2.getText() != "" && Panel.b3.getText() != "") {
                    if (Panel.b1.getText() == Panel.b2.getText() && Panel.b2.getText() == Panel.b3.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b1.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b4.getText() != "" && Panel.b5.getText() != "" && Panel.b6.getText() != "") {
                    if (Panel.b4.getText() == Panel.b5.getText() && Panel.b5.getText() == Panel.b6.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b4.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b7.getText() != "" && Panel.b8.getText() != "" && Panel.b9.getText() != "") {
                    if (Panel.b7.getText() == Panel.b8.getText() && Panel.b8.getText() == Panel.b9.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b7.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b1.getText() != "" && Panel.b4.getText() != "" && Panel.b7.getText() != "") {
                    if (Panel.b1.getText() == Panel.b4.getText() && Panel.b4.getText() == Panel.b7.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b1.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b2.getText() != "" && Panel.b5.getText() != "" && Panel.b8.getText() != "") {
                    if (Panel.b2.getText() == Panel.b5.getText() && Panel.b5.getText() == Panel.b8.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b2.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b3.getText() != "" && Panel.b6.getText() != "" && Panel.b9.getText() != "") {
                    if (Panel.b3.getText() == Panel.b6.getText() && Panel.b6.getText() == Panel.b9.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b3.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b7.getText() != "" && Panel.b5.getText() != "" && Panel.b3.getText() != "") {
                    if (Panel.b7.getText() == Panel.b5.getText() && Panel.b5.getText() == Panel.b3.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b7.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b1.getText() != "" && Panel.b5.getText() != "" && Panel.b9.getText() != "") {
                    if (Panel.b1.getText() == Panel.b5.getText() && Panel.b5.getText() == Panel.b9.getText()) {
                        JOptionPane.showMessageDialog(null, "Победил " + Panel.b1.getText() + "!");
                        run = false;
                        GamePlay.restart();
                    }
                }
                if (Panel.b1.getText() != "" && Panel.b2.getText() != "" && Panel.b3.getText() != "" &&
                        Panel.b4.getText() != "" && Panel.b5.getText() != "" && Panel.b6.getText() != "" &&
                        Panel.b7.getText() != "" && Panel.b8.getText() != "" && Panel.b9.getText() != "") {
                    JOptionPane.showMessageDialog(null, "No winners");
                    run = false;
                    GamePlay.restart();
                }
            }

        }

    }

}
