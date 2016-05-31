package Statistic;

/**
 * Notation class which consost of player and button fields
 */
public class Notation {

    private String player;

    private int button;

    public Notation(String player, int button) {
        this.player = player;
        this.button = button;
    }

    /**
     * returns the player mark (x or O)
     * @return
     */
    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * returns the button which was clicked by the player
     * @return
     */
    public int getButton() {
        return button;
    }

    /**
     * sets the button which was clicked by the player
     * @param button
     */
    public void setButton(int button) {
        this.button = button;
    }
}
