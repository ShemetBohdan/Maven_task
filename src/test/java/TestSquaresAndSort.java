import org.junit.Assert;
import org.junit.Test;

public class TestSquaresAndSort {

    @Test
    public void calcSquare (){

        SquaresAndSort squaresAndSort = new SquaresAndSort();
        Assert.assertArrayEquals(new int[] {0,1,9,16,100},squaresAndSort.calcSquare(new int[] {4,-1,0,3,10}));
    }
}
