package java7andbelow.features.collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class _12_NavigableMap {

    public static void main(String[] args) {

        /*
            Java 1.6 v Enhancements in Collection Framework
            ===============================================
            As a part of Java 1.6 v enhancements, the following concept introduced in the
            collection framework.

            1.	NavigableMap

            NavigableMap
            ============
            NavigableMap is a child interface of SortedMap. It defines several methods for
            navigation purposes.
            Map(I) -> SortedMap(I) -> NavigableMap(I) -> TreeMap(C)

            NavigableMap Methods
            ====================
            floorKey(e)
            It returns the highest element which is <= e.

            lowerKey(e)
            It returns the highest element which is < e.

            ceilingKey(e)
            It returns the lowest element which is >= e.

            higherKey(e)
            It returns the lowest element which is > e.

            pollFirstEntry()
            It removes and returns the first element.

            pollLastEntry()
            It removes and returns the last element.

            descendingMap()
            It returns NavigableSet in reverse order.
        */
        NavigableMapDemo.demo();
    }

}

class NavigableMapDemo {

    public static void demo() {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("B", "Banana");
        navigableMap.put("A", "Apple");
        navigableMap.put("C", "Carrot");
        navigableMap.put("D", "Dates");
        navigableMap.put("E", "ElderBerry");
        navigableMap.put("F", "Fig");
        System.out.println(navigableMap);
        System.out.println(navigableMap.floorKey("E"));
        System.out.println(navigableMap.lowerKey("E"));
        System.out.println(navigableMap.ceilingKey("C"));
        System.out.println(navigableMap.higherKey("C"));
        System.out.println(navigableMap.pollFirstEntry());
        System.out.println(navigableMap.pollLastEntry());
        System.out.println(navigableMap.descendingKeySet());
        System.out.println(navigableMap.descendingMap());
    }

}
