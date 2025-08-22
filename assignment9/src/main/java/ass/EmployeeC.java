package ass;

public class EmployeeC {
	int serialNo;
	
	DepartmentP departmentP;
	
	void display(int serialNo,DepartmentP departmentP) {
		this.serialNo=serialNo;
		this.departmentP=departmentP;
		
System.out.println("Serial Number: "+serialNo+"\n"+
					"Project Details1: "+departmentP.emp1+"\n"+
					"Project Details2: "+departmentP.emp2+"\n"+
					"Project Details3: "+departmentP.emp3);
System.out.println("shapping from display");
departmentP.adminTeam("manu","pannu", "dunnu");
System.out.println("Ending from display");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentP ob= new DepartmentP();
		ob.adminTeam("Facosia","oliver","JohnDiggle");
		EmployeeC em = new EmployeeC();
		em.display(12131, ob);
	}

}
