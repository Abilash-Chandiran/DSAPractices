package main.java.optionalPrograms;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] arr = { -3, -4, 5, -1, 2, -4, 6, -1 };
		System.out.println(maximumSubArray(arr));
		System.out.println(maxSubArray(arr));

	}

	public static int maximumSubArray(int[] arr) {

		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int curSum = 0;
			for (int j = i; j < n - 1; j++)
				curSum += arr[j];
			if (curSum > maxSum)
				maxSum = curSum;
		}
		return maxSum;
	}

	public static int maxSubArray(int[] arr) {
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for (int i = 0; i < n - 1; i++) {
			currSum += arr[i];
			if (currSum > maxSum)
				maxSum = currSum;
			if (currSum < 0)
				currSum = 0;
		}
		return maxSum;
	}

}
