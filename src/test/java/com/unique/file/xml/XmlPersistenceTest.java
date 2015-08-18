package com.unique.file.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.unique.model.PersonTo;

public class XmlPersistenceTest {

	@Test
	public void saveObjectInXml() {

		PersonTo person = new PersonTo();
		PersonTo person2 = new PersonTo();
		
		person.setNumber(1);
		person2.setNumber(2);

		List<PersonTo> elements = new ArrayList<PersonTo>();
		
		elements.add(person);
		elements.add(person2);
		
		// Serialize the object
		XStream xs = new XStream();

		// Write to a file in the file system
		try {
			FileOutputStream fs = new FileOutputStream("/tmp/PersonTodata.txt");
			xs.toXML(elements, fs);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		System.out.println("Save ok");
	}

	@Test
	public void readObjectFromXml() {

		XStream xs = new XStream(new DomDriver());
		
		List<PersonTo> elements = new ArrayList<PersonTo>();

		try {
			FileInputStream fis = new FileInputStream("/tmp/PersonTodata.txt");
			xs.fromXML(fis, elements);

			// print the data from the object which has been read
			System.out.println(elements.toString());

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
