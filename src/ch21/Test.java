package ch21;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lucy
 */
public class Test {
    public static void main(String[] args) {
        Class<?> cls = Integer.class;
        try {
            Method method = cls.getMethod("parseInt", new Class[]{String.class});
            System.out.println(method.invoke(null, "123"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }

        try {
            Constructor<StringBuilder> constructor = StringBuilder.class.getConstructor(new Class[]{int.class});
            try {
                StringBuilder sb = constructor.newInstance(100);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        String[] arr = new String[3];
        Class<?> cs = arr.getClass();
        System.out.println(cs);
        System.out.println(cs.getComponentType());
        System.out.println(cs.getName());
        System.out.println(cs.getSimpleName());
        System.out.println(cs.getCanonicalName());
    }
}
