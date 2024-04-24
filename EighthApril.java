package basic;

import java.util.Arrays;

public class EighthApril {

	public static void main(String[] args) {
		
		//How to declare and initialize an array?
		int num[] = {22,34,35,76,79};
		System.out.println("Declared and Initialized array: ");
		for(int i : num) {
			System.out.println(i);
		}
		
		//How to find the length of an array in Java?
		System.out.println("Length of the array: ");
		System.out.println(num.length);
		
		//How to loop through an array in Java?
		String myname[] = {"Leela ","Manasa ","K"};
		System.out.println("Used for loop here: ");
		for(String name : myname) {
			System.out.println(name);
		}
		
		//How to copy an array in Java?
		char from[] = {'a','b','c','d','e','f','g','h'};
		char to[] = new char[6];
		System.out.println("Copied Elements: ");
		System.arraycopy(from, 1, to, 0, 6);
		System.out.println(to);
		
		//How to compare two arrays in Java?
		int arr[] = {21,31,41,51,60};
		int comp[] = {21,31,41,51,61};
		//if(arr==comp) {
			//System.out.println("Compared elements are same");
		//} else {
			//System.out.println("Compared elements are not same");
		//}
		
		if(Arrays.equals(arr, comp)) {
			System.out.println("COMPARED ELEMENTS ARE SAME");
		} else {
			System.out.println("COMPARED ELEMENTS ARE NOT SAME");
		}
		
		
		//How to sort an array in Java?
		int sorting[] = {8,20,1,5,37};
		Arrays.sort(sorting);
		System.out.println("Sorted Elements: ");
		for(int sorted : sorting) {
			System.out.println(sorted);
		}
		
		//How to search for an element in an array in Java?
		int elements[] = {5,9,12,7,38};
		for(int n=0;n<elements.length;n++) {
			if(elements[n]==12) {
				System.out.println("Element is at index: " + n);
			}
		}
		
		//How to reverse an array in Java?
		int array[] = {56,34,24,65,12};
		System.out.println("Reversed array: ");
		for(int a=array.length-1;a>=0;a--) {
			System.out.println(array[a]);
		}
	}

}
