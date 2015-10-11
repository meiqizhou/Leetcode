package MeetingRooms;

import java.util.Arrays;

public class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, new IntervalComparator());
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i - 1].end > intervals[i].start) return false;
        }
        return true;
    }
}
