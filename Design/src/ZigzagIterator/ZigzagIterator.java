package ZigzagIterator;

import java.util.List;

public class ZigzagIterator {
	private List<Integer> v1;
	private List<Integer> v2;
	private int m = 0;
	private int n = 0;
	private int min;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1 = v1;
        this.v2 = v2;
        min = Math.min(v1.size(), v2.size());
    }

    public int next() {
    	if(m < min && n < min && m == n) {
    		return v1.get(m++);
    	}
    	else if(m <= min && n < min && m > n) {
    		return v2.get(n++);
    	}
    	else if(v1.size() > min) return v1.get(m++);
    	else return v2.get(n++);
    }

    public boolean hasNext() {
        return n < v2.size() || m < v1.size();
    }
}
