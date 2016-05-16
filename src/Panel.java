
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

    static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    static boolean firstplayer = true;
    static boolean secondplayer = false;
    static boolean playwithbot = false;
    static boolean autoplay = false;
    static String temp = "";
    static File file;
    static int turn = 0;
    static int type = 0;

    static int count = 9;

    /**
     * In the constructor of this class we initialize 9 buttons and the file for our log and add this elements
     * on the panel, also there is method "setListeners" which add the event listeners for our buttons.
     */
    public Panel() {
        file = new File("D:\\TicTac\\src\\Log.txt");
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
            b1.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b2.addActionListener(e -> {
            b2.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b3.addActionListener(e -> {
            b3.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b4.addActionListener(e -> {
            b4.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b5.addActionListener(e -> {
            b5.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b6.addActionListener(e -> {
            b6.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b7.addActionListener(e -> {
            b7.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b8.addActionListener(e -> {
            b8.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });
        b9.addActionListener(e -> {
            b9.gamePlay(Panel.this);
            if (playwithbot) {
                botGameplay();
            }
        });

    }

    /**
     * This method check the winner of the played last game and show the information of this to the screen.
     * After we have show the winner to te screen, we run restart method, if we need it.
     *
     * @return returns true if the winner was found.
     */
    public static boolean checkWinner() {
        if (b1.getText() != "" && b2.getText() != "" && b3.getText() != "") {
            if (b1.getText() == b2.getText() && b2.getText() == b3.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b1.getText() + "!");
                restart();
                return true;
            }
        }
        if (b4.getText() != "" && b5.getText() != "" && b6.getText() != "") {
            if (b4.getText() == b5.getText() && b5.getText() == b6.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b4.getText() + "!");
                restart();
                return true;
            }
        }
        if (b7.getText() != "" && b8.getText() != "" && b9.getText() != "") {
            if (b7.getText() == b8.getText() && b8.getText() == b9.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b7.getText() + "!");
                restart();
                return true;
            }
        }
        if (b1.getText() != "" && b4.getText() != "" && b7.getText() != "") {
            if (b1.getText() == b4.getText() && b4.getText() == b7.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b1.getText() + "!");
                restart();
                return true;
            }
        }
        if (b2.getText() != "" && b5.getText() != "" && b8.getText() != "") {
            if (b2.getText() == b5.getText() && b5.getText() == b8.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b2.getText() + "!");
                restart();
                return true;
            }
        }
        if (b3.getText() != "" && b6.getText() != "" && b9.getText() != "") {
            if (b3.getText() == b6.getText() && b6.getText() == b9.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b3.getText() + "!");
                restart();
                return true;
            }
        }
        if (b7.getText() != "" && b5.getText() != "" && b3.getText() != "") {
            if (b7.getText() == b5.getText() && b5.getText() == b3.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b7.getText() + "!");
                restart();
                return true;
            }
        }
        if (b1.getText() != "" && b5.getText() != "" && b9.getText() != "") {
            if (b1.getText() == b5.getText() && b5.getText() == b9.getText()) {
                JOptionPane.showMessageDialog(null, "Победил " + b1.getText() + "!");
                restart();
                return true;
            }
        }
        if (b1.getText() != "" && b2.getText() != "" && b3.getText() != "" &&
                b4.getText() != "" && b5.getText() != "" && b6.getText() != "" &&
                b7.getText() != "" && b8.getText() != "" && b9.getText() != "") {
            JOptionPane.showMessageDialog(null, "No winners");
            restart();
        }
        return false;
    }

    /**
     * This method restarts or close app (if we don't need to restart game).
     */
    public static void restart() {

        if (JOptionPane.showConfirmDialog(null, "Restart?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            firstplayer = true;
            secondplayer = false;
            turn = 0;
            file.delete();
            if (playwithbot) {
                count = 5;
            } else {
                count = 9;
            }
        } else {
            System.exit(0);
        }
    }

    /**
     * This method restarts the game without confirmation
     */
    public static void restart_without_confirm() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        firstplayer = true;
        secondplayer = false;
        if (playwithbot) {
            count = 5;
        } else {
            count = 9;
        }
    }

    /**
     * This method contains the algorithm for computer (bot) for playing the game without second player.
     */
    public void botGameplay() {
        if ((b1.getText() == "X" && b2.getText() == "X") ||
                (b2.getText() == "X" && b3.getText() == "X") ||
                (b1.getText() == "X" && b3.getText() == "X")) {
            if (b1.getText() == b2.getText()) {
                if (b3.getText() != "O") {
                    b3.setButtonAsO();
                    return;
                }
            }
            if (b2.getText() == b3.getText()) {
                if (b1.getText() != "O") {
                    b1.setButtonAsO();
                    return;
                }
            }
            if (b1.getText() == b3.getText()) {
                if (b2.getText() != "O") {
                    b2.setButtonAsO();
                    return;
                }
            }
        }
        if ((b4.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b6.getText() == "X") ||
                (b4.getText() == "X" && b6.getText() == "X")) {
            if (b4.getText() == b5.getText()) {
                if (b6.getText() != "O") {
                    b6.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b6.getText()) {
                if (b4.getText() != "O") {
                    b4.setButtonAsO();
                    return;
                }
            }
            if (b4.getText() == b6.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if ((b7.getText() == "X" && b8.getText() == "X") ||
                (b8.getText() == "X" && b9.getText() == "X") ||
                (b7.getText() == "X" && b9.getText() == "X")) {
            if (b7.getText() == b8.getText()) {
                if (b9.getText() != "O") {
                    b9.setButtonAsO();
                    return;
                }
            }
            if (b8.getText() == b9.getText()) {
                if (b7.getText() != "O") {
                    b7.setButtonAsO();
                    return;
                }
            }
            if (b7.getText() == b9.getText()) {
                if (b8.getText() != "O") {
                    b8.setButtonAsO();
                    return;
                }
            }
        }
        if ((b1.getText() == "X" && b4.getText() == "X") ||
                (b4.getText() == "X" && b7.getText() == "X") ||
                (b1.getText() == "X" && b7.getText() == "X")) {
            if (b1.getText() == b4.getText()) {
                if (b7.getText() != "O") {
                    b7.setButtonAsO();
                    return;
                }
            }
            if (b4.getText() == b7.getText()) {
                if (b1.getText() != "O") {
                    b1.setButtonAsO();
                    return;
                }
            }
            if (b1.getText() == b7.getText()) {
                if (b4.getText() != "O") {
                    b4.setButtonAsO();
                    return;
                }
            }
        }
        if ((b2.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b8.getText() == "X") ||
                (b2.getText() == "X" && b8.getText() == "X")) {
            if (b2.getText() == b5.getText()) {
                if (b8.getText() != "O") {
                    b8.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b8.getText()) {
                if (b2.getText() != "O") {
                    b2.setButtonAsO();
                    return;
                }
            }
            if (b2.getText() == b8.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if ((b3.getText() == "X" && b6.getText() == "X") ||
                (b6.getText() == "X" && b9.getText() == "X") ||
                (b3.getText() == "X" && b9.getText() == "X")) {
            if (b3.getText() == b6.getText()) {
                if (b9.getText() != "O") {
                    b9.setButtonAsO();
                    return;
                }
            }
            if (b6.getText() == b9.getText()) {
                if (b3.getText() != "O") {
                    b3.setButtonAsO();
                    return;
                }
            }
            if (b3.getText() == b9.getText()) {
                if (b6.getText() != "O") {
                    b6.setButtonAsO();
                    return;
                }
            }
        }
        if ((b1.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b9.getText() == "X") ||
                (b1.getText() == "X" && b9.getText() == "X")) {
            if (b1.getText() == b5.getText()) {
                if (b9.getText() != "O") {
                    b9.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b9.getText()) {
                if (b1.getText() != "O") {
                    b1.setButtonAsO();
                    return;
                }
            }
            if (b1.getText() == b9.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if ((b7.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b3.getText() == "X") ||
                (b7.getText() == "X" && b3.getText() == "X")) {
            if (b7.getText() == b5.getText()) {
                if (b3.getText() != "O") {
                    b3.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b3.getText()) {
                if (b7.getText() != "O") {
                    b7.setButtonAsO();
                    return;
                }
            }
            if (b3.getText() == b7.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if (b1.getText() == "") {
            b1.setButtonAsO();
            return;
        }
        if (b5.getText() == "") {
            b5.setButtonAsO();
            return;
        }
        if (b3.getText() == "") {
            b3.setButtonAsO();
            return;
        }
        if (b7.getText() == "") {
            b7.setButtonAsO();
            return;
        }
        if (b9.getText() == "") {
            b9.setButtonAsO();
            return;
        }
        if (b2.getText() == "") {
            b2.setButtonAsO();
            return;
        }
        if (b4.getText() == "") {
            b4.setButtonAsO();
            return;
        }
        if (b6.getText() == "") {
            b6.setButtonAsO();
        }
        if (b8.getText() == "") {
            b8.setButtonAsO();
            return;
        }
    }

    /**
     * This method allow computer to play one game itself, and creates the log file with the information of all actions of the computer
     * while it was playing.
     */
    public static void autoPlay() {
        int rand = 0;
        String strX = "X";
        String strO = "O";
        String str = strX;
        file.delete();
        while (b1.getText() == "" || b2.getText() == "" || b3.getText() == "" ||
                b4.getText() == "" || b5.getText() == "" || b6.getText() == "" ||
                b7.getText() == "" || b8.getText() == "" || b9.getText() == "") {

            rand = (int) Math.abs(Math.random() * 10 % 9);

            if (rand == 0) {
                if (b1.getText() == "") {
                    turn++;
                    writeLog(rand, str);
                    b1.setButtonAs(str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 1) {
                if (b2.getText() == "") {
                    turn++;
                    writeLog(rand, str);
                    b2.setButtonAs(str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 2) {
                if (b3.getText() == "") {
                    b3.setButtonAs(str);
                    turn++;
                    writeLog(rand, str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 3) {
                if (b4.getText() == "") {
                    b4.setButtonAs(str);
                    turn++;
                    writeLog(rand, str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 4) {
                if (b5.getText() == "") {
                    b5.setButtonAs(str);
                    turn++;
                    writeLog(rand, str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 5) {
                if (b6.getText() == "") {
                    b6.setButtonAs(str);
                    turn++;
                    writeLog(rand, str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 6) {
                if (b7.getText() == "") {
                    b7.setButtonAs(str);
                    turn++;
                    writeLog(rand, str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 7) {
                if (b8.getText() == "") {
                    b8.setButtonAs(str);
                    turn++;
                    writeLog(rand, str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 1;
                    }
                }
            }
            if (rand == 8) {
                if (b9.getText() == "") {
                    b9.setButtonAs(str);
                    turn++;
                    writeLog(rand, str);
                    if (str == strX) {
                        str = strO;
                        type = 2;
                    } else {
                        str = strX;
                        type = 2;
                    }
                }
            }
        }
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

    /**
     * Method for write log from the autoplay mode.
     *
     * @param rand the number of the button which was randomly choosen in autoplay method
     * @param str  the text we set this button (may be "X" or "O")
     */
    public static void writeLog(int rand, String str) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(String.valueOf(turn));
            writer.append(' ');
            writer.write(String.valueOf(rand));
            writer.append(' ');
            writer.write(str);
            writer.append(' ');
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

