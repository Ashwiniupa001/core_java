package com.ashwin.lamda;

import java.util.stream.Collectors;

/**
 * @author Ashwini Upadhyay
 * @date Oct 20, 20194:39:43 PM
 * @version 1.0
 * @since 1.0
 */

interface Drawable {

	void draw();

}

public class LamdaExample {

	public static void main(String[] args) {

		Drawable d = () -> {
			System.out.println(" Ashwini Upadhyay ".lines().collect(Collectors.toList()));
		};
		d.draw();

	}
}
