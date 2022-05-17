package ai.jobiak.contact;

public class Contact2 {  //contact is a class type
	
	//private cannot be accessed
	private String company;
	private int contactId;
	private String name;
	private long mobileNo;
	private String email;
	
	//providing public set,get methods
	//using public(set get methods) we can access the data (directly we cannot access the data)
	//set/get methods are known as mutators or accessor methods
	//to initialize data members we use set/get methods
	//set is like insert and update for a one specific attribute(if set is not there we cannot modify)
	//get is like fetching or retriving or reading one attribute(of get is not there we cannot read the data)
	
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
	
	
	
	
	
	
	

}
