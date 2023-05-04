
public class ReplacewithSqureBracket {

	/**
	 * 
	 * Using split method convert it to arr
	 * Iterate and check with if condition 
	 * asign the new values in new arr and convert it to String
	 * 
	 */
	public static void main(String[] args) {

		replaceString();
	}

	public static void replaceString() {

		String address = "1.1";
		String newAddress;
		String arr[] = address.split("");
		String newArr[] = new String[arr.length + 6];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("1")) {
				System.out.println("1st if - "+i);
				newArr[i] = arr[i];
				newArr[i + 1] = "[";
			}
			if (arr[i].equals(".")) {
				System.out.println("2nd if - "+i);
				System.out.println("2nd if - "+arr[i]);
				newArr[i + 1] = arr[i];
				newArr[i + 2] = "]";

			}
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}

	}

}
