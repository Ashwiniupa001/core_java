package com.ashwin.java11.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class StringUtils {

	public static void main(String[] args) throws IOException {

		String str = " ashiwni ";
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());

		System.out.println(str.lines().collect(Collectors.toList()));
		
		System.out.println(str.repeat(2).lines().collect(Collectors.toList()));
		
		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
		System.out.println(path);
		String s = Files.readString(path);
		System.out.println(s);
	}

}
