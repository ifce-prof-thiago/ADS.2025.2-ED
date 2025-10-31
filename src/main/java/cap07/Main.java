package cap07;

public class Main {
    public static void main(String[] args) {
        var ranking = new RankingBinaryTree();
//        var ranking = new SlowRanking();
        final int N = 50_000;
        System.out.println("Iniciando...");
        long startTime =  System.nanoTime();
        for (int i = 0; i < N; i++) {
            var player = new Player("Player_" + i, (int) (Math.random() * 1000));
            ranking.add(player);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        System.out.println("TEMPO GASTO: " + duration);
    }
}
