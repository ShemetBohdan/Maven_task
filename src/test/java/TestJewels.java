
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestJewels {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testCalcQuantityJewels(){

        Jewels jewels = new Jewels();
        Assert.assertEquals(3,jewels.calcQuantityJewels("aA","aAAbbbb"));
    }

    @After
    public void cleanUp(){
        System.setOut(null);
    }
}
