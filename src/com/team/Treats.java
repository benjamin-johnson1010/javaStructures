package com.team;
import java.io.*;
public class Treats {
public static void save(Treat[] treats){
	try(
			FileOutputStream fos = new FileOutputStream("treats.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
		oos.writeObject(treats);
	}
	catch(IOException ioe){
		System.out.println("Problem saving Treats");
		ioe.printStackTrace();
	}
}
public static Treat[] load(){
	Treat[] treats = new Treat[0];
	try(
			FileInputStream fis = new FileInputStream("treats.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
		treats = (Treat[]) ois.readObject();
	}
	catch(IOException ioe){
		System.out.println("Error reading file");
		ioe.printStackTrace();
	}
	catch(ClassNotFoundException cnfe){
		System.out.println("Error loading treats");
		cnfe.printStackTrace();
	}
	return treats;
}

}
