public class RomanToInt {

    public int romanToInt(String str) {
        int sum = 0, num = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            switch(str.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if ( 2 * num < sum) sum -= num;
            else sum += num;
        }
        return sum;
    }
}
