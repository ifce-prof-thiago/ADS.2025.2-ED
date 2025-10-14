package cap03.arrays;

import cap03.Player;

public class Scores {

    private static final int maxPlayers = 3;
    private int numPlayers;
    private Player[] players;

    public Scores() {
        players = new Player[maxPlayers];
        numPlayers = 0;
    }

    public void add(Player player) {
        int newScore = player.score();
        if (numPlayers == maxPlayers) {
            if (newScore <= players[numPlayers - 1].score())
                return;
        } else {
            numPlayers++;
        }
        int i = numPlayers - 1;
        for (; i >= 1 && (newScore > players[i - 1].score()); i--) {
            players[i] = players[i - 1];
        }
        players[i] = player;
    }

    public void remove(int index) {
        if (index < 0 || index > numPlayers - 1) {
            return;
        }
        for (int i = index; i < numPlayers - 1; i++) {
            players[i] = players[i + 1];
            if (players[i] == null) {
                break;
            }
        }
        players[numPlayers - 1] = null;
        numPlayers--;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numPlayers; i++) {
            s.append(i).append(" ").append(players[i]).append("\n");
        }
        return s.toString();
    }
}
