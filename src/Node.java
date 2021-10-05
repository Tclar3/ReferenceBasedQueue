public class Node <T>
{
    public T data;
    public Node next = null;

    public Node(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }

    public Node getNext()
    {
        return next;
    }

}
