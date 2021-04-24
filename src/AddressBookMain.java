import java.util.Scanner;
public class AddressBookMain {
	public static void main(String args[]) {
		AddressBook ad = new AddressBook();
		Scanner sc = new Scanner(System.in);
		
		//first name
		System.out.println("Enter first name");
		String firstName = sc.nextLine();
		ad.setFirstName(firstName);
		
		//Last Name
		System.out.println("Enter Last  name");
		String lastName = sc.nextLine();
		ad.setLastName(lastName);
		
		//Address
		System.out.println("Enter address");
		String address = sc.nextLine();
		ad.setAddress(address);
		
		//City
		System.out.println("Enter City");
		String city = sc.nextLine();
		ad.setCity(city);
		
		//State
		System.out.println("Enter state");
		String state = sc.nextLine();
		ad.setState(state);
		
		//Phone no.
		System.out.println("Enter phone number");
		String phoneNo = sc.nextLine();
		ad.setPhoneNo(phoneNo);
		
		//Email
		System.out.println("Enter email");
		String email = sc.nextLine();
		ad.setEmail(email);
		
		//Zip
		System.out.println("Enter Zip");
		int zip = sc.nextInt();
		ad.setZip(zip);
		
		System.out.println("First Name : " +ad.getFirstName());
		System.out.println("Last Name : " +ad.getLastName());
		System.out.println("Address : " +ad.getAddress());
		System.out.println("City : " +ad.getCity());
		System.out.println("State : " +ad.getState());
		System.out.println("Phone no. : " +ad.getPhoneNo());
		System.out.println("Email : " +ad.getEmail());
		System.out.println("Zip : " +ad.getZip());
		
		
		
		
		
		
		
		
	}
	

}
