package com.capg.java.exercise;

public class StirngExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("hello"),name2 = sb.append("hello");
		if(sb.equals(name2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}

}
