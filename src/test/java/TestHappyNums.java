import org.junit.Assert;
import org.junit.Test;

public class TestHappyNums {

    @Test
    public void testCalcSumSquare() {

        HappyNums happyNums = new HappyNums();
        Assert.assertEquals(82, happyNums.calcSumSquare(19));
    }

    @Test
    public void testShowHappyNums() {

        HappyNums happyNums = new HappyNums();
        Assert.assertArrayEquals(new boolean[]{true},new boolean[]{happyNums.showHappyNums(10)});
    }
}