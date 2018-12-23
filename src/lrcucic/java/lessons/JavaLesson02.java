package lrcucic.java.lessons;

import lrcucic.java.lessons.commons.HelloWorldInterface;

public class JavaLesson02 implements HelloWorldInterface {

	private static final String HELLO_WORLD = "Hello World mit Interface implementiert";
	
	@Override
	public void print() {
		System.out.println(HELLO_WORLD);		
	}

}
