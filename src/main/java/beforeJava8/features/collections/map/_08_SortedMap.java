package beforeJava8.features.collections.map;

public class _08_SortedMap {

    public static void main(String[] args) {

        /*
            SortedMap
            =========
            It is the child interface of Map. If we want to represent a group of key-value
            pairs according to some sorting order of keys, then we should go for SortedMap.
            Sorting is based on the key but not based on the value.

            SortedMap Methods
            =================
            SortedMap define the following specific methods as below,

            Object firstKey();
            Object lastKey();
            SortedMap headMap(Object key)
            SortedMap tailMap(Object key)
            SortedMap subMap(Object key1, Object key2)
            Comparator comparator()

            Examples
            ========
            101-> A
            103-> B
            104-> C
            107-> D
            125-> E
            136-> F
            firstKey()   -> 101
            lastKey()    -> 136
            headMap(107) -> {101=A, 103=B, 104=C}
            tailMap(107) -> {107=D, 125=E, 136=F}
            submap(103, 125) -> {103=B,104=C,107=D}
            comparator() -> null
        */
    }

}

