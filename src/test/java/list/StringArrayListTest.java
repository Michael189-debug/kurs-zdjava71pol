package list;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayListTest {
    @Test
    public void shouldReturnTrueForIsEmptyForNewList() {
        StringArrayList list = new StringArrayList(5);
        boolean result = list.isEmpty();
        assertEquals(true, result);

    }

    @Test
    public void shouldReturnTrueForIsEmptyForListWithItems() {
        StringArrayList list = new StringArrayList(5);
        list.add("Test");
        boolean result = list.isEmpty();
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseForIsFullWhenNewList() {
        StringArrayList list = new StringArrayList(5);
        list.add("Test");
        boolean result = list.isFull();
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseForIsFullWhenListIsFull() {
        StringArrayList list = new StringArrayList(2);
        list.add("Test");
        list.add("Test");
        boolean result = list.isFull();
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnValidListForAdd() {
        //GIVEN
        StringArrayList list = new StringArrayList(5);
        //WHEN

        boolean result = list.add("AAA", 2);
        //THEN
        assertEquals(false, result);

        //WHEN
        result = list.add("AAA", 0);
        //THEN
        assertEquals(true, result);
        assertEquals("AAA", list.get(0));

        //WHEN
        result = list.add("BBB", 0);
        //THEN
        assertEquals("BBB", list.get(0));
        assertEquals(true, result);
        assertEquals("AAA", list.get(1));
        //WHEN
        result = list.add("CCC", 2);
        result = list.add("DDD", 2);
        result = list.add("EEE", 4);
        result = list.add("FFF", 5);
        //THEN
        assertEquals(false, result);
        assertEquals(true, list.isFull());

        //GIVEN
        list = new StringArrayList(5);
        list.add("b", 0);
        list.add("c", 1);
        list.add("a", 0);
        list.add("d", 3);
        list.add("e", 4);
        //THEN
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("d", list.get(3));
        assertEquals("e", list.get(4));


    }

    @Test
    public void shouldReturnValidSize() {
        StringArrayList list = new StringArrayList(3);
        assertEquals(0, list.size());
        list.add("AAA");
        assertEquals(1, list.size());
        assertEquals(2, list.size());
        assertEquals(3, list.size());
        list.add("BBB", 0);
        list.add("CCC", 2);
        list.add("EEE", 1);
        list.add("FFF", 4);
        assertEquals(3, list.size());
        list.add("DDD", 3);
        assertEquals(3, list.size());

    }
    @Test
    public void sholudReturnValidListAdterRemove(){
        StringArrayList list = new StringArrayList(3);
        assertEquals(false,list.remove(0));
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        boolean result = list.remove(0);
        assertEquals(2, list.size());
        assertEquals(true, result);
        assertEquals("BBB",list.get(0));
        list.remove(1);
        list.remove(2);
        assertEquals(true, list.isEmpty());
        assertEquals(0, list.size());
    }


}