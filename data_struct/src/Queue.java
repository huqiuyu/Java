public interface Queue<E> {
    public int getSize();
    public boolean isEmpty();
    public void enquenu(E e);
    E dequeue();
    E getFront();
}
