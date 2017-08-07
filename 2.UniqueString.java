import java.util.Scanner;

/* Determine if a string is unique
 find out what to user: ASCII(128) or Extended Ascii(256) or Unicode
 In Python:
 def unique(x):
 	return len(x)==len(set(x))
 
 */

/* 
Time complexity: O(n) (where n is the length of a string )
Space Complexity: O(1)

*/
public class Unique {
	public boolean isUnique(String x){
		if(x.length()>128){  //if string is more than 128 characters, it's not unique
			System.out.println("False");
			return false;
		}
		boolean[] char_set=new boolean[128];
		for(int i=0; i<x.length(); i++){
			int value=x.charAt(i);
			if(char_set[value]){
				System.out.println("False");
				return false;
			}
			char_set[value]=true;
		}
		System.out.println("True");
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String x = in.next();
		Unique unique = new Unique();
		unique.isUnique(x);
	}

}
