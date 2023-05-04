
public class NumberReplacement {

	public static void main(String[] args) {
		int num = 9969;
		numsReplacement(num);
	}

	public static void numsReplacement(int num) {

		int len = 0;
		int result = 0;

		int temp = num;
		while (temp != 0) {

			temp = temp / 10;
			len = len + 1;
		}

		int arr[] = new int[len];
		int i = len - 1;
		while (num > 0) {
			arr[i] = num % 10;
			num = num / 10;
			i--;
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 9)
				arr[j] = 6;
			else if (arr[j] == 6)
				arr[j] = 9;
		}

		for (int a : arr) {

			result = (result * 10) + a;
		}
		System.out.println(result);

	}

}
