package ch15;

/**
 * @author lucy
 */
public class Counter {
    private int count;

    public synchronized void incr() {
        ++count;
    }

    public synchronized int getCount() {
        return count;
    }
}
