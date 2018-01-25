package vocab14;

import java.util.ArrayList;
import java.util.List;

public class Vocabulary_14 {
	
	static int[] a = new int[] {1,2,3};
	//combine arrays,delete the same num in both arrays.
	public static int[] Union(int[]a1, int[]a2) {
        int[] resultArray={};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        if(a1.length>a2.length){
            resultArray=new int[a1.length];
        }
        else {
        	resultArray=new int[a2.length];
        }

        for(int element : a1){
            arrayList.add(Integer.valueOf(element));

        }
        for(int element:a2){
            if( arrayList.contains(element) == false){
                arrayList.add(Integer.valueOf(element));
            }
        }
     
        resultArray =  arrayList.stream().mapToInt(i->i).toArray();
        for(int i =0; i <resultArray.length; i++) {
        	 System.out.print(resultArray[i]+" ");
        }
       
       return  resultArray;

    }
	
	//find the same num in both array.
	public static ArrayList<Integer> intersection(int[]a,int[]b) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i< a.length; i++) {
			
			for(int inneri =0; inneri<b.length;inneri++) {
				if(a[i]==b[inneri]) {
					arrayList.add(a[i]);
				}
			}
		}
		
		return arrayList;
	}
	
	//find the the num that two arrays does not share
	public static ArrayList<Integer> Set_Difference(int[]a,int[]b) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i< a.length; i++) {
			
			for(int inneri =0; inneri<b.length;inneri++) {
				if(a[i]!=b[inneri]) {
					arrayList.add(a[i]);
				}
			}
		}
		
		return arrayList;
	}
	
	
	static int inf;
	//if we have an indeterminate form 0/0 or  all we need to do is differentiate the numerator 
	//and differentiate the denominator and then take the limit.
	public static void lhopitals_rule(int fx, int gx, int L){
		
		int limgx;
		if(limit(fx) == 0 && limit(gx) ==0 && limit(fx/gx) == L) {
			System.out.println("limit(gx/fx) is also equal to " + L);
		}
		else {
			System.out.println("limit(gx/fx) does not equal to " +L);
		}
	}
	public static int limit(int a) {
		if(a < 1 && 0<a) {
			a =0;
		}
		else if(a>9999) {
		a = inf;}
		return a;
	}
	
	// finds the standard deviation of the sets of num in a array
	public static double Standard_Deviation(List<Double> numbers) {
		
		//find the sum of the numbers
		double sum = 0;
		for(double number:numbers) {
			sum = sum+number;
		}
		//find the average of the numbers
		double average = sum/numbers.size();
		//find the difference between each number
		List<Double> Differences = new ArrayList<Double>();
		for(double number:numbers) {
			double difference = number - average;
			Differences.add(difference);
		}
		//find the square of the differences
		List<Double>Squares = new ArrayList<Double>();
		for(double difference : Differences) {
			double square = difference * difference;
			Squares.add(square);
		}
		for(double number :Squares) {
			sum = sum+number;
		}
		double result = sum/ (numbers.size()-1);
		double sauqredresult = Math.sqrt(result);
		return sauqredresult;
	}
	
	//find the result of n^k
	public static int Binomial_Coefficient(int n, int k) {
		int result =0;
		if(k==0 ||k==n) {
			return 1;
		}
		else if (k<0||n<0||k>n) {
			return 0;
		}
		else {
			for(int i = 0; i< n; i++) {
				result = Binomial_Coefficient(n-1,k-1) + Binomial_Coefficient(n,k-1);
			}
			return result;
		}
	}
	
	
	public static void main(String[]args) {
		
	}
}