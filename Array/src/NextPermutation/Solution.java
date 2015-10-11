package NextPermutation;

/**
 * 
 * 傻逼题目说的一点儿都不明白，细节上相等要注意也没有说
 * “这道题是给定一个数组和一个排列，求下一个排列。算法上其实没有什么特别的地方，
 * 主要的问题是经常不是一见到这个题就能马上理清思路。
 * 下面我们用一个例子来说明，比如排列是(2,3,6,5,4,1)，
 * 求下一个排列的基本步骤是这样：
1) 先从后往前找到第一个不是依次增长的数，记录下位置p。比如例子中的3，对应的位置是1;
2) 接下来分两种情况：
    (1) 如果上面的数字都是依次增长的，那么说明这是最后一个排列，下一个就是第一个，
    其实把所有数字反转过来即可(比如(6,5,4,3,2,1)下一个是(1,2,3,4,5,6));
    (2) 否则，如果p存在，从p开始往后找，找找找，找到第一个比他小的数，然后指针再挪回这个数的前一个数，
    然后两个调换位置，比如例子中的4。调换位置后得到(2,4,6,5,3,1)。最后把p之后的所有数字倒序，
    比如例子中得到(2,4,1,3,5,6), 这个即是要求的下一个排列。
 * 
*/
public class Solution {
    public void nextPermutation(int[] num) {
    	int N = num.length, i = N - 2;
    	while(i > -1) {
    		if(num[i] - num[i + 1] < 0) {
    			break;
    		}
    		i--;
    	}
    	if(i == -1) {
    		reverse(num, 0, N - 1);
    		return;
    	}
    	int j = i + 1;
    	while(j < N) {
    		if(num[j] <= num[i]) break;
    		j++;
    	}
    	exch(num, i, j - 1);
    	reverse(num, i + 1, N - 1);
    	return;
    }

	private void reverse(int[] num, int lo, int hi) {
		// TODO Auto-generated method stub
		int i = lo, j = hi;
		while(i < j) {
			exch(num, i, j);
			i++;
			j--;
		}		
	}
	
	private void exch(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}
