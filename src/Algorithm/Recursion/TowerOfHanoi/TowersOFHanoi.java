package Algorithm.Recursion.TowerOfHanoi;

import java.util.Arrays;

public class TowersOFHanoi {
    private final Tower[] towers;

    public TowersOFHanoi(int nDisks) {
        towers = new Tower[3];
        towers[0] = new Tower(nDisks);
        towers[1] = new Tower(0);
        towers[2] = new Tower(0);
    }

    /**
     * Moves a pile of disks from one peg to another and displays the movement.
     * @param disks the number of disks to move
     * @param from the peg from which to move the disks
     * @param to the peg to which to move the disks
     */
    public void move(int disks, int from, int to) {
        if (disks > 0) {
            /*
                In case there are n numbers of peg, the program needs to change the fixed sum to 0 + 1 + 2 + ... + n
             */
            int other = 3 - from - to; // indexes from 0 to 2, hence the total is 0 + 1 + 2 = 3
            move(disks - 1, from, other);
            towers[to].add(towers[from].remove());
            System.out.println(Arrays.toString(towers));
            move(disks - 1, other, to);
        }
    }
}
