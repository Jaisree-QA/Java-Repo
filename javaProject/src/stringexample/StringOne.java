package stringexample;

public class StringOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java";	// by using string literal
		String s1="java";
		
		// by using new keyword
		String s2=new String("java");
		String s3=new String("java");
		
		System.out.println(s==s1);	//equals(==),object comparison
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		System.out.println(s.equals(s1));	//equals,method, value comparison


	}
	

}
