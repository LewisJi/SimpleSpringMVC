package com.lewis.controller;

public class TestMain {

	public static void main(String[] args) {
		
		int result = res(1,5);
		System.out.println(result);
		
	}
	
	private static int res(int begin, int level) {
		
		System.out.println("before begin : " + begin);
		if (level<0)
			return begin;
		
		begin+=begin;
		System.out.println("after begin : " + begin);
		return res(begin+1, level-1);
		
	}

}
