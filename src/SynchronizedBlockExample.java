public class SynchronizedBlockExample {
    private final Object lock = new Object();
    private int count = 0;

    public void incrementSny() {
        int j = 0;
        synchronized (lock) {
            while(j < 5000) {
                count++;
                j++;
            }

        }
    }

    public int getCountSny() {
        return count;
    }
}
