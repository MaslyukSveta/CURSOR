import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyList<T extends Comparable<? super T>> {

    private final ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public MyList(T[] array) {
        this.list = new ArrayList<>(List.of(array));
    }

    public void add(T element) {
        list.add(element);
    }

    public T minElemArray() {
        return list.stream().min(Comparator.naturalOrder()).orElseThrow();
    }

    public T maxElemArray() {
        return list.stream().max(Comparator.naturalOrder()).orElseThrow();
    }

    @Override
    public String toString() {
        return "MyList: " + list;
    }
}
