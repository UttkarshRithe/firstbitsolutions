package Tree.problems.MeetingScheduling;

import java.time.Duration;
import java.time.LocalTime;

public class Meeting implements Comparable {

	String name;
	LocalTime startTime;
	LocalTime endtime;
	
	
	
	public Meeting(String name, LocalTime startTime, LocalTime endtime) {
		super();
		this.name = name;
		this.startTime = startTime;
		this.endtime = endtime;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndtime() {
		return endtime;
	}
	public void setEndtime(LocalTime endtime) {
		this.endtime = endtime;
	}

	@Override
	public int compareTo(Object o) {
	    Meeting m = (Meeting) o;
	    Duration diff = Duration.between(m.startTime,this.startTime);
	    return (int) diff.toHours();
	}
	
	public boolean isOverlapping(Meeting m) {
	    return this.startTime.isBefore(m.endtime) && this.endtime.isAfter(m.startTime);
	}
	
	@Override
	public String toString() {
	    return name + " (" + startTime + " - " + endtime + ")";
	}
	
}
