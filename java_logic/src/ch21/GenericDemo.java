package ch21;

import java.util.List;

/**
 * @author lucy
 */
public class GenericDemo {
    static class GenericTest<U extends Comparable<U>, V> {
        U u;
        V v;
        List<String> list;

        public U test(List<? extends Number> number) {
            return null;
        }
    }
}
