import com.desertbeetle.Reverse;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseTest {

    @Test
    public void reverseTest() {
        String s= "nurses run";
        String act = Reverse.reverse(s);
        String exp = "nur sesrun";
        assertEquals(exp, act);

        s  = "hello world";
        exp = "dlrow olleh";
        act = Reverse.reverse(s);
        assertEquals(exp, act);

    }
}
