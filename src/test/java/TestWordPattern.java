import org.junit.Assert;
import org.junit.Test;

public class TestWordPattern {


    @Test
    public void testWordPattern() {

        WordPattern wordPattern = new WordPattern();
        boolean result = true;
        boolean output = wordPattern.wordPattern("abba","dog cat cat dog");
        Assert.assertArrayEquals(new boolean[]{result},new boolean[]{output});
    }
}
