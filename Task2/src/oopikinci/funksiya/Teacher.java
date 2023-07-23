package oopikinci.funksiya;

public class Teacher extends Person{
	public int salary;
	public int number;
	public Teacher(String name, String surname, String address, int salary, int number) {
		super(name, surname, address);
		this.salary = salary;
		this.number = number;
	}
	@Override
	public void ShowInfos() {
			super.ShowInfos();
		   System.out.println("That`s the salary :" + salary);
		   System.out.println("That`s the number :" + number);
	
	}
   
	
	
	
	
	
	
}
