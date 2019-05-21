import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {

    Set emptySet = new Set();
    Set notEmptySet = new Set();

    @Before
    public void setUp(){
        notEmptySet.add("1");
        notEmptySet.add("2");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptySet.isEmpty());
        assertFalse(notEmptySet.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0,emptySet.size());
        assertTrue(notEmptySet.size() > 0);
    }

    @Test
    public void testContains(){
        assertFalse(emptySet.contains("1"));
        assertFalse(emptySet.contains("2"));
        assertTrue(notEmptySet.contains("1"));
        assertTrue(notEmptySet.contains("2"));
    }

    @Test
    public void testAddIfAlreadyContainsItem(){
        assertTrue(notEmptySet.contains("1"));
        notEmptySet.add("1");
        notEmptySet.add("2");
        assertEquals(2,notEmptySet.size());
        notEmptySet.add("3");
        assertEquals(3,notEmptySet.size());
    }

    @Test
    public void testRemove(){
        Set set = new Set();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        assertTrue(set.contains("3"));
        assertEquals(5, set.size());

        set.remove("3");
        assertFalse( set.remove("7"));
        assertFalse(set.contains("3"));
        assertEquals(4, set.size());

        // test can still add after item has been removed from full set
        set.add("6");
        assertTrue(set.contains("6"));
        assertEquals(5, set.size());
    }

    @Test
    public void testClear(){
        Set set = new Set();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        assertEquals(5, set.size());

        set.clear();
        assertFalse(set.contains("3"));
        assertEquals(0, set.size());
    }

}