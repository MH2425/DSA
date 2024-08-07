package fundamental.arrays;

public class ScoreBoard {
    private int numEntries;         // number of actual entries
    private GameEntry[] board;      // array of game entries (names and scores)

    /**
     * Constructs an empty scoreboard with the given capacity for storing entries
     */
    public ScoreBoard(int capacity) {
        numEntries = 0;
        board = new GameEntry[capacity];
    }

    /**
     * Add a new score to the collection if it is high enough
     */
    public void add(GameEntry entry) {
        int newScore = entry.getScore();
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {        // no scope drops form the board
                numEntries++;                       // so overall number increases
                // shift any lower scores rightward to make room for the new entry
            }
            int shiftEntryPosition = numEntries - 1;
            while ((shiftEntryPosition > 0) && (board[shiftEntryPosition - 1].getScore() < newScore)) {
                board[shiftEntryPosition] = board[shiftEntryPosition - 1];      // shift entry from j - 1 to j
                shiftEntryPosition--; // decrement shiftEntryPosition to reach the stop condition of while loop
            }
            board[shiftEntryPosition] = entry; // add new entry into the empty room
        }
    }

    /**
     * Remove and return the high score at index i
     */
    public GameEntry remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        } else {
            GameEntry entryRemoved = board[index];
            for (int j = index; j < numEntries - 1; j++) {
                board[j] = board[j + 1];
            }
            board[numEntries - 1] = null;
            numEntries--;
            return entryRemoved;
        }
    }

    /**
     * toString() method to print out the scoreboard in the form [gameEntry1][gameEntry2] ... [gameEntryN]
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (GameEntry entry : board) {
            stringBuilder.append("[").append(entry).append("]");
        }
        return stringBuilder.toString();
    }
}
