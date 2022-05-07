public class Jewels {

    public int calcQuantityJewels(String jewels, String stones){
        int sumJewels = 0;
        int sumJewelsInStones = sumJewels;
        char [] word = stones.toCharArray();
        char [] word1 = jewels.toCharArray();
        for (int i = 0; i < word.length; i++){
            for (int j = 0; j<word1.length; j++){
                if (word1[j] == word[i]){
                    sumJewels = sumJewelsInStones+1;
                }
                sumJewelsInStones = sumJewels;
            }
        }
        return sumJewelsInStones;
    }
}
