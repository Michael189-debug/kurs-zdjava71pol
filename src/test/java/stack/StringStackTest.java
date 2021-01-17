package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringStackTest {

    @Test
    public void shouldReturnTrueForEmptyStack(){
        StringStack stack = new StringStack();
        assertTrue(stack.isEmpty());

    }
    @Test
    public void shouldReturnFalseForEmptyStack(){
        StringStack stack = new StringStack();
        stack.push("TEST");
        assertFalse(stack.isEmpty());

    }
    @Test
    public void shouldReturnItemAfterPushAndPop(){
        StringStack stack = new StringStack();
        stack.push("TEST");
        String popped = stack.pop();
        assertEquals("TEST", popped);
        assertTrue(stack.isEmpty());

    }

}