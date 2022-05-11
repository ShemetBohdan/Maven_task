import org.junit.Assert;
import org.junit.Test;

public class TestSortBubble {

    @Test
    public void sortBubble(){

        SortBubble sortBubble = new SortBubble();
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6},sortBubble.sortBubble(new int[]{6,4,5,2,3,1}));
    }
}
