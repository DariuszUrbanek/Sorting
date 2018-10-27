package com.example.du;

import java.util.Arrays;
import java.util.OptionalDouble;

public class QuickSort {

	public static void main(String[] args) {

		RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
		Integer[] array = arrayGenerator.randomArray(20);
		System.out.println(Arrays.asList(array));

		quicksort(array, 0, array.length - 1);
		
		return;

	}

	/*
	 * complexity = O(n * log n)
	 */
	private static void quicksort(Integer[] array, int start, int end) {
		if(start >= end)
			return;
		
		System.out.println("quicksort(" + start + "," + end + ")");
		
		int originalStart = start;
		int originalEnd = end;

		OptionalDouble average = averageValue(array, start, end);

		if (!average.isPresent()) {
			return;
		}
		
		while (start < end) {
			if (array[start] > average.getAsDouble()) {
				int temp;
				temp = array[start];
				array[start] = array[end];
				array[end] = temp;

				end--;
			} else {
				start++;
			}
		}
		
		int meetpoint = start;
		quicksort(array, originalStart, array[meetpoint] > average.getAsDouble() ? meetpoint - 1 : meetpoint);
		quicksort(array, array[meetpoint] > average.getAsDouble() ? meetpoint : meetpoint + 1, originalEnd);

	}

	private static OptionalDouble averageValue(Integer[] array, int start, int end) {
		Integer[] array2 = new Integer[end - start + 1];
		System.arraycopy(array, start, array2, 0, end - start + 1);
		OptionalDouble average = Arrays.asList(array2).stream().mapToInt(a -> a).average();
		return average;
	}

}
