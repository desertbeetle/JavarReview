import com.desertbeetle.FirstNonRepeatCharacter;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class FirstNonRepeatCharTest {

    @Test
    public void firstNonRepeatCharNotFoundReturnsNullTest() {
        String s = "ss";
        assertNull(FirstNonRepeatCharacter.firstNonRepeatChar(s));

        s = "aabbccddee";
        assertNull(FirstNonRepeatCharacter.firstNonRepeatChar(s));

    }

    @Test
    public void firstNonRepeatCharTest() {
        String s = "sss";
        assertEquals(Character.valueOf('s'), FirstNonRepeatCharacter.firstNonRepeatChar(s));


        s = "Sprints";
        assertEquals(Character.valueOf('S'), FirstNonRepeatCharacter.firstNonRepeatChar(s));


        s = "aabbccddee0";
        assertEquals(Character.valueOf('0'), FirstNonRepeatCharacter.firstNonRepeatChar(s));

    }

}
