import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortedCycleList<T extends Comparable<T>> {
    private ArrayList<T> items = new ArrayList();
    private int iterator = 0;

    public T next(){
        T item = items.get(iterator++);
        iterator = iterator % items.size();
        return item;
    }

    public void add(T value) {
        items.add(value);
        Collections.sort(items);
    }

    public void addAll(Collection<? extends T> collection){
        items.addAll(collection);
        Collections.sort(items);
    }

    public void remove(T item) {
        items.remove(item);
    }
}
