import static org.junit.Assert.*;
import org.junit.*;

public class TestTest {
    @Test
    public void addition() {
        Aclass aclass = new Aclass();
        assertEquals(aclass.plus(1,1), 2);
    }
}