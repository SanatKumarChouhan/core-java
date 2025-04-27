package com.rays.string;

public class CountOccurrenceOfArray {
	public static void main(String[] args) {
		String[] names = { "abc", "abca" };

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (String s : names) {
				s = s.toLowerCase();
				for (int i = 0; i < s.length(); i++) {
					if (ch == s.charAt(i)) {
						count++;
					}
				}
			}

			if (count != 0) {
				System.out.println(ch + ": " + count);
			}
		}
	}
}
