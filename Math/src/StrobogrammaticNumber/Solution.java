package StrobogrammaticNumber;

public class Solution {
    public boolean isStrobogrammatic(String num) {
        String[] str = new String[]{"2", "3", "4", "5", "7"};
        for(int i = 0; i < str.length; i++) {
            if(num.contains(str[i])) return false;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '0') sb.append("0");
            else if(num.charAt(i) == '1') sb.append("1");
            else if(num.charAt(i) == '6') sb.append("9");
            else if(num.charAt(i) == '8') sb.append("8");
            else if(num.charAt(i) == '9') sb.append("6");
        }
        return sb.reverse().toString().equals(num);
    }
}
