package homework9;

public class Player {
    private String name;
    private String choice;
    private boolean win;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public boolean hasWon() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

}
