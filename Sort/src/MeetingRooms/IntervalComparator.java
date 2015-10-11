package MeetingRooms;

import java.util.Comparator;

class IntervalComparator implements Comparator<Interval> {
    public int compare(Interval in1, Interval in2) {
        if(in1.start < in2.start) return -1;
        else if(in1.start > in2.start) return 1;
        else {
            if(in1.end < in2.end) return -1;
            else if(in1.end > in2.end) return 1;
            else return 0;
        }
    }
}
