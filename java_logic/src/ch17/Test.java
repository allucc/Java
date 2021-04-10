package ch17;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author lucy
 */
public class Test {
    public static void unsafeConcurrentUpdate() {
        final Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());
        for (int i = 0; i < 1000; ++i) {
            Thread t = new Thread() {
                Random rnd = new Random();

                @Override
                public void run() {
                    for (int i = 0; i < 1000; ++i) {
                        map.put(rnd.nextInt(), 1);
                    }
                }
            };
            t.start();
        }
    }

    public static void main(String[] args) {
        unsafeConcurrentUpdate();
    }
}
