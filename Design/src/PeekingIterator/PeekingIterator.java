package PeekingIterator;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
	private Iterator<Integer> iterator;
	private Integer cur = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		if(cur == null) cur = iterator.next();
		return cur;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(cur == null) return iterator.next();
		int temp = cur;
		cur = null;
		return temp;
	}

	@Override
	public boolean hasNext() {
	    return cur != null || iterator.hasNext();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
