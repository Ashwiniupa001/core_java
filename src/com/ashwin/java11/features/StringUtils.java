package com.ashwin.java11.features;

import java.util.stream.Collectors;

public class StringUtils {

	public static void main(String[] args) {

		String str = " ashiwni ";
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());

		System.out.println(str.lines().collect(Collectors.toList()));
		
		System.out.println(str.repeat(2).lines().collect(Collectors.toList()));
	}

}
