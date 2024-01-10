package com.testing.junit;

import java.util.Scanner;

public class Calculator {
	static int res=0;
    public static int addNumbers(int n1, int n2) {
    	res = n1 + n2;
		return res;
    }
    
    public static int addAnyNumbers(int... numbers) {
		for(int n: numbers) {
			res += n;
		}
		return res;
	}
    
    public static int productNumbers(int n1, int n2) {
    	res = n1 * n2;
		return res;
    }
    
    public static void main(String[] args) {
		System.out.println(addNumbers(3, 5));
		System.out.println(productNumbers(13, 7));
		System.out.println(addAnyNumbers(2,3,4,5,6,7));
	}
}
