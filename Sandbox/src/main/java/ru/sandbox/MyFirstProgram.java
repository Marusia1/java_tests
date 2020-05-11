package ru.sandbox;

public class MyFirstProgram {
	public static void main (String[] args) {
		hello("Марина");
		hello("Алексей");
		hello("Мурад");
	}
	public static void hello (String somebody) {
		System.out.println("Hello " + somebody + "!");
	}

}