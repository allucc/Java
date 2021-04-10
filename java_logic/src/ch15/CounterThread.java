package ch15;

/**
 * 竟态条件
 *
 * @author lucy
 */
public class CounterThread extends Thread {
    private static int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; ++i) {
            ++counter;
        }
    }

    public static void main(String[] args) {
        int num = 1000;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; ++i) {
            threads[i] = new CounterThread();
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread thread = new TestThread();
        if (counter < 100000000) {
            thread.start();
        }
        System.out.println(counter);
    }
}

class TestThread extends Thread {
    @Override
    public void run() {
        CounterThread.main(null);
    }
}
