package Algorithm.Recursion.TowerOfHanoi;

public class TowersOfHanoiDemo {
    public static void main(String[] args) {
        final int DISKS = 5;
        TowersOFHanoi towers = new TowersOFHanoi(DISKS);
        towers.move(DISKS, 0, 2);

    }
}
