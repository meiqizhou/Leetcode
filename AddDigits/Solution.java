package AddDigits;

public class Solution {
    public int addDigits(int num) {
        while(num >= 10) {
            num = getNext(num);
            if(num < 10) return num;
        } 
        return num;
    }
    
    private int getNext(int num) {
        int sum = 0;
        String s = String.valueOf(num);
        for(int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return sum;
    }
}
