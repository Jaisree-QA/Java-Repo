package assignmentpolymorphism;

public class OffSeason extends OnSeason{
	
	void discount(){

		double discountamount=purchaseAmount*0.15;
		
		System.out.println("Discounted amount from OffSeason: "+discountamount);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OffSeason obj= new OffSeason();
		obj.purchase();
		obj.discount();
	/*	OnSeason ob =new OnSeason();
		ob.purchase();
		ob.discount();
		*/
	
	}

}
