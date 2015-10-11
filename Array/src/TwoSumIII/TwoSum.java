package TwoSumIII;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TwoSum {
	List<Integer> list = new ArrayList<Integer>();

	public void add(int number) {
	    list.add(number);
	}

	public boolean find(int value) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i = 0; i < list.size(); i++)
	    {
	    	int x = list.get(i);
	    	if(map.containsKey(value - x)){
	    		return true;
	    	}
	    	map.put(x, i);
	    }
	    return false;
	}
}

