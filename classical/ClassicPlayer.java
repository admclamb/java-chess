package classical;

import common.Player;

public class ClassicPlayer implements Player {

    public ClassicPlayer(String color) {
        this.score = 0;
        this.playerColor = color;
    }

    public String getColor() {
        return playerColor;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer newScore) {
        this.score = newScore;
    }

    private Integer score;
    private String playerColor;
}
