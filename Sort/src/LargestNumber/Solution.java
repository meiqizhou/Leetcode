package LargestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
import java.util.Arrays;
public class Solution {
    public String largestNumber(int[] num) {
    	int[] num1 = {824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247};   	
    	boolean allZeros = true;
    	StringBuilder sb = new StringBuilder();
    	int maxLength = 0;
    	String[] temp = new String[num.length];
    	//找出最大长度
    	for(int i = 0; i < num.length; i++){
    		int length = String.valueOf(num[i]).length();
    		if(num[i] != 0) allZeros = false;
    		if(length > maxLength){
    			maxLength = length;
    		}
    		temp[i] = String.valueOf(num[i]);
    	}
    	if(allZeros) return 0 + "";
    	int[] newNum = new int[num.length];
    	//后面补位，补最后一位的digit的值
    	for(int i = 0; i < newNum.length; i++){
    		int diffLength = maxLength - temp[i].length();
    		for(int j = 0; j < diffLength; j++){
    			char tempChar = temp[i].charAt(temp[i].length() - 1);
    			temp[i] = temp[i] + tempChar;
    		}
    		newNum[i] = Integer.valueOf(temp[i]).intValue();
    	}
    	//从前往后查，开始sort
    	for(int i = 1; i < newNum.length; i++){
    		for(int j = i; j > 0 && (newNum[j] < newNum[j - 1] || ((num[j - 1] + "").contains(num[j] + "") && Integer.valueOf((num[j] + "").substring(0, 1)).intValue() > Integer.valueOf((num[j] + "").substring((num[j] + "").length() - 1, (num[j] + "").length())).intValue())); j--){
    			exch(newNum, j, j - 1);
    			exch(num, j, j - 1);
    		}
    	}
    	for(int i = num.length - 1; i > -1; i--){
    		sb.append(num[i]);
    	}
    	return sb.toString();
    }

	private void exch(int[] num, int j, int i) {
		// TODO Auto-generated method stub
		int temp = num[j];
		num[j] = num[i];
		num[i] = temp;
	}
}
**/
class StringComparator implements Comparator<String>{
	public int compare(String a, String b){
		if(a.length() == b.length()){
			return b.compareTo(a);
		}
		String ab = a + b;
		String ba = b + a;
		return ba.compareTo(ab);
	}
}

public class Solution {
    public String largestNumber(int[] num) {
    	ArrayList<String> list = new ArrayList<String>(num.length);
    	for(int i = 0; i < num.length; i++){
    		list.add(String.valueOf(num[i]));
    	}
    	Collections.sort(list, new StringComparator());
    	String res = "";
    	for(int i = 0; i < list.size(); i++){
    		res += list.get(i);
    	}
    	if(res.charAt(0) == '0'){
    		res = "0";
    	}
    	return res;
    }
}