package stringexample;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder name=new StringBuilder("Java");
		System.out.println(name);

	//Method 1 - append()
		
	name.append(" programming");
	System.out.println(name);
	
	//method 2  insert()
	
	name.insert(16, " Language");	
	System.out.println(name);
	
	//method 3  replace()
	
		name.replace(5, 16, "program");
		System.out.println(name);
		System.out.println("--------------------------------------------");
		
		
		//method 4  delete()
		
			name.delete(12, 21);
			System.out.println(name);
			
			//method 5  capacity()
			StringBuilder name1=new StringBuilder("");
			StringBuilder check=new StringBuilder("red");


			System.out.println(name1.capacity());
System.out.println(name.capacity());
System.out.println(name.length());

System.out.println(check.length());
System.out.println(check.capacity());

//method 7  charAt()

System.out.println(check.charAt(2));
//method 8  subString()

System.out.println(name.substring(5));
System.out.println(name.substring(5,8));

//method 9  subString()

System.out.println(check.reverse());









	}

}
