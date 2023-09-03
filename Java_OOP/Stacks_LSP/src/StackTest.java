import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack<Integer> arrayStack;
    private Stack<Integer> linkedListStack;

    @BeforeEach
    public void setup() {
        arrayStack = new ArrayStack<>(5);
        linkedListStack = new LinkedListStack<>();
    }

    @Test
    public void testArrayStackPushPop() {
        arrayStack.push(1);
        arrayStack.push(2);

        assertEquals(2, arrayStack.pop());
        assertEquals(1, arrayStack.pop());
        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void testLinkedListStackPushPop() {
        linkedListStack.push(1);
        linkedListStack.push(2);

        assertEquals(2, linkedListStack.pop());
        assertEquals(1, linkedListStack.pop());
        assertTrue(linkedListStack.isEmpty());
    }

    @Test
    public void testArrayStackEmptyPop() {
        assertNull(arrayStack.pop());
        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void testLinkedListStackEmptyPop() {
        assertNull(linkedListStack.pop());
        assertTrue(linkedListStack.isEmpty());
    }

    @Test
    public void testArrayStackEmptyCheck() {
        assertTrue(arrayStack.isEmpty());
        arrayStack.push(1);
        assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void testLinkedListStackEmptyCheck() {
        assertTrue(linkedListStack.isEmpty());
        linkedListStack.push(1);
        assertFalse(linkedListStack.isEmpty());
    }
}
