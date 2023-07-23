package oopuc.contact;

public class ContactManager implements ContactService{

	@Override
	public void Add(String message1) {
		System.out.println("Mesaj: " + message1);
		
	}

	@Override
	public void GetAll(String message2) {
	    System.out.println("Mesaj: " + message2);
		
	}

}
