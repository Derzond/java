package arrayList;

public interface MyArrayList<T> {
    public int size();

    public T get(int index);

    public void put(T value);

    public boolean contains(T value);

    public void clear();
}
