package CompareVersionNumbers;

public class Solution {
    public int compareVersion(String version1, String version2) {
    	if(version1.equals(version2)) return 0;
    	int bversion1, bversion2;
    	String aversion1, aversion2;
    	if(version1.contains(".")){
    		int pos = version1.indexOf(".");
    		bversion1 = Integer.valueOf(version1.substring(0, pos)).intValue();
    		aversion1 = version1.substring(pos + 1, version1.length());
    	}
    	else{
    		bversion1 = Integer.valueOf(version1).intValue();
    		aversion1 = "0";
    	}
    	if(version2.contains(".")){
    		int pos = version2.indexOf(".");
    		bversion2 = Integer.valueOf(version2.substring(0, pos)).intValue();
    		aversion2 = version2.substring(pos + 1, version2.length()); 
    	}
    	else{
    		bversion2 = Integer.valueOf(version2).intValue();
    		aversion2 = "0";
    	}
    	if(bversion1 > bversion2){
    		return 1;
    	}
    	else if(bversion1 < bversion2){
    		return -1;
    	}
    	else return compareVersion(aversion1, aversion2);
    }
}
