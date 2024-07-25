package StringPrograms;

//Imagine you have a string of characters that represents a series of asteroids flying through space. Some of these asteroids are normal (represented by lowercase letters), while others are destructive (represented by asterisks '*'). When a destructive asteroid is encountered, it causes an explosion that destroys itself and the asteroid immediately before it.
//
//Input:
//
//A single string s containing lowercase letters (normal asteroids) and asterisks ('*') (destructive asteroids).
//
//Output:
//
//A single string representing the surviving asteroids after all collisions have been resolved and the string has been reversed.

public class AsteroidProgram {
	
	public static void main(String[] args) {
		
		String s  = "unnbee*rrrr**yz*";
		String ans = "";
		for( int i = s.length()-1 ; i >= 0 ; i-- ) 
		{
			int count = 0 ;
			while( i >= 0 ) 
			{
				if(s.charAt(i) == '*') 
				{
					count++;
					i--;
				}
				else 
				{
					break ;
				}
			}
			
			i = i-count;
			
			ans+=s.charAt(i);
		}
		
		System.out.println(reverseStr(ans));
				
	}
	
	
	public static String reverseStr(String s) {
		String ans="";
		for (int i = s.length()-1 ; i>=0 ; i--) {
			ans+=s.charAt(i);
		}
		return ans;
	}

}
