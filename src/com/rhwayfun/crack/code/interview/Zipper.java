package com.rhwayfun.crack.code.interview;

public class Zipper {

	//aabcccccaaa==>a2b1c5a3
	public String zipString(String iniString) {
		String s2 = "";
		String tmp = "";
		for(tmp = iniString;tmp.length() > 0;){
			int index = 0;
			int i = 0;
			char c = tmp.charAt(index);
			for (i = index + 1; i < tmp.length(); i++) {
				if(c == tmp.charAt(i)){
					index++;
				}else{
					break;
				}
			}
			s2 = s2 + tmp.charAt(index) + String.valueOf(index + 1);
			tmp = tmp.substring(index + 1);
		}
		if(s2.length() >= iniString.length()){
			return iniString;
		}
		return s2;
    }
}
