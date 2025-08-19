package ass;

public class Address {
	String houseName;
	int residentialNo;
	Student student;
	
	void landDetails(String houseName, int residentialNo,Student student) {
		this.houseName=houseName;
		this.residentialNo=residentialNo;
		this.student=student;
System.out.println("House Name: "+houseName+"\n"+"Residential Number: "+residentialNo+"\n"+"Student Reference: "+student.name+"\n"+"Roll noooo"+student.rollNo);

	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob = new Student("Mansa",932);
		System.out.println();
		Address ad = new Address();
		ad.landDetails("Kadapanayil Tharavadu", 53, ob);

	}

}
