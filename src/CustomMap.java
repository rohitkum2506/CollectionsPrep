public class CustomMap<K, V> {
    final int               size   = 4;
    protected Entry<K, V>[] myList = new Entry[size];

    static class Entry<K, V> {
        K           key   = null;
        V           value = null;
        Entry<K, V> next  = null;

        Entry(K k, V v, Entry<K, V> next) {
            this.key = k;
            this.value = v;
            this.next = next;
        }
    }

    public void put(K key, V val) {
        final int code = getHashCode(key);
        final Entry<K, V> entry = new Entry<K, V>(key, val, null);
        if (myList[code] == null) {
            insertAtIndex(entry, code);
        } else if (myList != null && myList[code] != null) {
            iterateArrayAndAdd(entry, code);
        }
    }

    private void iterateArrayAndAdd(Entry<K, V> entry, int code) {
        final Entry<K, V> entr = myList[code];
        Entry<K, V> current = entr;
        Entry<K, V> previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        current.next = entry;
        previous = current;
    }

    private void insertAtIndex(Entry<K, V> ent, int code) {
        myList[code] = ent;
    }

    private int getHashCode(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public <E, V> void printMap() {
        int l = 0;
        while (l != myList.length) {
            if (myList[l] != null) {
                System.out.print(myList[l].key + ":");
                System.out.print(myList[l].value);
                if (myList[l].next != null) {
                    printLL(myList[l]);
                }
                System.out.print("\n");
            }
            l++;
        }
    }

    private void printLL(Entry<K, V> entry) {
        if (entry.next == null) {
            System.out.print(", ");
            System.out.print(entry.key);
            System.out.print(":");
            System.out.print(entry.value);
        } else
            printLL(entry.next);
    }

    public static void main(String args[]) {
        final CustomMap<String, Integer> m = new CustomMap<String, Integer>();
        m.put("name", 10);
        m.put("name", 10);
        m.put("name", 10);

        //        final HashMap<String, Integer> ma = new HashMap<>();
        //        ma.put("name", 10);
        //        ma.put("name", 20);
        //        final Iterator itr = ma.keySet().iterator();
        //        while (itr.hasNext()) {
        //            final String k = (String) itr.next();
        //            System.out.println(k);
        //            System.out.println(ma.get(k));
        //        }

        m.printMap();
    }
}
