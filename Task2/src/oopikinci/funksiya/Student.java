package oopikinci.funksiya;

public class Student extends Person{
	public String studentnumber;
	public int price;
	public int age;
	public Student(String name, String surname, String address, String studentnumber, int price, int age) {
		super(name, surname, address);
		this.studentnumber = studentnumber;
		this.price = price;
		this.age = age;
	}
	public void ShowInfos() {
		super.ShowInfos();
		   System.out.println("That`s the studentnumber :" + studentnumber);
		   System.out.println("That`s the price :" + price);
		   System.out.println("That`s the age :" + age);
		
	}
}
