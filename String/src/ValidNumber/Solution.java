package ValidNumber;

public class Solution {
    public boolean isNumber(String s) {
    	int i = 0, n = s.length();
    	//前面的空格忽略
    	while(i < n && s.charAt(i) == ' ') i++;
    	//找到第一个＋或者－
    	if(s.charAt(i) == '+' || s.charAt(i) == '-') i++;
    	boolean isNumber = false;   	
    	//加减号后面，或者没遇到加减号，必须是字母
    	while(i < n && Character.isDigit(s.charAt(i))) {
    		i++;
    		isNumber = true;
    	}
    	//如果遇到.
    	if(i < n && s.charAt(i) == '.') {
    		i++;
    		while(i < n && Character.isDigit(s.charAt(i))){
    			i++;
    			isNumber = true;
    		}
    	}
    	//如果遇到e
    	if(isNumber && i < n && s.charAt(i) == 'e'){
    		i++;
    		isNumber = false;
    	    //如果e后遇到＋－，此处为e的计算
    	    if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
    	    	i++;
    	    }
    	    //＋－后必须为字母，如果没遇到＋－，此处也必须为字母
    	    while(i < n && Character.isDigit(s.charAt(i))) {
    	    	i++;
    	    	isNumber = true;
    	    }
    	}    
    	//最后的白空格处理
    	while(i < n && Character.isWhitespace(s.charAt(i))){
    		i++;
    	}
    	return i == n && isNumber;
    }
}