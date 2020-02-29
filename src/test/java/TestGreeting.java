import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestGreeting {
    @Test
    public void  testSayName(){
        Greeting g = new Greeting();
        g.askName("avreen");

        assertEquals("Hi avreen! How you doing?", g.sayHello());
    }
}
