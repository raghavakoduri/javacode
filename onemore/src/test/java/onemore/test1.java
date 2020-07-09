package onemore;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i = 0;
		int counter = 1;
		
		for (int j = 0; j<20; j++)
		{
			if (i < 11)
			{
				String stringspace = String.format("%" + counter + "s", " ");
				System.out.println(stringspace + i);
				counter++;
				i++;
				
			}
			if (i>=11 && i<=20)
			{
				String stringspace = String.format("%" + counter + "s", " ");
				System.out.println(stringspace + i);
				counter--;
				i++;
			}
		}

	}*/
		
  boolean isEndofString(String str1, String str2, int m, int n)
  {
	  int j = 0;
	  
	  for(int i = 0; i<n && j<m; i++)
	  {
		  if (str1.charAt(j) == str2.charAt(i))
			  j++;
	  
	  return (j==m);
     }
	  
  }
  
  int main() 
  {
	  String str1 = "ABC";
	  String str2 = "Ican'tsingmyABC";
	  
	  int m = str1.length();
	  int n = str2.length();
	  boolean finalresult = isEndofString(str1, str2, m, n);
	  
	  if(finalresult)
		  System.out.println("True");
	  else
		  System.out.println("False");
	  
  }

}
