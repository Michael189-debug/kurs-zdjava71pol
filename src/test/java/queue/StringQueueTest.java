package queue;

import org.junit.jupiter.api.Test;
import stack.StringStack;

import static org.junit.jupiter.api.Assertions.*;

class StringQueueTest {

    @Test
    public void shouldReturnTrueForEmptyQueue() {
        StringStack kolejkaSzczepien = new StringStack();
        assertTrue(kolejkaSzczepien.isEmpty());

    }

    @Test
    public void shouldReturnFalseForEmptyQueue() {
        StringStack kolejkaSzczepien = new StringStack();
        kolejkaSzczepien.push("TEST");
        assertFalse(kolejkaSzczepien.isEmpty());

    }

    @Test
    public void shouldReturnItemAfterPushAndPop() {
        StringStack kolejkaSzczepien = new StringStack();
        kolejkaSzczepien.push("TEST");
        String popped = kolejkaSzczepien.pop();
        assertEquals("TEST", popped);
        assertTrue(kolejkaSzczepien.isEmpty());

    }
}