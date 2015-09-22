package PeekingIterator;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
	private Iterator<Integer> iter;
	private Integer cur;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
	    cur = null;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		if(cur == null) cur = iter.next();
		return cur;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(cur == null) return iter.next();
	    int temp = iter.next();
	    cur = temp;
	    return temp;
	}

	@Override
	public boolean hasNext() {
	    return cur != null || iter.hasNext();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
