package UglyNumberII;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int nthUglyNumber(int n) {
        if(n < 0) return 0;
        long val = 0;
        Queue<Long> queue2 = new LinkedList<Long>();
        Queue<Long> queue3 = new LinkedList<Long>();
        Queue<Long> queue5 = new LinkedList<Long>();
        queue2.add((long) 1);
        for(int i = 0; i < n; i++) {
        	long v2 = queue2.size() > 0 ? queue2.peek() : Long.MAX_VALUE;
        	long v3 = queue3.size() > 0 ? queue3.peek() : Long.MAX_VALUE;
        	long v5 = queue5.size() > 0 ? queue5.peek() : Long.MAX_VALUE;
        	val = Math.min(v2, Math.min(v3, v5));
        	if(val == v2) {
        		queue2.poll();
        		queue2.add(2 * val);
        		queue3.add(3 * val);
        	}
        	else if(val == v3) {
        		queue3.poll();
        		queue3.add(3 * val);
        	}
        	else if(val == v5) {
        		queue5.poll();
        	}
        	queue5.add(5 * val);
        }
        return (int) val;
    }
}
