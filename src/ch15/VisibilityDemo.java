package ch15;

/**
 * @author lucy
 */
public class VisibilityDemo {
    private static boolean shutdown = false;

    static class HelloThread extends Thread {
        @Override
        public void run() {
            while (!shutdown) {
                System.out.println(Thread.currentThread().getName());
            }
            System.out.println("exit " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        new HelloThread().start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shutdown = true;
        System.out.println("exit main " + Thread.currentThread().getName());
    }
}
