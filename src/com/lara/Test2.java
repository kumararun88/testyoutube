package com.lara;

public class Test2 {
	
	public static void main(String[] args) {
		
	
	
				String checkPalindromeStrng = "121";

				int length = checkPalindromeStrng.length();
				int i, start, end, middle;

				start = 0;
				end = length - 1;
				middle = (start + end) / 2;

				for (i = start; i <= middle; i++) {
					if (checkPalindromeStrng.charAt(start) == checkPalindromeStrng
							.charAt(end)) {
						start++;
						end--;
					} else {
						break;
					}
				}
				if (i == middle + 1) {
					System.out.println(checkPalindromeStrng +" is n Palindrome.");
				} else {
					System.out.println(checkPalindromeStrng + "is not a palindrome");
				}
			}
			
	}



