package ai.jobiak.contact;

public class CreateStore {

	public static void main(String[] args) {
		
		StoreContacts store = new StoreContacts();
		
		Contact3 c1 = new Contact3("jobiak",123,"Sandeep Kumar",8237062293L,"sandeep@123.com");
		Contact3 c2 = new Contact3("Software",456,"Sandy",9247063393L,"sandy@123.com");
		Contact3 c3 = new Contact3("PVT LTD",789,"Kumar",6247063393L,"kumar@123.com");
		
		Contact3 contact3Array[] = new Contact3[3];
		contact3Array[0]=c1;
		contact3Array[1]=c2;
		contact3Array[2]=c3;
		
		//one type of getting output
		store.setContacts(contact3Array);
		System.out.println("Inside of contacts: "+store);
		
		//another type of getting output
		System.out.println(" ");
		Contact3 contacts[]=store.getContacts();
		
		for(Contact3 contact : contacts) {
			
			System.out.println("Inside of contacts: "+contact);
		}
		
	}
	
}
