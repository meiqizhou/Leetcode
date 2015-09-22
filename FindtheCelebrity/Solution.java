package FindtheCelebrity;

public class Solution extends Relation {
    public int findCelebrity(int n) {
    	for(int i = 0; i < n; i++) {
    		if(knowPeople(i, n)) continue;
    		else {
    			if(allKnow(i, n)) return i;
    		}
    	}
    	return -1;
    }
    
    //check if People p know People 0 ~ n
    private boolean knowPeople(int p, int n) {
    	for(int i = 0; i < n; i++) {
    		if(i == p) continue;
    		if(knows(p, i)) return true;
    	}
    	return false;
    }
    
    //check if people 0 ~ n all know People p
    private boolean allKnow(int p, int n) {
    	for(int i = 0; i < n; i++) {
    		if(i == p) continue;
    		if(!knows(i, p)) return false;
    	}
    	return true;
    }
}
