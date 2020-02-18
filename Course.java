/**
 * csce240
 * 02/18/20
 * Jackson Gaulke
 * Course class builds the assignment list. Provides methods for adding assignments, 
 * getting the graded weights, and growing assignment array.
 */

package csce247.assignments.iterator;

import java.util.Iterator;

public class Course {
	private Assignment[] assignments = new Assignment[5]; 
	private int count;
	private String title, name;
	
	public Course(String name, String title) {
		this.name = name;
		this.title = title;
	}
 
	public void addAssignment(String title, String description, String topic, int points) {
		
		Assignment assignment = new Assignment(title, description, topic, points);
        if(count >= assignments.length) {
        	assignments = growArray(assignments);
        }
        else {
        	assignments[count] = assignment;
        	count++;
        }
	}
	
	public double getAssignmentWeights() {
		int totalPoints = 0;
		for (int i = 0; i < count; i++ ) {
			totalPoints += assignments[i].getPoints();
		}
		return 100 / (totalPoints / 10);
	}
	
	private Assignment[] growArray(Assignment[] first) { 
		Assignment[] assignment = new Assignment[10];
		for (int i = 0; i < assignments.length; i++ ) {
			assignment[i] = first[i];
		}
		return assignment;
	}
	
	public String toString() {
		return this.name + ": " + this.title;
	}
	
	public CourseIterator createIterator() {
		return new CourseIterator(assignments);
	}
}
	
	
	