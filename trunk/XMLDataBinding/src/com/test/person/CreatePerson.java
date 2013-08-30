package com.test.person;

import org.exolab.castor.xml.*;
import java.io.FileWriter;

public class CreatePerson {
	public static void main(String args[]) {

		try {
			// -- create a person to work with
			Person person = new Person("Bob Harris", "123 Foo Street", "222-222-2222",
									   "bob@harris.org", "(123) 123-1234", "(123) 123-1234");

			// -- marshal the person object out as a <person>
			FileWriter file = new FileWriter("bob_person.xml");
			Marshaller.marshal(person, file);
			file.close();
		} catch (Exception e) {
			System.out.println( e );
		}
	}
}