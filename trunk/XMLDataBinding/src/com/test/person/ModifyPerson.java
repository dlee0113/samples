package com.test.person;

import org.exolab.castor.xml.*;
import java.io.FileWriter;
import java.io.FileReader;

public class ModifyPerson {
	public static void main(String args[]) {
		try {
			// -- read in the person
			Person person = (Person) Unmarshaller.unmarshal(Person.class, new FileReader("person.xml"));

			// -- change the name
			person.setName("David Beckham");

			// -- marshal the changed person back to disk
			FileWriter file = new FileWriter("updated_person.xml");
			Marshaller.marshal(person, file);
			file.close();
		} catch (Exception e) {
			System.out.println( e );
		}
	}
}