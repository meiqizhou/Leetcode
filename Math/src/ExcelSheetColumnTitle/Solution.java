package ExcelSheetColumnTitle;

public class Solution {
    public String convertToTitle(int n) {
        String[] alph = {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"};
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
        	int index = n % 26;
        	sb.append(alph[index]);
            if(index == 0) n = n / 26 - 1;
            else n = n / 26;
        }
        return sb.reverse().toString();
    }
}
