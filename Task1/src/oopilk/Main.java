package oopilk;

import oopilk.inheritance.Computer;
import oopilk.inheritance.Phone;


public class Main {

	public static void main(String[] args) {
        Computer c = new Computer("lenovo" , 2000 , "32 gb dddr4" , "i5 13500k");
//        Phone p =new Phone("iphone" , 4000 , "gray" , "FreeDos" );
	
	System.out.println("That`s the ram:" + c.getRam());
	System.out.println("That`s the cpu: " + c.getCpu());
//	System.out.println("That`s the color:" + p.getColor());
//	System.out.println("That`s the system:" + p.getSystem());
	  System.out.println("That`s the name:" + c.getName());
  	  System.out.println("That`s the price:" + c.getName());
	}
}
