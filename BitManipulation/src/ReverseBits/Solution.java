package ReverseBits;

public class Solution {
	 public int reverseBits(int n) {
		 String s = "";
		 long res = 0;
		 for(int i = 0; i < 32; i++){
			 int temp = (1 << i) & n;
			 if(temp != 0) temp = 1;
			 else temp = 0;
			 s += Integer.valueOf(temp).intValue();
		 }
		 for(int i = 0; i < 32; i++){
			 res += Math.pow(2, i) * Integer.valueOf(s.substring(31 - i, 32 - i)).intValue();
		 }
		 return (int) res;
	 }
}
