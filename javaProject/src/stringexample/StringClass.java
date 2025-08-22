package stringexample;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";	
		System.out.println(s);	
		System.out.println(s.length());				//method 1 length()	
//method 2 charAt()
		
		System.out.println(s.charAt(2));	
//method 3 valueOf()
		int a=10;
		String b= String.valueOf(a);
		System.out.println(b);

//method 4 equals()
		
		String s1="Java";
		System.out.println(s.equals(s1));
		
//method 5 equalsIgnoreCase
		
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println("next is empty");
		
//method 6 isEmpty()
		
		System.out.println(s.isEmpty());
		
//method 7 concat()
		
		String combine= s1.concat(" programming");
		
		System.out.println(combine);
//method 8 toUpperCase()
		System.out.println(s.toUpperCase());
//method 8 toLowerCase()

		System.out.println(s1.toLowerCase());

//method 9 contains()
		System.out.println(s1.contains("l"));
	}

}
