package main;
import cabinet.*;
import things.*;

public class ShelfProject {

	public static void main(String[] args) {
		Cabinet c = new Cabinet();
		c.put("topShelf", new Book("Programming in Java for beginners"));
		c.put("middleShelf", new Phone("iPhone"));
		c.put("bottomShelf", new Plant("Rose"));
		
		Thing object = c.whatIsOn("topShelf");
		System.out.println(object.getName());
		object = c.whatIsOn("middleShelf");
		System.out.println(object.getName());
		object = c.whatIsOn("bottomShelf");
		System.out.println(object.getName());
	}
}
