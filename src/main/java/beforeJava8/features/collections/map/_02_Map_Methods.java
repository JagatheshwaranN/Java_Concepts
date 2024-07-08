package beforeJava8.features.collections.map;

public class _02_Map_Methods {

    public static void main(String[] args) {

        /*
            Map Interface Methods
            =====================

            Object put(Object key, Object value)
            ====================================
            To add one key-value pair to the map. If the key is already present, then old value will
            be replaced with new value and returns old value.

            Map map = new Map();
            map.put(101, 'Alex'); => returns null
            map.put(102, 'John'); => returns null
            map.put(101, 'Blake'); => returns Alex

            void putAll(Map m)
            ==================
            Used to add a Map object.

            Object get(Object key)
            ======================
            Returns the value associated with the specified key.

            Object remove(Object key)
            =========================
            Removes the entry associated with the specified key.

            boolean containsKey(Object key)
            ===============================
            Returns true if the given key is present.

            boolean containsValue(Object key)
            ==================================
            Returns true if the corresponding value for the given key is present.

            boolean isEmpty()
            =================
            Returns true if the given map object is empty.

            int size()
            ==========
            Returns the size of the map object.

            void clear()
            ============
            Clear the entries of the map.

            The below 3 methods are considered as collection views of Map.
            Set keyset()
            Collection values()
            Set entrySet()

        */
    }

}