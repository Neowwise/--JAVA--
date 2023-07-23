package oopikinci.funksiya;

public class Person {
	public String name;
	public String surname;
	public String address;
	
   public Person(String name , String surname , String address) {
	   this.name = name;
	   this.surname = surname;
	   this.address = address;
   }
   public void ShowInfos() {
	   System.out.println("That`s the name: " + name);
	   System.out.println("That`s the surname :" + surname);
	   System.out.println("That`s the address :" + address);
	   
   }
   
}
