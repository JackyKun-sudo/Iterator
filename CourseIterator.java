/**
 * CourseIterator class provides methods to traverse assignments array , and implements Iterator.
 */

package csce247.assignments.iterator;
import java.util.Iterator;

public class CourseIterator implements Iterator<Assignment>{
	private Assignment[] assignments;
    private int position = 0;

    public CourseIterator(Assignment[] assignments) {
    	this.assignments = assignments;
    }
   
    public boolean hasNext() {
    	if (position > assignments.length || assignments[position] == null) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }

    public Assignment next() {
    	if (hasNext()) {
    		position++;
    		return assignments[position-1];
    	}
    	else { 
    		return null;
    	}
    }
    
}