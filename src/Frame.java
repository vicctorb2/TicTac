
import javax.swing.*;

/**
 * Class Frame extend JFrame class. In this class we created the mainframe and add the Panel on it.
 * Class Frame consist of some methods such as "addPanelonFrame" which add Panel on mainframe,
 * "createMenu" which create menu on the top side of the mainframe and consist of 1 menubar, 4 menus.
 * In the constructor of this class we apply params for mainframe GUI and add the panel on frame.
 */
public class Frame extends JFrame {
    Panel panel = new Panel();
    Button button = new Button();

    /**
     * In the constructor of this class we apply params for mainframe GUI and add the panel on frame.
     */
    public Frame() {
        createMenu();
        setTitle("TicTac");
        setSize(600, 600);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setFocusable(true);
        setLocationRelativeTo(null);
        setResizable(false);
        this.addPanelOnFrame(panel);
    }

    /**
     * In this class we add the panel on frame.
     *
     * @param panel the JPanel which  we want to add to the JFrame
     */
    public void addPanelOnFrame(JPanel panel) {
        this.getContentPane().add(panel);
        panel.setVisible(true);
        revalidate();
    }

    /**
     * Method creates menubar with 4 menus in it and add this on mainframe.
     */
    public void createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu menu2 = new JMenu("Set Text Style");
        JMenu menu3 = new JMenu("Set Background");
        JMenu menu4 = new JMenu("Set Play Mode");
        JMenu menu5 = new JMenu("Statistic");

        JMenuItem restart = new JMenuItem("Restart now");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem classic = new JMenuItem("Classic");
        JMenuItem styled = new JMenuItem("Styled");
        JMenuItem mistral = new JMenuItem("Mistral");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem yellow = new JMenuItem("Yellow");
        JMenuItem singleplayer = new JMenuItem("Singleplayer");
        JMenuItem multiplayer = new JMenuItem("Multiplayer");
        JMenuItem autoplay = new JMenuItem("Autoplay");
        JMenuItem loadReplay = new JMenuItem("Load last game");
        JMenuItem scalaSort = new JMenuItem("Scala Sort");
        JMenuItem javaSort = new JMenuItem("Java Sort");
        JMenuItem statistics = new JMenuItem("Scala Statistic");
        JMenuItem notationTransform = new JMenuItem("Notation Transform");

        menu.add(restart);
        menu.add(exit);

        menu2.add(classic);
        menu2.add(styled);
        menu2.add(mistral);

        menu3.add(blue);
        menu3.add(green);
        menu3.add(yellow);

        menu4.add(singleplayer);
        menu4.add(multiplayer);
        menu4.add(autoplay);
        menu4.add(loadReplay);

        menu5.add(scalaSort);
        menu5.add(javaSort);
        menu5.add(statistics);
        menu5.add(notationTransform);

        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        menuBar.add(menu5);

        this.setJMenuBar(menuBar);

        exit.addActionListener(e -> System.exit(0));

        restart.addActionListener(e -> GamePlay.restart());
        classic.addActionListener(e -> button.setButtonFont(0));
        styled.addActionListener(e -> button.setButtonFont(1));
        mistral.addActionListener(e -> button.setButtonFont(2));
        green.addActionListener(e -> {
            Panel.b1.setButtonBackground(0);
            Panel.b2.setButtonBackground(0);
            Panel.b3.setButtonBackground(0);
            Panel.b4.setButtonBackground(0);
            Panel.b5.setButtonBackground(0);
            Panel.b6.setButtonBackground(0);
            Panel.b7.setButtonBackground(0);
            Panel.b8.setButtonBackground(0);
            Panel.b9.setButtonBackground(0);

        });
        yellow.addActionListener(e -> {
            Panel.b1.setButtonBackground(1);
            Panel.b2.setButtonBackground(1);
            Panel.b3.setButtonBackground(1);
            Panel.b4.setButtonBackground(1);
            Panel.b5.setButtonBackground(1);
            Panel.b6.setButtonBackground(1);
            Panel.b7.setButtonBackground(1);
            Panel.b8.setButtonBackground(1);
            Panel.b9.setButtonBackground(1);
        });
        blue.addActionListener(e -> {
            Panel.b1.setButtonBackground(2);
            Panel.b2.setButtonBackground(2);
            Panel.b3.setButtonBackground(2);
            Panel.b4.setButtonBackground(2);
            Panel.b5.setButtonBackground(2);
            Panel.b6.setButtonBackground(2);
            Panel.b7.setButtonBackground(2);
            Panel.b8.setButtonBackground(2);
            Panel.b9.setButtonBackground(2);
        });
        singleplayer.addActionListener(e -> {
            Panel.playwithbot = false;
            GamePlay.count = 9;
            GamePlay.restartWithoutConfirm();
        });
        multiplayer.addActionListener(e -> {
            Panel.playwithbot = true;
            GamePlay.count = 5;
            GamePlay.restartWithoutConfirm();
        });
        autoplay.addActionListener(e -> {
            GamePlay.restartWithoutConfirm();
            GamePlay.autoPlay();
        });
        loadReplay.addActionListener(e -> {
            GamePlay.loadGame();
        });
        scalaSort.addActionListener(e -> {
            GamePlay.scalaSort();
        });
        javaSort.addActionListener(e -> {
            GamePlay.javaSort();
        });
        statistics.addActionListener(e -> {
            GamePlay.scalaStatistic();
        });
        notationTransform.addActionListener(e -> {
            GamePlay.notationTransform();
        });
    }
}
