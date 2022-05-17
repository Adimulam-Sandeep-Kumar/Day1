package ai.jobiak.contact;

//responsibility of this class is to create contacts

public class CreateContacts {

	public static void main(String[] args) {
		
		//instantiate Contact class
		Contact c1 = new Contact();   // new is a keyword for creating objects (memory is allocated on heap)objects exists in real world not classess, c1 is the reference variable means object reference
		
		//prints the default values if we use here
		System.out.println("Company Name: " + c1.company);
		System.out.println("ContactId: " +c1.contactId);
		System.out.println("Name: " +c1.name);
		System.out.println("Mobile Number: " +c1.mobileNo);
		System.out.println("Email: " +c1.email);
		
		//initializing data members
		c1.company = "Jobiak Software LTD";
		c1.contactId = 123;
		c1.name = "Sandeep Kumar";
		c1.mobileNo = 8247062293L;
		c1.email = "sandeepkumaradimulam@gmail.com";
		
		System.out.println("");
		
		//reading or accessing data members
		System.out.println("Company Name: " + c1.company);
		System.out.println("ContactId: " +c1.contactId);
		System.out.println("Name: " +c1.name);
		System.out.println("Mobile Number: " +c1.mobileNo);
		System.out.println("Email: " +c1.email);
		
	}

}
