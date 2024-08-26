package DataStructures.fundamental.arrays;

public class TestMain {
    public static void main(String[] args) {
        GameEntry gameEntry1 = new GameEntry("Hoang", 999);
        System.out.println(gameEntry1);
        GameEntry gameEntry2 = new GameEntry("Minh", 88);
        System.out.println(gameEntry2);
        GameEntry gameEntry3 = new GameEntry("Nguyen", 982);
        System.out.println(gameEntry3);
        GameEntry gameEntry4 = new GameEntry("Cao", 9);
        System.out.println(gameEntry4);

        ScoreBoard scoreBoard = new ScoreBoard(4);
        scoreBoard.add(gameEntry1);
        scoreBoard.add(gameEntry2);
        scoreBoard.add(gameEntry3);
        scoreBoard.add(gameEntry4);
        System.out.println(scoreBoard);
    }
}
