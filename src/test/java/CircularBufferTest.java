import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    @Test
    public void create_new_buffer_should_empty(){
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer not empty", result);
    }
    @Test
    public void create_new_buffer_with_default_size_should_10(){
        CircularBuffer cb = new CircularBuffer();
        for (int i = 0; i < 10; i++) {
            cb.writeData("A"+i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer not full",result);
    }
    @Test
    public void write_A_B_to_buffer_should_read_A_b_from_buffer(){
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
//        cb.writeData("A");
//        String result = cb.readData();
//        assertEquals("A",result);
    }
    @Test
    public void write_data_should_not_over_buffer_size(){
        CircularBuffer cb = new CircularBuffer();
        for (int i = 0; i <= 10; i++) {
            if(cb.checkSize(i)){
                cb.writeData("A"+i);
                assertEquals("A"+i,cb.readData());
            }

        }

    }
}