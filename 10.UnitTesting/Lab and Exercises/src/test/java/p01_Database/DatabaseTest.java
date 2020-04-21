package p01_Database;

import org.junit.Before;
import org.junit.Test;
import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;
public class DatabaseTest {

    private Database database;

    @Before
    public void setUp() throws OperationNotSupportedException {
      database =  new Database(13,42, 69, 73);
    }

    @Test
    public void test_database_constructor_should_create_object_with_valid_state() throws OperationNotSupportedException {
        Integer[] elements = database.getElements();
        Integer [] expected = {13,42,69,73};
        assertEquals(expected.length, elements.length);
        for (int i = 0; i <expected.length ; i++) {
            assertEquals(expected[i], elements[i]);
        }
    }
    @Test(expected = OperationNotSupportedException.class)
    public void test_database_constructor_should_thrown_when_called_with_more_than_sixteen_elements() throws OperationNotSupportedException {
       Integer [] numbers = new Integer[17];
       new Database(numbers);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test_add_should_thrown_when_parametar_is_null() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void test_should_add_on_first_free_index() throws OperationNotSupportedException {
        database.add(666);
        Integer[] elements = database.getElements();
        assertEquals(5,elements.length);
        assertEquals(Integer.valueOf(666),elements[4]);
    }

    @Test
    public void test_remove_should_remove_last_element() throws OperationNotSupportedException {
        database.remove();
        Integer[] actual = database.getElements();
        Integer[] expected = {13,42,69};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i <expected.length ; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test_remove_should_thrown_the_empty_database() throws OperationNotSupportedException {
        for (int i = 0; i <4 ; i++) {
            database.remove();
        }
        database.remove();
    }

}
