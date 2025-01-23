package com.nt.main;

import com.nt.ston.Printer;

public class SingleTonClassTest {

	public static void main(String[] args) {
		Printer pr1 = Printer.getInstance();
		Printer pr2 = Printer.getInstance();
		pr1.print("Ok");
		pr2.print("Bye");
		System.out.println(pr1.hashCode()+" "+pr2.hashCode());
		System.out.println("Same or not? ::"+(pr1 == pr2));

	}

}
