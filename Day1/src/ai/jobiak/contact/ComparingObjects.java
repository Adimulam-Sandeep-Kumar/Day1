package ai.jobiak.contact;

public class ComparingObjects {

	public static void main(String[] args) {
		
		Contact2 c1 = new Contact2();
		Contact2 c2 = new Contact2();
		
		//returns false because both objects are different
		boolean result=(c1==c2);
		System.out.println("Objects are diferent: "+result);
		
		result=(c1.hashCode()==c2.hashCode());
		System.out.println("Objects are diferent: "+result);
		
		
		//saying c2=c1(unique objects)so it returns true
		System.out.println(" ");
		c2=c1;
		boolean result1=(c1==c2);
		System.out.println("Objects are same: "+result1);
		
		result1=(c1.hashCode()==c2.hashCode());
		System.out.println("Objects are same: "+result1);
		
		
		//assigning the reference of c1 t c2
		System.out.println(" ");
		Contact2 c3=c1;
		
		boolean result2=(c1==c3);
		System.out.println("Assigned Objects are same: "+result2);
		
		result2=(c1.hashCode()==c2.hashCode());
		System.out.println("Assigned Objects are same: "+result2);
		
	}

}
