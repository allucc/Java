package ch15;

/**
 * @author lucy
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new HelloThread();
//        thread.run();

        Thread thread1 = new Thread(new HelloRunnable());
        thread.start();

        thread1.start();
    }
}


class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread name: " + Thread.currentThread().getName());
        System.out.println("thread id: " + Thread.currentThread().getId());
        System.out.println("hello");
    }
}

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread-runnable name: " + Thread.currentThread().getName());
        System.out.println("thread-runnable id: " + Thread.currentThread().getId());
        System.out.println("hello-runnable");
    }
}