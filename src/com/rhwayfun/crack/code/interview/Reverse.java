package com.rhwayfun.crack.code.interview;

public class Reverse {

	public String reverseString(String iniString) {
        String s = "";
        for (int i = iniString.length() - 1; i > -1; i--) {
			s += String.valueOf(iniString.charAt(i));
		}
        return s;
    }
}
