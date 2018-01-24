package apcs;

public class QuickSort {
	/**
	 * Lars Vogel (c) 2009, 2016 vogella GmbH. “Quicksort in Java - Tutorial.” Vogella.com,
	 *  		www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html.
	 */
	private int[] numbers;
    private int number;

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    
    //median method:
    private double findMedian() {
    	sort(this.numbers);
    	double median;
    	if (this.numbers.length % 2 == 0) {
    	    median = ((double)this.numbers[this.numbers.length/2] + (double)this.numbers[this.numbers.length/2 - 1])/2;
    	}
    	    else {
    	    median = (double) this.numbers[this.numbers.length/2];
    	    }
    	return median;
    	
    	
    }

}
