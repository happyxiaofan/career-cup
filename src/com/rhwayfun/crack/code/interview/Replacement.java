package com.rhwayfun.crack.code.interview;

public class Replacement {

	public String replaceSpace(String iniString, int length) {
		String[] iniString2 = iniString.split("");
		for (int i = 0; i < iniString2.length; i++) {
			if(iniString2[i].equals(" ")){
				iniString2[i] = "%20";
			}
		}
		String s = "";
		for (int i = 0; i < iniString2.length; i++) {
			s += iniString2[i]; 
		}
        return s;
    }
}
