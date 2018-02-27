package randp;

public class Randp {
	
	/*
	 * You may wish to add other methods.  What you cannot do is
create any other array, ArrayList, or other data structure.
You also cannot create any other fields.  You get nums and numsLeft
and that's it.
	 */
	
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
        //YOUR_CODE_HERE
    		this.numsLeft = n;
    		initNums(n);
    		
    }
	
    private void initNums(int n) {
       // YOUR_CODE_HERE
    		this.nums = new int[n];
    		for(int i = 0 ; i < this.nums.length; i++) {
    			this.nums[i] = i+1;
    		}
    		
    		
    }
	
    public int nextInt() {
        // Math.random() should never be called more than once
        // when this method is called.  Recursion is not allowed.
        //YOUR_CODE_HERE
    		
    		if(this.numsLeft == 0) {
    			return 0;
    		}
    		
    		int randIndex = (int)(this.numsLeft * Math.random());
    		this.numsLeft -=1;
    		int returnNum = nums[randIndex];
    		nums[randIndex] = nums[numsLeft];
    		return returnNum;

    		
    }
    
    public static void main(String[] args) {
    	int x;
    	Randp rand = new Randp(6);
    	x = rand.nextInt();
    	System.out.println(x);
    	x = rand.nextInt();	
    	System.out.println(x);
    	x = rand.nextInt();	
    	System.out.println(x);
    	x = rand.nextInt();	
    	System.out.println(x);
    	x = rand.nextInt();	
    	System.out.println(x);
    	x = rand.nextInt();
    	System.out.println(x);
    	x = rand.nextInt();
    	System.out.println(x);
    	x = rand.nextInt();	
    	System.out.println(x);
    	
    }

}
