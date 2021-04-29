import java.util.Scanner;
import java.util.ArrayList;
public class ContactDirectory{
	String firstName,lastName,address,city,state,email,phoneNo;
    int zip;
    Scanner scanner = new Scanner(System.in);
    ArrayList <String> contacts = new ArrayList <String>(); 
    AddressBook ad = new AddressBook();
    
    public void addContact() {
    	String m;
        System.out.println("Enter your first name:");
	    String firstName = scanner.nextLine();
	    ad.setFirstName(firstName);
	    System.out.println("Enter the last name :");
	    String lastName = scanner.nextLine();
	    ad.setLastName(lastName);
	    System.out.println("Enter the address :");
	    String address = scanner.nextLine();
	    ad.setAddress(address);
	    System.out.println("Enter the city :");
	    String city = scanner.nextLine();
	    ad.setCity(city);
	    System.out.println("Enter the state :");
	    String state = scanner.nextLine();
	    ad.setState(state);
	    System.out.println("Enter the email :");
	    String email = scanner.nextLine();
	    ad.setEmail(email);
	    System.out.println("Enter the mobile number :");
	    String phoneNo = scanner.next();
	    ad.setPhoneNo(phoneNo);
	    System.out.println("Enter the zip :");
	    int zip = scanner.nextInt();
	    ad.setZip(zip);
	    m = "First Name :- "+ad.getFirstName()+
	            	"Last name : - "+ad.getLastName()+
	            	"Address :- "+ad.getAddress()+
	            	"City :- "+ad.getCity()+
	            	"State :- "+ad.getCity()+
	            	"Email:- "+ad.getEmail()+
	            	"MobileNo. :- "+ad.getPhoneNo()+
	            	"Zip :- "+ad.getZip();
	    contacts.add(m);
	    System.out.println("contact added");
    }
    public void editContact() {
    	System.out.println("Enter First Name");
    	String fName = scanner.next();
		if (contacts.isEmpty()) {
			System.out.println("AddressBook is empty");
		}
		else if(ad.getFirstName().equalsIgnoreCase(fName)) {
	            addContact();
	            System.out.println("contact updated");
		}
		else {
				System.out.println("Name not found");
		}
	
    }
	public void show() {
		for(int i = 0 ; i<contacts.size();i++) {
			System.out.println(contacts.get(i));
		}
	}
}
        
