package org.test.datastructures.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Permutatitions {

	public static void main(String[] args) {

		String test = "abcd";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(test.substring(0,1));
		
		List<String> permutations = findPermutation(list, test.substring(1));
		permutations.sort(String::compareTo);
		printAllPermutations(permutations);
	}

	private static List<String> findPermutation(List<String> list, String string) {
		
		if (string.length() == 0) {
			return list;
		}
		
		String chr = string.substring(0, 1);
		ArrayList<String> result = new ArrayList<>();
		
		for (String str : list) {
			List<String> subPerms = new ArrayList<>();
			subPerms.addAll(veawe(str, chr));
			result.addAll(findPermutation(subPerms, string.substring(1)));
		}
	
		return result;
	}

	private static Collection<? extends String> veawe(String str, String chr) {
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < str.length() + 1; i++) {
			String front = str.substring(0, i) + chr + str.substring(i);
			list.add(front);
		}
		
		return list;
	}

	private static void printAllPermutations(List<String> list) {
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
