package com.bridgelab;

public class FindMaximum {
	public static float maxOfFloat(Float f1, Float f2, Float f3) {
		float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		return max;

	}

	public static void main(String[] args) {
		System.out.println("The Maximum Value Between The Three Float is: " + maxOfFloat(1.5f, 8.7f, 6.8f)+ "\n");
	}
}
