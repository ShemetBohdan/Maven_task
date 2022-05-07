
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestGoodPair {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setOut(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void calcGoodPair(){
        GoodPair goodPair = new GoodPair();
        Assert.assertEquals(6,goodPair.calcGoodPair(new int[]{1, 1, 1, 1}));
    }

    @After
    public void cleanUp(){
        System.setOut(null);
    }

}
