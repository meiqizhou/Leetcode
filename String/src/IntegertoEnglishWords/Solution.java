package IntegertoEnglishWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	private String res = "";
    public String numberToWords(int num) {
    	if(num == 0) return "Zero";
    	List<String[]> list = getList(num);
    	String temp = num + "";
    	int[] nums = new int[temp.length()];
    	for(int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(temp.substring(i, i + 1));
    	int N = nums.length;
    	if(N >= 10) {
    		int[] arr1 = Arrays.copyOfRange(nums, 0, N - 9);
    		int[] arr2 = Arrays.copyOfRange(nums, N - 9, N - 6);
    		int[] arr3 = Arrays.copyOfRange(nums, N - 6, N - 3);
    		int[] arr4 = Arrays.copyOfRange(nums, N - 3, N);
    		String str1 = getString(arr1, list), str2 = getString(arr2, list), str3 = getString(arr3, list), str4 = getString(arr4, list);
    		if(str2.equals("") && str3.equals("")) res += str1 + " Billion " + str4;
    		else if(str2.equals("") && !str3.equals("")) res += str1 + " Billion " + str3 + " Thousand " + str4;
    		else if(!str2.equals("") && str3.equals("")) res += str1 + " Billion " + str2 + " Million " + str4;
    		else res += str1 + " Billion " + str2 + " Million " + str3 + " Thousand " + str4;
    	}
    	else if(N >= 7) {
    		int[] arr1 = Arrays.copyOfRange(nums, 0, N - 6);
    		int[] arr2 = Arrays.copyOfRange(nums, N - 6, N - 3);
    		int[] arr3 = Arrays.copyOfRange(nums, N - 3, N);
    		String str1 = getString(arr1, list), str2 = getString(arr2, list), str3 = getString(arr3, list);
    		if(str2.length() == 0) res += str1 + " Million " + str3; 
    		else res += str1 + " Million " + str2 + " Thousand " + str3;
    	}
    	else if(N >= 4) {
    		int[] arr1 = Arrays.copyOfRange(nums, 0, N - 3);
    		int[] arr2 = Arrays.copyOfRange(nums, N - 3, N);
    		String str1 = getString(arr1, list), str2 = getString(arr2, list);
    		res += str1 + " Thousand " + str2;
    	}
    	else {
    		res += getString(nums, list);
    	}
    	return res.trim();
    }
    
    private String getString(int[] num, List<String[]> list) {
    	if(num.length == 2) {
    		return list.get(num[0])[num[1]].trim();
    	}
        else if(num.length == 3) {
    		String firstDigit = list.get(0)[num[0]];
        	if(firstDigit != "") firstDigit += " Hundred ";
        	String last = list.get(num[1])[num[2]];
        	return (firstDigit + last).trim();
    	}
        else return list.get(0)[num[0]].trim();
    }
    
    private List<String[]> getList(int num) {
    	String[] num0 = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    	String[] num1 = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    	String[] num2 = new String[10];
    	for(int i = 0; i < num2.length; i++) num2[i] = "Twenty" + " " + num0[i];
    	String[] num3 = new String[10];
    	for(int i = 0; i < num3.length; i++) num3[i] = "Thirty" + " " + num0[i];
    	String[] num4 = new String[10];
    	for(int i = 0; i < num4.length; i++) num4[i] = "Forty" + " " + num0[i];
    	String[] num5 = new String[10];
    	for(int i = 0; i < num5.length; i++) num5[i] = "Fifty" + " " + num0[i];
    	String[] num6 = new String[10];
    	for(int i = 0; i < num6.length; i++) num6[i] = "Sixty" + " " + num0[i];
    	String[] num7 = new String[10];
    	for(int i = 0; i < num7.length; i++) num7[i] = "Seventy" + " " + num0[i];
    	String[] num8 = new String[10];
    	for(int i = 0; i < num8.length; i++) num8[i] = "Eighty" + " " + num0[i];
    	String[] num9 = new String[10];
    	for(int i = 0; i < num9.length; i++) num9[i] = "Ninety" + " " + num0[i];
    	List<String[]> list = new ArrayList<String[]>();
    	list.add(num0);
    	list.add(num1);
    	list.add(num2);
    	list.add(num3);
    	list.add(num4);
    	list.add(num5);
    	list.add(num6);
    	list.add(num7);
    	list.add(num8);
    	list.add(num9);
    	return list;
    }
}
