package ai.jobiak.contact;

public class Contact3 {  //contact is a class type
	
	//private cannot be accessed
	private String company;
	private int contactId;
	private String name;
	private long mobileNo;
	private String email;
	
	//how to make object method ready - by using constructors
	//before adding parameterized constructor we need to create default constructor
	
	public Contact3() {
		super();
		// TODO Auto-generated constructor stub
	}

	//this is a constructor
	public Contact3(String company, int contactId, String name, long mobileNo, String email) {
		super();
		this.company = company;
		this.contactId = contactId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	
	//these are setter and getter methods
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact3 [company=" + company + ", contactId=" + contactId + ", name=" + name + ", mobileNo=" + mobileNo
				+ ", email=" + email + "]";
	}	

}
