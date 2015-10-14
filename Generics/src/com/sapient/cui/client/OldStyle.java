package com.sapient.cui.client;

import java.util.ArrayList;
import java.util.Iterator;

public class OldStyle {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		Object str;
		// These lines store strings, but any type of object
		// can be stored. In old-style code, there is no
		// convenient way restrict the type of objects stored
		// in a collection
		try {
			list.add("one");

			list.add("two");
			list.add(3);
			list.add("four");

			Iterator itr = list.iterator();
			while (itr.hasNext()) {

				// To retrieve an element, an explicit type cast is needed
				// because the collection stores only Object.
				str = (Object) itr.next(); // explicit cast needed here.
					System.out.println(str + " is " + str.toString().length() + " chars long.");
				}
		}
		catch (ClassCastException e) {
			System.out.println("There is a Class Cast Exception");
			System.out.println("Program will terminate");
		}
}}