package StringtoInteger_atoi;

/**
 * 
 * @author boyangli
 * 先确定integer的极限值
 * 找到第一个不是空格的，记下是‘＋’还是‘—’
 * 超限或者num == maxDiv10 && digit >= 8
 * 要注意：
 * i 是从头找到尾，只用遍历一遍，找到第一个＋或者 —， 就要停止
 * 极限值的处理一定要小心
 * if(num > MAXDIV10 || num == MAXDIV10 && digit >= 8){
    			if(sign == 1){
    				return Integer.MAX_VALUE;
    			}
    			else{
    				return Integer.MIN_VALUE;
    			}
    		}
 */
public class Solution {
	public static final int MAXDIV10 = Integer.MAX_VALUE / 10;
    public int atoi(String str) {
    	int i = 0, sign = 1;
    	while(i < str.length()){
    		if(str.charAt(i) == ' '){
    			i++;
    		}
    		else if(str.charAt(i) == '+'){
    			i++;
    			break;
    		}
    		else if(str.charAt(i) == '-'){
    			sign = -1;
    			i++;
    			break;
    		}
    		else{
    			break;
    		}
    	}
    	int num = 0;
    	while(i < str.length() && Character.isDigit(str.charAt(i))){
    		int digit = Character.getNumericValue(str.charAt(i));
    		if(num > MAXDIV10 || num == MAXDIV10 && digit >= 8){
    			if(sign == 1){
    				return Integer.MAX_VALUE;
    			}
    			else{
    				return Integer.MIN_VALUE;
    			}
    		}
    		else{
    			num = num * 10 + digit;
    			i++;
    		}
    	}
    	return sign * num;
    }
}
