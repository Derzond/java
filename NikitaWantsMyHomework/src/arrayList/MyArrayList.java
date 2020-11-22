package arrayList;

public interface MyArrayList<T> {
    // Я бы все джавадоки методов написал здесь, они видны при любой реализации интерфейса.
    // Плюс ко всему суть методов же одинаковая в любой реализации, какой смысл для каждой писать новые доки?
    // На крайняк, если надо поменять джавадок метода интерфейса (?), можно тупо написать новый док в реализации.
    public int size();

    public T get(int index);

    public void put(T value);

    public boolean contains(T value);

    public void clear();
}
