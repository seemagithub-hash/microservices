package com.sunhome.catalogms;

public class Test {

	public static int mymethod() {
		try {
			String s="/10.244.206.147:62943";
			System.out.print("bye111 "+s.substring(1,s.indexOf(":")));
			
		} catch (Exception e) {
			
			throw new NullPointerException();
			
			//return 1;
		}
		System.out.print("bye");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod();
	}
}
