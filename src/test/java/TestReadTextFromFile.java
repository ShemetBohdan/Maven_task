
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

public class TestReadTextFromFile {

    @Test
    public void reedingTextFromFile() throws IOException {

        ReadTextFromFile readTextFromFile = new ReadTextFromFile();
        String textFromFile =" ".concat("Shortly before the 2020 election government-sponsored program " +
                "$3 billion for");
        String pathnameInputFile = "src/main/resources/books/InputTest";
        boolean bool = textFromFile.equals(readTextFromFile.reedingTextFromFile(pathnameInputFile));
        Assert.assertArrayEquals(new boolean[]{true},new boolean[]{bool});
    }

    @Test
    public  void saveListfromFile() throws IOException {
        ReadTextFromFile readTextFromFile = new ReadTextFromFile();
        String pathnameInputFile = "src/main/resources/books/InputTest";
        String pathnameOutputFile = "src/main/resources/books/OutputTest";
        readTextFromFile.saveListfromFile(pathnameInputFile,pathnameOutputFile);
        String strFileOutput = readTextFromFile.reedingTextFromFile(pathnameOutputFile);
        String str =" ".concat("the 1 government-sponsored 1 election 1 $ 1 billion " +
                "1 before 1 Shortly 1 for 1 program 1");
        boolean bool = str.equals(strFileOutput);
        Assert.assertArrayEquals(new boolean[]{true},new boolean[]{bool});
    }
}
