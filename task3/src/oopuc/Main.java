package oopuc;

import java.util.Scanner;

import oopuc.contact.Contact;
import oopuc.contact.ContactManager;
import oopuc.contact.ContactService;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Adiniz:");
		String name1 = sc.next();
		System.out.println("Soyadiniz:");
		String surname1 = sc.next();
		System.out.println("Nomreniz:");
		String number1 = sc.next();
		ContactService cs  = new ContactManager();
//	    cs.Add("Yeni kontakt elave olundu: \n" + name1 + "\n" + surname1 + "\n" + number1);
    cs.GetAll("Butun kontakt \n1)" + name1 + "\n" + surname1 + "\n" + number1);
    
    Contact c = new Contact("Huseyn\n", "Sherifzade\n" , "0503130250\n");
    System.out.println(c.getName());
    System.out.println(c.getSurname());
    System.out.println(c.getNumber());
   
	}
}
