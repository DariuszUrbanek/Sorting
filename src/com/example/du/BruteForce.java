package com.example.du;

import java.util.Arrays;

public class BruteForce {

	public static void main(String[] args) {

		RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
		Integer[] array = arrayGenerator.randomArray(6);
		System.out.println(Arrays.asList(array));

		bruteForce(array);

		System.out.println(Arrays.asList(array));

	}

	// [time] complexity O(n^2), memory complexity O(1) (not including starting
	// memory)
	private static void bruteForce(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i < j && array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
