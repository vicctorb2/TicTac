import Statistic.*;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for tne main functions and algorithms of the game such as restart, botGameplay, autoplay,
 * logging last game.
 */
public class GamePlay {

    static File file = new File("D:\\TicTac\\src\\Log.txt");
    static int turn = 0;
    static int type = 0;
    static boolean firstplayer = true;
    static boolean secondplayer = false;
    static boolean autoplay = false;
    static int count = 9;
    static Button b1 = Panel.b1;
    static Button b2 = Panel.b2;
    static Button b3 = Panel.b3;
    static Button b4 = Panel.b4;
    static Button b5 = Panel.b5;
    static Button b6 = Panel.b6;
    static Button b7 = Panel.b7;
    static Button b8 = Panel.b8;
    static Button b9 = Panel.b9;

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
            if (Panel.playwithbot) {
                count = 5;
            } else {
                count = 9;
            }
            CheckWinners.start();
        } else {
            System.exit(0);
        }
    }

    /**
     * This method restarts the game without confirmation
     */
    public static void restartWithoutConfirm() {
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
        if (Panel.playwithbot) {
            count = 5;
        } else {
            count = 9;
        }
    }

    /**
     * This method contains the algorithm for computer (bot) for playing the game without second player.
     */
    public static void botGameplay() {
        if ((b1.getText() == "X" && b2.getText() == "X") ||
                (b2.getText() == "X" && b3.getText() == "X") ||
                (b1.getText() == "X" && b3.getText() == "X")
                ) {
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
     * Method for write log from the autoplay mode.
     *
     * @param rand the number of the button which was randomly choosen in autoplay method
     * @param str  the text we set this button (may be "X" or "O")
     */
    public static void writeLog(int rand, String str) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(str);
            writer.append(" ");
            writer.write(String.valueOf(rand));
            writer.append("\r\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void loadGame() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\TicTac\\src\\Log.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        String str = "";
        char c;
        int symbol = 0;
        try {
            assert bufferedReader != null;
            symbol = bufferedReader.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        while (symbol != -1) {
            c = (char) symbol;
            if (c == 'X') {
                str = "X";
            } else if (c == 'O') {
                str = "O";
            }
            if (c == '0') {
                b1.setButtonAs(str);
            }
            if (c == '1') {
                b2.setButtonAs(str);
            }
            if (c == '2') {
                b3.setButtonAs(str);
            }
            if (c == '3') {
                b4.setButtonAs(str);
            }
            if (c == '4') {
                b5.setButtonAs(str);
            }
            if (c == '5') {
                b6.setButtonAs(str);
            }
            if (c == '6') {
                b7.setButtonAs(str);
            }
            if (c == '7') {
                b8.setButtonAs(str);
            }
            if (c == '8') {
                b9.setButtonAs(str);
            }
            try {
                symbol = bufferedReader.read(); // Читаем символ
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void javaSort() {
        JavaSort javaSort = new JavaSort();

        List<Notation> notations = new ArrayList<Notation>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s = reader.readLine();
            while (s != null) {
                String[] split = s.split(" ");
                Notation notation = new Notation(
                        split[0],
                        Integer.parseInt(split[1])
                );
                notations.add(notation);
                s = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Notation[] n = new Notation[notations.size()];

        for (int i = 0; i < notations.size(); i++) {
            n[i] = notations.get(i);
        }

        long time = System.currentTimeMillis();
        javaSort.qSort(n, 0, n.length - 1);

        time = System.currentTimeMillis() - time;
        new SortTable("Java", n, Long.toString(time));

    }

    public static void scalaSort() {
        ScalaSort scalaSort = new ScalaSort();

        List<Notation> notations = new ArrayList<Notation>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s = reader.readLine();
            while (s != null) {
                String[] split = s.split(" ");
                Notation notation = new Notation(
                        split[0],
                        Integer.parseInt(split[1])
                );
                notations.add(notation);
                s = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Notation[] n = new Notation[notations.size()];

        for (int i = 0; i < notations.size(); i++) {
            n[i] = notations.get(i);
        }

        long time = System.currentTimeMillis();
        scalaSort.sort(n);

        time = System.currentTimeMillis() - time;
        new SortTable("Scala", n, Long.toString(time));
    }

    public static void notationTransform() {
        List<Notation> notations = new ArrayList<Notation>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s = reader.readLine();
            while (s != null) {
                String[] split = s.split(" ");
                Notation notation = new Notation(
                        split[0],
                        Integer.parseInt(split[1])
                );
                notations.add(notation);
                s = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        NotationTransformer notationTransformer = new NotationTransformer();
        int size = 0;
        System.out.println("New botgame is started.");
        for (int i = 0; i < notations.size(); i++) {
            size++;
            System.out.println(notationTransformer.parse(notations.get(i)));
        }

        System.out.println(notationTransformer.parse(size));
    }

    public static void scalaStatistic() {

        List<Notation> notations = new ArrayList<Notation>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s = reader.readLine();
            while (s != null) {
                String[] split = s.split(" ");
                Notation notation = new Notation(
                        split[0],
                        Integer.parseInt(split[1])
                );
                notations.add(notation);
                s = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Notation[] n = new Notation[notations.size()];

        for (int i = 0; i < notations.size(); i++) {
            n[i] = notations.get(i);
        }

        ScalaStatistic scalaStatistic = new ScalaStatistic();
        scalaStatistic.getStatistic(n);
    }
}
