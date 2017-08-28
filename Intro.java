
public class Intro {
	
	public static void main(String[] args){
		
	}
	

	public int ret(){
		
		return 17;
	}
	
	/**
	 * computes logic "and" of the parameters together
	 * @param a one of be boolean in the situation
	 * @param b	one of be boolean in the situation
	 * @param c	one of be boolean in the situation
	 * @return situation "a and b and c"
	 */
	
	public boolean logic(boolean a,boolean b, boolean c){
		
		return (a & b & c);
	}
	
	/**
	 * use a double loop to print the String that is a multiline triangle 
	 * @param n
	 * @return String s that is a multiline triangle based on the input int n. 
	 */
	
	public  String stars(int n){
		String s = "";
		// for int i =1, when i is less that n, i +1 until it is less than or equal to n
		for (int i = 1; i<= n; i ++){
			
			for (int j = 1; j <= i; j++ ){
				//for int j = 1, when j is less than i, j+1 until j is less than or equal to n.
				//add a "*" to String s every time until j is less than or equal to i
				s += "*";
			}
			// starts a new line every time the inner for loop runs.
			s += "\n";
		}
		
		return s;
			
	}
	
	
	/**
	 * computes the minimum number of 2 and 5 in a the input n.
	 * @param n is the integer to be exchanged
	 * @return n/5 if remainder 5 is equal to 0; return (n/5) + (remainder 5/2) if remainder 2 is equal to 0;
	 * return -1 if remainder 2 is not 0.
	 */
	public int coins(int n){
		// find the remainder when n / 5
		int remainder5 = n%5;
		// find the remainder of the remainder of n/5 divided by 2
		int remainder2 = (n%5) % 2;
		
		int totalNumofCoins = 0;
		
		if (remainder5 == 0){
			//numbers of 5 in n
			totalNumofCoins = n / 5;
		}
		else if (remainder2 == 0){
			//numbers of 5 and 2 in n
			totalNumofCoins = (n/5) + (remainder5 / 2);
		}
		else if (remainder2 != 0){
			totalNumofCoins = -1;
		}
		
		return totalNumofCoins;
	}

}
