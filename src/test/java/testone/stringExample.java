package testone;

public class stringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = new String("ABC");
		String two = "ABC";
		StringBuffer three = new StringBuffer("three");
	    StringBuffer four = new StringBuffer("three");
		//one = one + two;
		//System.out.println(one);
		if(three == four) 
		{
			System.out.println("This is inside ==");
		}
		if(three.toString().equals(four.toString()))
		{
			System.out.println("inside equals");
		}
		else
		{
			System.out.println("not equal");
		}
		
		 one = one + "DEF";
		System.out.println(one);
	}

}
