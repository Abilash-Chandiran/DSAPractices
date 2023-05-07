package dsaWeek2Day3;

public class NumtoArray {

	public static void main(String[] args) {

		int nums[] = { 5, 5, 5 };
		numsToarray(nums);
	}

	public static void numsToarray(int nums[]) {

		// Step 1 >> array to int number
		int res = 0;
		for (int n : nums) {
			res = (res * 10) + n;
		}
		res = res + 1;

		// Step 2 >> int number to array
		String temp[] = Integer.toString(res).split("");
		int newarr[] = new int[temp.length];

		int j = 0;
		for (String s : temp) {
			newarr[j] = Integer.parseInt(s);
			j++;
		}

		// Printing int array updated values
		for (int numbers : newarr) {

			System.out.println(numbers);
		}

	}

}
