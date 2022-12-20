public interface MyArrayList<E> {
    /**
     * Добавить элемент
     */
    public void add(E e);

    /**
     * получить элемент с индексом index
     */
    public Object get(int index);

    /**
     * удалить элемент с индексом index
     */
    public E remove(int index);

    /**
     * очистить всю коллекцию
     */
    public void clear();

    /**
     * получить количество элементов
     */
    public int size();
}
