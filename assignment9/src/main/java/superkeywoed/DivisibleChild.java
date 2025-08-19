package superkeywoed;

public class DivisibleChild extends Divisible{
	
	void divisibility() {
		
		super.addition(410, 910);
		int add= (this.total)%10;
	
		if(add==0) {
			System.out.println("yes, it's divisible by 10");
		}
		else {
			System.out.println("No, it's not divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleChild obj = new DivisibleChild();
		obj.divisibility();
	}

}
