import org.junit.Assert;
import org.junit.Test;

public class TestMorse {

    @Test
    public void testEngToMorse(){
        Morse morse = new Morse();
        String str = "--...-.";
        boolean bool = str.equals(morse.engToMorse("gin"));
        Assert.assertArrayEquals(new boolean[]{true},new boolean[]{bool});
    }

    @Test
    public void testTransformation(){
        Morse morse = new Morse();
        String[] str = {"gin","zen","gig","msg"};
        Assert.assertEquals(2,morse.transformation(str));
    }
}
