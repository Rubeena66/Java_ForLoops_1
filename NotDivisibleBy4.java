package com.Loops;

public class NotDivisibleBy4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 4 != 0) {
				System.out.print(i+" ");
			}
		}
	}
}