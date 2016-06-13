package Statistic;

public class Notation {

    private String player;

    private int button;

    public Notation(String player, int button) {
        this.player = player;
        this.button = button;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }
}
