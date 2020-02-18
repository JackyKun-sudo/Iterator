/**
 * Assignment class takes in the title, description, topic, and points, then sends
 * the values to Course. Also provides getPoints method.  
 */
//package csce247.assignments.iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment {
	String title, description, topic;
	int points;
	
	public Assignment(String title, String description, String topic, int points) {
		this.title = title;
		this. description = description;
		this.topic = topic;
		this.points = points;
	}
	
	public String toString() {
		return title + description + topic;
	}
	
	public double getPoints() {
		return points;
	}
}