import org.junit.Assert;
import org.junit.Test;

public class TestRomanToInt {

    @Test
    public void romanToInt(){

        int num = 58;
        RomanToInt romanToInt = new RomanToInt();
        Assert.assertEquals(num,romanToInt.romanToInt("LVIII"));

    }
}
