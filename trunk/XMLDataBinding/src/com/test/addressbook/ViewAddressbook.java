package com.test.addressbook;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.xml.Unmarshaller;

public class ViewAddressbook {
	public static void main(String args[]) {
		try {
		    // -- Load a mapping file
			Mapping mapping = new Mapping();
			mapping.loadMapping("mapping.xml");

			Unmarshaller un = new Unmarshaller(Addressbook.class);
			un.setMapping( mapping );

			// -- Read in the Addressbook using the mapping
			FileReader in = new FileReader("addressbook.xml");
			Addressbook book = (Addressbook) un.unmarshal(in);
			in.close();

			// -- Display the addressbook
			System.out.println( book.getName() );

			List persons = book.getPersons();
			Iterator iter = persons.iterator();

			while ( iter.hasNext() ) {
				Person person = (Person) iter.next();

				System.out.println("\n" + person.getName() );
				System.out.println("---------------------------------------");
				System.out.println("Address = " + person.getAddress() );
				System.out.println("SSN = " + person.getSsn() );
				System.out.println("Home Phone = " + person.getHomePhone() );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}