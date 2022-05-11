
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestGoodPair {

    @Test
    public void calcGoodPair(){
        GoodPair goodPair = new GoodPair();
        Assert.assertEquals(6,goodPair.calcGoodPair(new int[]{1, 1, 1, 1}));
    }
}
