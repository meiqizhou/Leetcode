package AddBinary;
public class Solution {
    public String addBinary(String a, String b) {
    	int len1 = a.length(), len2 = b.length();
    	String temp = "", s = "";
    	String[] res = new String[Math.max(len1, len2)];
    	if(len1 >= len2){
    		for(int i = 0; i < len1 - len2; i++){
    			temp += "0";
    		}
    		b = temp + b;
    	}
    	else{
    		for(int i = 0; i < len2 - len1; i++){
    			temp += "0";
    		}
    		a = temp + a;
    	}
    	int i = a.length() - 1, carry = 0;
    	while(i > -1){
    		int digit = (Integer.valueOf(a.substring(i, i + 1)).intValue() + Integer.valueOf(b.substring(i, i + 1)).intValue() + carry) % 2;
    		carry = (Integer.valueOf(a.substring(i, i + 1)).intValue() + Integer.valueOf(b.substring(i, i + 1)).intValue() + carry) / 2;
    		res[i] = String.valueOf(digit);
    		i--;
    	}
    	if(carry == 1){
    		s +=  "1";
    		for(int j = 0; j < res.length; j++){
    			s += res[j];
    		}
    	}
    	else{
    		for(int j = 0; j < res.length; j++){
    			s += res[j];
    		}
    	}
    	return s;
    }
}
