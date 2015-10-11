package MeetingRoomsII;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
    	if (intervals == null || intervals.length == 0)  
            return 0;  
        Arrays.sort(intervals, new IntervalComparator());  
        int N = intervals.length;
        int room = 1;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.offer(intervals[0].end);
        for(int i = 1; i < N; i++) {
        	int temp = minHeap.peek();
        	if(intervals[i].start < temp) {
        		room++;
        	}
        	else {
        		minHeap.poll();
        	}
        	minHeap.offer(intervals[i].end);
        }
        return room;
    }
}
