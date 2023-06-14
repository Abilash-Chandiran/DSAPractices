
package dsa;

import java.util.Arrays;
import java.util.List;

public class FirstBadVersion {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 2, 3, 4, 5);
		System.out.println(firstBadVersion(nums));
	}

	public static boolean isBadVersion(int num) {
		boolean badVerSion = false;
		List<Integer> badversions = Arrays.asList(1, 4, 8, 35, 68);
		if (badversions.contains(num)) {
			badVerSion = true;
			return badVerSion;
		}
		return badVerSion;
	}

	public static int firstBadVersion(List<Integer> nums) {
		int left = 1, right = nums.size();
		int badversion = nums.size();
		while (left <= right) {
			if (isBadVersion(nums.get(left)) == true) {
				badversion = nums.get(left);
				break;
			}
			left++;
		}

		return badversion;
	}

}
