package com.leetcode;

/**
 * Program to reverse the Integer no
 * 
 * @author sanket.khandekar
 *
 */
public class ReverseInteger {

	public static void main(String[] args) {

		ReverseInteger reverse = new ReverseInteger();
		System.out.println(reverse.reverseInteger(123));

	}

	private Integer reverseInteger(Integer number) {
		Integer reverseInteger = 0;
		while (number != 0) {
			reverseInteger = reverseInteger * 10 + number % 10;
			number /= 10;
			if (reverseInteger > Integer.MAX_VALUE || reverseInteger < Integer.MIN_VALUE) {
				return 0;
			}
		}

		return reverseInteger;
	}

}
