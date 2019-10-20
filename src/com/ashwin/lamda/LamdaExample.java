package com.ashwin.lamda;

import java.io.IOException;

/**
 * @author Ashwini Upadhyay
 * @date Oct 20, 20194:39:43 PM
 * @version 1.0
 * @since 1.0
 */
interface Operation {
	int divide(int a, int b);
}

public class LamdaExample {

	public static void main(String[] args) throws IOException {

		var str = "10.6";
		System.out.println(Double.parseDouble(str));
		Operation devide = (var x, var y) -> x / y;
		Operation multiply = (int x, int y) -> x * y;
		System.out.println(devide.divide(10, 5));
		System.out.println(multiply.divide(106, 5));

		
	}
}
