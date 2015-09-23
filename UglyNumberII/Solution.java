package UglyNumberII;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * @author lby
 *
 */
public class Solution {
    public int nthUglyNumber(int n) {
        if(n < 0) return 0;
        long val = 0;
        Queue<Long> queue2 = new LinkedList<Long>();
        Queue<Long> queue3 = new LinkedList<Long>();
        Queue<Long> queue5 = new LinkedList<Long>();
        queue2.add((long)1);
        for(int i = 0; i < n; i++) {
            long val2 = !queue2.isEmpty() ? queue2.peek() : Long.MAX_VALUE;
            long val3 = !queue3.isEmpty() ? queue3.peek() : Long.MAX_VALUE;
            long val5 = !queue5.isEmpty() ? queue5.peek() : Long.MAX_VALUE;
            val = Math.min(Math.min(val2, val3), val5);
            if(val == val2) {
                queue2.poll();
                queue2.add(2 * val);
                queue3.add(3 * val);
            }
            else if(val == val3) {
                queue3.poll();
                queue3.add(3 * val);
            }
            else if(val == val5) {
                queue5.poll();
            }
            queue5.add(5 * val);
        }
        return (int) val;
    }
}
