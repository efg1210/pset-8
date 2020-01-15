import java.util.Arrays;

public class Exercises {

    
    /*
     * In pset-8:
     ./grademe.sh commonEnd
     * */
	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
				
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
		    return true;
		}
		
		return false;
	}
	
	public String[] endsMeet(String[] values, int number) {
	    String[] newArray = new String[number];
        if (values == null || values.length < number || number < 0) {
            return newArray;
        }
        newArray = Arrays.copyOf(values, number);
        return newArray;
	}
	
	public int largestNumber(int[] numbers) {
        int largest = -1;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            int oldCounter = counter;
            for (int value : numbers) {
                if (numbers[i] > value) {
                    counter++;
                }
            }
            if (oldCounter < counter) {
                largest = numbers[i];
                oldCounter = counter;
            }
        }
        
        return largest;
    }
	
	public int smallestNumber(int[] numbers) {
        int smallest = -1;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            int oldCounter = counter;
            for (int value : numbers) {
                if (numbers[i] < value) {
                    counter++;
                }
            }
            if (oldCounter < counter) {
                smallest = numbers[i];
                oldCounter = counter;
            }
        }
        
        return smallest;
    }
	
	public int difference(int[] numbers) {
	    int difference = -1;
        
        if (numbers == null || numbers.length < 1) {
            return difference;
        }
        
        int smallest = smallestNumber(numbers);
        int largest = largestNumber(numbers);
        
        return (largest - smallest);		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
