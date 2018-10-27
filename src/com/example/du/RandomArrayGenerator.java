package com.example.du;

public class RandomArrayGenerator {

	public Integer[] randomArray(Integer size) {

		Integer[] array = new Integer[size];

		for (int i = 0; i < size; i++) {
			
			Integer integer = (int) (Math.random() * (1000));
			
			array[i] = integer;
			
		}

		return array;
	}

}
