import java.util.*;

public class Exercises {

    
    public static void main(String[] args) {
        Exercises a = new Exercises();
                
        a.difference(new int[] {1, 2, 3});
    }
    
    /*
     * In pset-8:
     ./grademe.sh endsMeet
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
	    
        if (values == null || values.length < number || number < 0) {
            return new String[0];
        }
        
        String[] newArray = new String[number*2];
        String[] firstArray = Arrays.copyOfRange(values, 0, number);
        String[] secondArray = Arrays.copyOfRange(reverseArray(values), 0, number);
                
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        
        return newArray;
	}
	
	public String [] reverseArray(String values[]) {
	    for (int i = 0; i < (values.length / 2); i++) {
	        String temp = values[i];
	        values[i] = values[values.length - 1];
	        values[values.length - 1] = temp;
	    }
	    return values;
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
                    System.out.println("numbers[i]: " + numbers[i]);
                    System.out.println("value: " + value);
                    System.out.println("counter: " + counter);
                    System.out.println();
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
        if (numbers == null || numbers.length < 1) {
            return -1;
        }
        
        Arrays.sort(numbers);
        
        return (numbers[numbers.length - 1] - numbers[0]);
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
