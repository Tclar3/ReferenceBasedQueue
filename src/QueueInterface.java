public interface QueueInterface <T>
{
    void dequeueAll();

    boolean isEmpty();

    void enqueue(T item);

    T dequeue();

    T peek();
}
