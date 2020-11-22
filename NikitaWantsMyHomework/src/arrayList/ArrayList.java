package arrayList;

public class ArrayList<T> implements MyArrayList<T> {
    // Стартовый размер листа.
    private static final int DEFAULT_CAPACITY = 4;
    // Индекс последнего вставленного элемента.
    private int lastPutIndex = -1;

    // Нет ошибки, т.к массив никогда не будет возвращен пользователю.
    @SuppressWarnings("unchecked")
    private T[] array = (T[])new Object[DEFAULT_CAPACITY];

    /**
     * геттер размера листа.
     * @return размер листа.
     */
    public int size(){
        return lastPutIndex + 1;
    }

    /**
     * Возвращает значение по индексу в листе.
     * @param index индекс в листе.
     * @return значение элемента по индексу.
     */
    public T get(int index){
        checkIndex(index);
        return array[index];
    }

    /**
     * Добавляет элемент в конец списка.
     * @param value значение которое нужно добавить.
     */
    public void put(T value){
        array[lastPutIndex + 1] = value;
        ++lastPutIndex;

        // Если лист был полностью заполнен.
        if (lastPutIndex == array.length - 1)
            resize();
    }

    /**
     * Проверяет наличие элемента в листе.
     * @param value
     * @return true если элемент находится в листе, иначе false.
     */
    public boolean contains(T value){
        for (int i = 0; i < lastPutIndex + 1; i++)
            if (array[i] == value)
                return true;

        return false;
    }

    /**
     * Очищает лист.
     */
    public void clear(){
        array = (T[])new Object[DEFAULT_CAPACITY];
        lastPutIndex = -1;
    }

    /**
     * Проверяет лежит ли индекс в заданных границах.
     * @param index индекс для проверки.
     */
    private void checkIndex(int index){
        if(index < 0 || index > lastPutIndex)
            throw new IndexOutOfBoundsException();
    }

    /**
     * Увеличивает размер листа в 2 раза.
     */
    private void resize(){
        // Нет ошибки, т.к массив никогда не будет возвращен пользователю.
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[array.length * 2];

        System.arraycopy(array, 0, temp, 0, array.length);

        array = temp;
    }
}
