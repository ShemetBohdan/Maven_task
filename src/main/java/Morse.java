import java.util.Arrays;
import java.util.HashSet;

public class Morse {

    static final char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'};

    static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public String engToMorse(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < english.length; j++) {
                if (english[j] == chars[i]) {
                    str = str + morse[j];
                    break;
                }
            }
        }
        return str;
    }

    public int transformation(String[] words) {

        for (int i = 0; i < words.length; i++) {
            words[i] = engToMorse(words[i]);
        }
        HashSet<String> words2 = new HashSet<>();
        words2.addAll(Arrays.asList(words));
        return words2.size();
    }
}
