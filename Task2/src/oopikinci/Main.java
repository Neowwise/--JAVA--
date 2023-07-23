package oopikinci;

import oopikinci.funksiya.Student;
import oopikinci.funksiya.Teacher;


public class Main {

	public static void main(String[] args) {
		
		 System.out.println("English Student>>> ");
		 Student s = new Student("Lisa" , "Manoban" , "first " , "2201N" , 100 , 20);
		 s.ShowInfos();
		 System.out.println("English Teacher>>> ");
       Teacher t = new Teacher("Jennie" , "Rubyjane" , "the second" , 7500 , 2);
           t.ShowInfos();
           
    
	}

}
