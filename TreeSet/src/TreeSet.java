import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeSet<E> {
    private final Object PRESENT = new Object();
    private final TreeMap<E, Object> map;

    public TreeSet() {
        map = new TreeMap<>();
    }

    public TreeSet(Comparator<? super E> comparator) {
        map = new TreeMap<>(comparator);
    }

    public void add(E element) {
        if (!contains(element)) {
            map.put(element, PRESENT);
        }
    }

    public void remove(E element) {
        if (contains(element)) {
            map.remove(element);
        }
    }

    public boolean contains(E element) {
        return map.containsKey(element);
    }

    public int size() {
        return map.size();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
}