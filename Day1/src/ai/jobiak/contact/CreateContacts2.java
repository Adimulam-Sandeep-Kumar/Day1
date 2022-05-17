package ai.jobiak.contact;

//responsibility of this class is to create contacts

public class CreateContacts2 {

	public static void main(String[] args) {
		
		//instantiate Contact class
		Contact2 c1 = new Contact2();   // new is a keyword for creating objects (memory is allocated on heap)objects exists in real world not classess, c1 is the reference variable means object reference
		
		//prints the default values if we use here
		System.out.println("Company Name: " + c1.getCompany());
		System.out.println("ContactId: " +c1.getContactId());
		System.out.println("Name: " +c1.getName());
		System.out.println("Mobile Number: " +c1.getMobileNo());
		System.out.println("Email: " +c1.getEmail());
		
		//initializing data members
		c1.setCompany("Jobiak Software LTD");
		c1.setContactId(123);
		c1.setName("Sandeep Kumar");
		c1.setMobileNo(8247062293L);
		c1.setEmail("sandeepkumaradimulam@gmail.com");
		
		System.out.println("");
		
		//reading or accessing data members
		System.out.println("Company Name: " + c1.getCompany());
		System.out.println("ContactId: " +c1.getContactId());
		System.out.println("Name: " +c1.getName());
		System.out.println("Mobile Number: " +c1.getMobileNo());
		System.out.println("Email: " +c1.getEmail());
		
	}

}
