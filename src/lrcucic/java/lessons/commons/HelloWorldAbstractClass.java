package lrcucic.java.lessons.commons;

public abstract class HelloWorldAbstractClass implements HelloWorldInterface{

	private static final String HELLO_WORLD = "Hello World aus einer abstrakten Klasse geerbt";
	
	@Override
	public void print() {
		System.out.println(HELLO_WORLD);
	}
	
}
