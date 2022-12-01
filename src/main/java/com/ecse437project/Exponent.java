package com.ecse437project;

public class Exponent implements Operation{
	public static int apply(int x, int y) {
		return (int) Math.pow(x,y);
	}
}
