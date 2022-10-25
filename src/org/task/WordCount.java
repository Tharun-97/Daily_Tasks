package org.task;

public class WordCount {

	public static void main(String[] args) {
		String s1 = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
		String s2 = "fuzzy";

		String[] word = s1.toLowerCase().split(s2);

		System.out.println("The count of the word " + s2 + " is " + (word.length - 1));

	}

}
