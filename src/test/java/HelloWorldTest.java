import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World",result);
    }
    @Test
    public void sayHi_with_pamuta_should_return_Hello_Pamuta(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHiName("pamuta");
        assertEquals("Hello Pamuta",result);
    }
    @Test
    public void sayHi_with_frong_should_return_Hello_Pamuta(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHiName("frong");
        assertEquals("Hello Frong",result);
    }
}