package TwoSumII;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int begin = 0, end = numbers.length - 1;
    	while(begin < end)
    	{
    		if(numbers[begin] + numbers[end] < target)
    		{
    			begin++;
    		}
    		else if(numbers[begin] + numbers[end] > target){
    			end--;
    		}
    		else{
    			break;
    		}
    	}
    	int number1 = numbers[begin], number2 = numbers[end];
    	int index1 = -1, index2 = -1;
    	for(int i = 0; i < numbers.length; i++){
    		if(numbers[i] == number1 || numbers[i] == number2){
    			if(index1 == -1){
    				index1 = i + 1;
    			}
    			else{
    				index2 = i + 1;
    			}
    		}
    	}
        return new int[]{index1, index2};		
    }
}
