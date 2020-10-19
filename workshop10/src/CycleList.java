import java.util.ArrayList;
import java.util.Collection;

public class CycleList<T> {
    private ArrayList<T> items = new ArrayList();
    private int iterator = 0;

    public T next(){
        T item = items.get(iterator++);
        iterator = iterator % items.size();
        return item;
    }

    public void add(T value) {
        items.add(value);
    }

    public boolean contains(T value) {
        return items.contains(value);
    }

    public void addAll(Collection<T> collection) {
        items.addAll(collection);
    }

    public void remove(T item) {
        items.remove(item);
    }
}
