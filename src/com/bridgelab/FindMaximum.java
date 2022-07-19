package com.bridgelab;

public class FindMaximum {
	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3, T a4, T a5, T a6) {
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		if (a4.compareTo(max) > 0)
			max = a4;
		if (a5.compareTo(max) > 0)
			max = a5;
		if (a6.compareTo(max) > 0)
			max = a6;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the six integer is : " + maxOfValues(15, 87, 68, 78, 97, 45)+ "\n");
		System.out.println("The maximum value between the six float is : " + maxOfValues(1.5f, 8.7f, 6.8f, 9.4f, 7.2f, 11.25f) + "\n");
		System.out.println("The maximum value between the six string is : " + maxOfValues("Apple", "Banana", "Peach","Orange","Grapes","Strawberry"));
	}
}

	