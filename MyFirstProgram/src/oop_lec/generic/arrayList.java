package oop_lec.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
	
	private int[] data;
	
	private static int DEFAULT_SIZE = 10;
	
	private int size = 0;
	
	public arrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	// Method for adding new element in ArrayList
	
	public void add(int num) {
		if (isFull()) {
			resize();
		}
		
		 data[size++] = num;
		
	}
	
	private void resize() {
		int[] temp = new int[data.length * 2];
		
		// copy the current item in new array
		
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		
		data = temp;
		
	}
	
	//Creating method for removing last most item of ArrayList
	
	public int remove() { // This will be of int data type bcz method is returning integer valued digit
		int removed = data[--size]; // here first size will get decremented then it will be used as index
		return removed;
	}
	
	
	// Creating method to get size of ArrayList
	
	public int size() {
		
		return size;
		
	}
	
	// Creating method for placing any number at specific index
	
	public void set(int index, int num) {
		data[index] = num;
	}
	
	// creating methods to access data item using index
	
	public int get(int index) {
		return data[index];
	}
	
	private boolean isFull() {
		return size == data.length;
	}
	
	
	// Since printing object gives HashCode , so we need to override toString() method()	
	
	@Override
	public String toString() {
		return "arrayList{" +
				"data=" + Arrays.toString(data) + 
				", size=" + size +
				'}';
	}
	
	
	public static void main(String[] args) {
		
//		ArrayList <Integer> list = new ArrayList <>();  //This is how we define an array list in java
		
		
		arrayList list = new arrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);

		
		System.out.println(list.size());
		
		list.set(2, 46);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.remove());
		
	}
	

}
