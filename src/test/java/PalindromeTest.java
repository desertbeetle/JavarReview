import com.desertbeetle.Palindrome;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PalindromeTest {

    @Test
    public void phaseIsPalindromeWithoutSpaceTest() {
        String s = "madam";
        assertTrue(Palindrome.isPalindrome(s));

        s = "maddam";
        assertTrue(Palindrome.isPalindrome(s));

        s="mad";
        assertFalse(Palindrome.isPalindrome(s));

    }


    @Test
    public void phaseIsPalindromeWithSpaceTest() {
        String s = "nurses run";
        assertTrue(Palindrome.isPalindrome(s));

    }

}
