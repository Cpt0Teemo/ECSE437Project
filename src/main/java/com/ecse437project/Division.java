package com.ecse437project;

public class Division implements Operation{
	public static int apply(int x, int y) {
		if (y == 0)
			throw new IllegalStateException("Can not divide by 0");
		else{
			return x / y;
		}
	}
}
