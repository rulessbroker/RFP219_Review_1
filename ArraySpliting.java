package com.arrays;

import java.util.Arrays;

public class ArraySpliting {
	public static void main(String[] args) {
		int mainArray[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println("Main Array : ");
		for (int array : mainArray) {
			System.out.print(array + " ");

		}
		System.out.println();
		ArraySpliting split = new ArraySpliting();
		split.splittingCode(mainArray);
	}

	void splittingCode(int mainArray[]) {

		int length = mainArray.length / 2;
		int firstArray[] = Arrays.copyOfRange(mainArray, 0, length);
		int secondArray[] = Arrays.copyOfRange(mainArray, length, mainArray.length);

		System.out.println("First Array" + Arrays.toString(firstArray));
		System.out.println("Second Array" + Arrays.toString(secondArray));
	}
}
