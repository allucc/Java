package ch22;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lucy
 */
public class InheritDemo {
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @interface Test {
    }

    @Test
    static class Base {

    }

    static class Child extends Base {
    }

    public static void main(String[] args) {
        System.out.println(Child.class.isAnnotationPresent(Test.class));
    }
}
