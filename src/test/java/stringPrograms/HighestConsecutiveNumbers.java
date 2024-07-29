package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighestConsecutiveNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(1, 3, 8, 9, 5, 6, 7, 8, 9, 2, 3));
		ArrayList<Integer> result = findHighestConsecutiveNumbers(inputList);
		System.out.println(result);
	}

	public static ArrayList<Integer> findHighestConsecutiveNumbers(ArrayList<Integer> arr) {
		if (arr == null || arr.isEmpty()) {
			return new ArrayList<>();
		}

		// Sort the array
		Collections.sort(arr);

		ArrayList<Integer> maxSequence = new ArrayList<>();
		ArrayList<Integer> currentSequence = new ArrayList<>();
		currentSequence.add(arr.get(0));

		// Loop through the sorted array and find consecutive sequences
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) == arr.get(i - 1) + 1) {
				currentSequence.add(arr.get(i));
			} else {
				if (currentSequence.size() > maxSequence.size()) {
					maxSequence = new ArrayList<>(currentSequence);
				}
				currentSequence.clear();
				currentSequence.add(arr.get(i));
			}
		}

		// Check the last sequence
		if (currentSequence.size() > maxSequence.size()) {
			maxSequence = currentSequence;
		}

		return maxSequence;
	}
}
