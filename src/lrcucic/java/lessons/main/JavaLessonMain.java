package lrcucic.java.lessons.main;

import lrcucic.java.lessons.JavaLesson01;
import lrcucic.java.lessons.JavaLesson02;
import lrcucic.java.lessons.JavaLesson03;

public class JavaLessonMain {
		
	public static void main(String[] argsg) {
		System.out.println("Hello world");
		
		JavaLesson01 lesson01 = new JavaLesson01();		

		JavaLesson02 lesson02 = new JavaLesson02();
		lesson02.print();

		JavaLesson03 lesson03 = new JavaLesson03();
		lesson03.print();
		lesson03.print("Test eigenes print() mit Parameter");
	}		
}
