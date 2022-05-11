import org.junit.Assert;
import org.junit.Test;

public class TestMaximumValue {

    @Test
    public void calMaxElem(){

        MaximumValue maximumValue = new MaximumValue();
        Assert.assertEquals(12,maximumValue.calMaxElem(new int[]{3,4,5,2}));
    }
}
