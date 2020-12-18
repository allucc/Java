package ch15;

/**
 * @author lucy
 */
public class DeadLockDemo {
    private static Object lockA = new Object();
    private static Object lockB = new Object();

    private static void startTreadA() {
        Thread aThread = new Thread() {
            @Override
            public void run() {
                synchronized (lockA) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    synchronized (lockB) {
                    }
                }
            }
        };
        aThread.start();
    }

    private static void startTreadB() {
        Thread bThread = new Thread() {
            @Override
            public void run() {
                synchronized (lockB) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    synchronized (lockA) {
                    }
                }
            }
        };
        bThread.start();
    }

    public static void main(String[] args) {
        startTreadA();
        startTreadB();
    }
}
