
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestJewels {

    @Test
    public void testCalcQuantityJewels(){

        Jewels jewels = new Jewels();
        Assert.assertEquals(3,jewels.calcQuantityJewels("aA","aAAbbbb"));
    }
}
