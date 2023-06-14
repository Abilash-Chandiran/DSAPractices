package dsa;

import java.util.HashMap;
import java.util.Map;

public class ArrangeCoins {

	public static void main(String[] args) {

		System.out.println(arrangecoin(5));
	}

	public static int arrangecoin(int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0, step = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j > 0 && count < n; j--) {
				count++;
				hm.put(i, hm.getOrDefault(i, 0) + 1);
			}
		}
		System.out.println(hm);

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if (key == val) {
				step++;
			}
		}
		return step;
	}

}
