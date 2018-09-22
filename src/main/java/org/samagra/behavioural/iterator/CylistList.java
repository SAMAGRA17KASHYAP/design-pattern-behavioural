package org.samagra.behavioural.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class CylistList implements Iterable<String> {

	private static final int LIMIT = 20;

	String [] elements= new String[LIMIT];
	
	int current=-1;
	
	public void insert(String element) {
		current ++;
		if(current < LIMIT)
			elements[current] = element;
	}
	
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int count =0;
			@Override
			public boolean hasNext() {
				return count <= current;
			}

			@Override
			public String next() {
				return elements[count++];
			}};
	}


	@Override
	public String toString() {
		return "CylistList [elements=" + Arrays.toString(elements) + ", current=" + current + "]";
	}
	
	

}
