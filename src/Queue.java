public class Queue <T> implements QueueInterface<T>{

    /* Circular Linked List implementation of Queue */


    private Node lastnode;

    public void dequeueAll()
    {
        this.lastnode = null;
    }

    //checks if Queue is empty
    public boolean isEmpty()
    {
        return lastnode == null;
    }

    //Add item to queue
    public void enqueue(T item) {
        Node newItem = new Node(item);

        if(isEmpty())
        {
            newItem.next = newItem;
            lastnode = newItem;
        }
        else
        {
            newItem.next = lastnode.next;
            lastnode.next = newItem;
            lastnode = newItem;
        }
    }

    //remove item from queue
    public T dequeue()
    {
        Node dequeuedItem = lastnode.next;
        lastnode.next = lastnode.next.next;
        return (T) dequeuedItem.data;
    }

    //check first item in queue
    public T peek()
    {
        return (T) lastnode.next.data;
    }
}
