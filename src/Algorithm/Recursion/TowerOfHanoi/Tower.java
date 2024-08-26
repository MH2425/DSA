package Algorithm.Recursion.TowerOfHanoi;
import java.util.ArrayList;
public class Tower {
    private final ArrayList<Integer> disks;

    /**
     * Constructs a tower holding a given number of disks of decreasing size.
     * @param nDisks the number of disks
     */
    public Tower(int nDisks) {
        disks = new ArrayList<>();
        for (int d = nDisks; d >= 1; d--) {
            disks.add(d);
        }
    }

    /**
     * Removes the top disk from this tower.
     * @return the size of the removed disk
     */
    public int remove() {
        return disks.remove(disks.size() -1);
    }

    /**
     * Adds a disk to this tower.
     * @param size the size of the disk to add
     */
    public void add(int size) {
        if ((!disks.isEmpty()) && (disks.get(disks.size() - 1) < size)) {
            throw new IllegalStateException("Disk is too large");
        }
        disks.add(size);
    }

    @Override
    public String toString() {
        return disks.toString();
    }
}
