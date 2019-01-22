package org.test.datastructures.string;

public class Reverse {
	
	
	public static void main(String[] args) {
		String reversed = reverse("reversed");
		System.out.println(reversed);
	}

	private static String reverse(String string) {
		
		if (string.length() == 1) {
			return string;
		}
		
		String str = string.substring(0, 1);
		return reverse(string.substring(1)) + str;
	}

}
