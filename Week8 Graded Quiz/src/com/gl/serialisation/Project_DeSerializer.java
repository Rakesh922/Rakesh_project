package com.gl.serialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Project_DeSerializer {
	static Employee e;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//try {

		FileInputStream fis = new FileInputStream("E:\\Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
					
		Project obj = (Project)ois.readObject();
		obj.printData();

		//} catch (Exception expn) {
		//	System.out.println("Exception: " + expn);
		//}
	}
}