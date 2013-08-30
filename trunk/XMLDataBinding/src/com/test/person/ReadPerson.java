package com.test.person;

import org.exolab.castor.xml.*;
import java.io.FileReader;

public class ReadPerson {
	public static void main(String args[])  {

		try {
			Person person = (Person) Unmarshaller.unmarshal(Person.class,
															new FileReader("person.xml"));

			System.out.println("Person Attributes");
			System.out.println("-----------------");
			System.out.println("Name: " + person.getName() );
			System.out.println("Address: " + person.getAddress() );
			System.out.println("SSN: " + person.getSsn() );
			System.out.println("Email: " + person.getEmail() );
			System.out.println("Home Phone: " + person.getHomePhone() );
			System.out.println("Work Phone: " + person.getWorkPhone() );
		} catch (Exception e) {
			System.out.println( e );
		}
	}
}