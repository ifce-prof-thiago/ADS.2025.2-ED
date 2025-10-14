package cap03.arrays;


import cap03.Player;

public class Main {
    public static void main(String[] args) {
        Scores s = new Scores();
        s.add(new Player("Mike", 1105));
        s.add(new Player("Nicole", 2000));
        s.add(new Player("Yuri", 1800));
        s.remove(3);
        System.out.println(s);
    }
}
