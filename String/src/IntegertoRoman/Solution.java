package IntegertoRoman;

public class Solution {
	public String intToRoman(int num) {
		String[] arr1 = {"", "M", "MM", "MMM"};
		String[] arr2 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] arr3 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] arr4 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		int len = getLen(num);
		if(len == 4) return new String(arr1[intToArray(num)[0]] + arr2[intToArray(num)[1]] + arr3[intToArray(num)[2]] + arr4[intToArray(num)[3]]);
		else if(len == 3) return new String(arr2[intToArray(num)[0]] + arr3[intToArray(num)[1]] + arr4[intToArray(num)[2]]);
		else if(len == 2) return new String(arr3[intToArray(num)[0]] + arr4[intToArray(num)[1]]);
		else return new String(arr4[intToArray(num)[0]]);
	}
	
	public int[] intToArray(int num) {
		int len = getLen(num);
		int[] res = new int[len];
		for(int i = 0; i < res.length; i++) {
			res[i] = (int) (num / Math.pow(10, len - i - 1));
			num -= res[i] * Math.pow(10, len - i - 1);
		}
		return res;
	}
	
	public int getLen(int num) {
		String str = String.valueOf(num);
		int len = str.length();
		return len;
	}
}
