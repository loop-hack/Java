package oop_lec.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class customGenericArrayList<T> { // Here this <T> will be replacing values like Integer, String, etc
	
	private Object[] data;
	
	private static int DEFAULT_SIZE = 10;
	
	private int size = 0;
	
	public customGenericArrayList() {
		this.data = new Object[DEFAULT_SIZE];
	}
	
	// Method for adding new element in ArrayList
	
	public void add(T num) {
		if (isFull()) {
			resize();
		}
		
		 data[size++] = num;
		
	}
	
	private void resize() {
		Object[] temp = new Object[data.length * 2];
		
		// copy the current item in new array
		
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		
		data = temp;
		
	}
	
	//Creating method for removing last most item of ArrayList
	
	public T remove() { // This will be of int data type bcz method is returning integer valued digit
		T removed = (T)data[--size]; // here first size will get decremented then it will be used as index
		return removed;
	}
	
	
	// Creating method to get size of ArrayList
	
	public int size() {
		
		return size;
		
	}
	
	// Creating method for placing any number at specific index
	
	public void set(int index, T num) {
		data[index] = num;
	}
	
	// creating methods to access data item using index
	
	public T get(int index) {
		return (T)data[index];
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
		
		
		customGenericArrayList <String>list = new customGenericArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list);

		
		System.out.println(list.size());
		
		list.set(2, "d");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.remove());
		
	}
	

}
