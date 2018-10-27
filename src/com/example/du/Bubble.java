package com.example.du;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {

		RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
		Integer[] array = arrayGenerator.randomArray(8);
		System.out.println(Arrays.asList(array));

		bubbleSort(array);

		System.out.println(Arrays.asList(array));

	}

	// [time] complexity O(n^2), memory complexity O(1) (not including starting
	// memory)
	private static void bubbleSort(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
