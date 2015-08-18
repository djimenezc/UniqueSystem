package com.unique.file.txt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.unique.model.PersonTo;

public class TxtPersistenceTest {

	@Test
	public void saveObjectInTxt() {

		PersonTo person = new PersonTo();

		// Set the properties using the setter methods
		// Note: This can also be done with a constructor.
		// Since we want to show that XStream can serialize
		// even without a constructor, this approach is used.
		person.setNumber(1);

		// Serialize the object

		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(
					new FileOutputStream("/tmp/sample.txt"));

			oos.writeObject(person);
			oos.writeInt(10);
			oos.writeObject(new Integer(5));
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Save ok");
	}

	@Test
	public void readObjectFromTxt() {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"/tmp/sample.txt"));
			System.out.println("object: " + ois.readObject());
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
