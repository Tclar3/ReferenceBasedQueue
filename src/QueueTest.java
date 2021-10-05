import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @org.junit.jupiter.api.Test
    void dequeueAll() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Queue<Integer> q = new Queue<>();
        assertTrue(q.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void enqueue() {
        Queue<Integer> q = new Queue<>();
        for(int i = 0; i < 50; i++)
        {
            q.enqueue(i);
        }
        for(int k = 0; k < 50; k++)
        {
            assertEquals(k, q.dequeue());
        }
    }

    @org.junit.jupiter.api.Test
    void peek()
    {
        Queue<Integer> q = new Queue<>();
        for(int i = 0; i < 50; i++)
        {
            q.enqueue(i);
        }
        assertEquals(0, q.peek());
        q.dequeue();
        assertEquals(1, q.peek());

    }
}