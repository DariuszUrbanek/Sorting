package com.example.du;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {

		RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
		Integer[] array = arrayGenerator.randomArray(6);
		System.out.println(Arrays.asList(array));

		selectionSort(array);
		System.out.println(Arrays.asList(array));

	}

	
	private static void selectionSort(Integer[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex])
					minIndex = j;
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

}
