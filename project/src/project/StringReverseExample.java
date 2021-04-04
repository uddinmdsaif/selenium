package project;

public class StringReverseExample{
	   public static void main(String[] args) {
	      String str = "1234";
	      
	      reverse(str);
	      
	    
	      /*
	       * String reverse = new StringBuffer(string).reverse().toString();
 		System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);
	      
	      */   
	      
	   }
	   
	   public static void reverse(String text) {
		   
		   for(int i = text.length()-1; i>=0; i--)
		   {
			   System.out.print(text.charAt(i));
		   }
		   
	   }
	   
	}




