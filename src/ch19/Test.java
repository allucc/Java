package ch19;

/**
 * @author lucy
 */
public class Test {
    public static void main(String[] args) {
        ThreadLocal<Integer> local = new ThreadLocal<>();
        local.set(100);
        System.out.println(local.get());
    }
}
