package com.sample.shared;

public class HandleString {
	public String reverseEverything(String s){
		String result = new StringBuffer(s).reverse().toString();
		return result;
	}
}
