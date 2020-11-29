import ch10.Clothes;
import ch10.Day;
import ch10.Size;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Day> weekend = EnumSet.noneOf(Day.class);
        weekend.add(Day.SATURDAY);
        weekend.add(Day.SUNDAY);
        System.out.println(weekend);
        Set<Day> week1 = EnumSet.range(Day.MONDAY, Day.SATURDAY);
        System.out.println(week1);
    }

    public static Map<Size, Integer> countBySize(List<Clothes> clothes) {
        Map<Size, Integer> map = new EnumMap<Size, Integer>(Size.class);
        for (Clothes c : clothes) {
            Size size = c.getSize();
            Integer count = map.get(size);
            if (count != null) {
                map.put(size, count + 1);
            } else {
                map.put(size, 1);
            }
        }

        return map;
    }

}
