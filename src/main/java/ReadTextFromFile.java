
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadTextFromFile {

    public void saveListfromFile(String pathNameInputFile,String pathNameOutputFile) throws IOException {

        String result = searchIndElement(pathNameInputFile);
        File resultTask = new File(pathNameOutputFile);
        FileWriter fileWriter = new FileWriter(resultTask);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(result);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public String searchIndElement(String pathname) throws IOException {

        String text = reedingTextFromFile(pathname);
        String textReplace = replaceText(text);
        String[] arr = textReplace.split(" ");
        List<String> list = Arrays.asList(arr);
        Map<String, Integer> map = list.stream()
                .filter(s -> !s.startsWith("русс") && !s.startsWith("росс")&& !s.equals("") )
                .sorted()
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        List<String> myList1 = map.entrySet()
                .stream()
                .map(e -> e.getKey() + " " + e.getValue())
                .toList();
        String result = myList1.stream()
                .collect(Collectors.joining("\n", "", ""));
        return result;
    }

    public String reedingTextFromFile(String pathname) throws IOException {

        File file = new File(pathname);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str1 = "";
        String str3;
        do {
            String str2 = bufferedReader.readLine();
            if (str2.isEmpty()){
                str2 = bufferedReader.readLine();
            }
//            str3 = str2.concat(str1);
            str3 = str1.concat(" ").concat(str2);
            str1 = str3;
        }
        while (bufferedReader.ready());
        fileReader.close();
        bufferedReader.close();
        return str3;
    }

    public String replaceText(String str){

        return str
                .replace("–", "")
                .replace(",", "")
                .replace(".", " ")
                .replace("…", " ")
                .replace("[", "")
                .replace("]", "")
                .replace("1", "")
                .replace("2", "")
                .replace("3", "")
                .replace("4", "")
                .replace("5", "")
                .replace("6", "")
                .replace("7", "")
                .replace("8", "")
                .replace("9", "")
                .replace("0", "")
                .replace(")", "")
                .replace("!"," ")
                .replace("?"," ")
                .replace("»","")
                .replace("(", "")
                .replace(":", "")
                .replace(";", "")
                .replace("«", "")
                .replace("*", "")
                .replace("  "," ")
                .replace("=", "")
                .replace(">", "")
                .replace("<", "");
    }

}
