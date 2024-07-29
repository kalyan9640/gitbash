package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class HighestSequenceInArray {

	@Test
	public void m1() {
		List<Integer> l = Arrays.asList(10,11,12,20,25, 26,27,28,29,30,10,11,12,13);

		ArrayList<Integer> highestSeq = new ArrayList<Integer>();

		ArrayList<Integer> tempSequence = new ArrayList<Integer>();

		tempSequence.add(l.get(0));

		for (int i = 1; i < l.size(); i++) {

			if (l.get(i - 1) + 1 == l.get(i)) {
				tempSequence.add(l.get(i-1));
			} else {
				tempSequence.add(l.get(i));
				if (tempSequence.size() > highestSeq.size()) {
					highestSeq.clear();
					highestSeq = new ArrayList<Integer>(tempSequence);
					tempSequence.clear();
					tempSequence.add(l.get(i));
				}
			}
		}
		System.out.println(highestSeq);
	}
}
