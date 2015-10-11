package PlusOne;


public class Solution {
    public int[] plusOne(int[] digits) {
    	int N = digits.length;
    	int[] res1 = new int[N];
    	int carry = 1;
    	for(int i = N - 1; i > -1; i--){
    		res1[i] = (digits[i] + carry) % 10;
    		carry = (digits[i] + carry) / 10;
    	}
    	int[] res2 = new int[N + 1];
    	res2[0] = 1;
    	for(int i = 1; i < N + 1; i++){
    		res2[i] = res1[i - 1];
    	}
    	if(res1[0] == 0) return res2;
    	else return res1;
    }
}
