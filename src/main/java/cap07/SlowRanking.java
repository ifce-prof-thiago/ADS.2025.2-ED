package cap07;

import java.util.LinkedList;

public class SlowRanking {

    private LinkedList<Player> players = new LinkedList<>();

    public void add(Player p) {
        var iterator = players.listIterator();
        while (iterator.hasNext()) {
            var current = iterator.next();
            if (p.score() < current.score()) {
                iterator.previous();
                iterator.add(p);
                return;
            }
        }
        iterator.add(p);
    }

    public void print() {
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
