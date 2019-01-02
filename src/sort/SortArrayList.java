package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("b");
		arrayList.add("a");
		arrayList.add("e");
		arrayList.add("c");
		arrayList.add("d");
		Collections.sort(arrayList);
		for (String string : arrayList) {
			System.out.println(string);
		}
	}
}
