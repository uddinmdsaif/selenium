package project;

public class greenBall {
	
	public static void main (String [] arga) {	
		
		String[] ball = {"Red", "Blue", "Yellow"};
		
		System.out.println(findGreenBallInThis(ball));
			
	}
	
	 public static boolean findGreenBallInThis (String[] balls) {
		 
		 boolean result = false;
		 
		 for(int i = 0; i<balls.length; i++)
		 {
			 if(balls[i] == "Green")
			 {
				 result = true;
			 }
		 }
		 
		 return result;
		 
	 } 
		 



}

