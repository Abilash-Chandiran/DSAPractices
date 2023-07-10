package main.java.mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class MethodImplementations {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int pos = 3;
		int value = 44;
		addtotheSpecificIndex(arr, pos, value);
		System.out.println(toString(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println(contains(arr, 2));
		System.out.println(Arrays.toString(remove(arr, 5)));
		String str = "Trim to given length Txt";
		System.out.println(trim(str, 20));

	}

	public static void addtotheSpecificIndex(int[] arr, int pos, int value) {
		for (int i = 0; i < arr.length; i++)
			if (i == pos)
				arr[i] = value;
		System.out.println(Arrays.toString(arr));
	}

	public static String toString(int[] arr) {
		if (arr == null)
			return "null";
		int len = arr.length - 1;
		if (len == -1)
			return "[]";

		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0;; i++) {
			sb.append(arr[i]);
			if (i == len)
				return sb.append(']').toString();
			sb.append(", ");
		}
	}

	public static boolean contains(int[] arr, int value) {

		boolean containsValue = false;
		for (int n : arr)
			if (n == value)
				containsValue = true;
		return containsValue;
	}

	public static int[] remove(int[] arr, int value) {

		int[] newArr = new int[arr.length - 1];
		int i = 0;
		for (int n : arr)
			if (n != value)
				newArr[i++] = n;
		return newArr;
	}

	public static String trim(String str, int trimlen) {
		String substr = "";
		if (trimlen < str.length())
			substr = str.substring(0, trimlen);
		else
			System.out.println("Given trim length is greater than the String length");
		return substr;
	}

}
