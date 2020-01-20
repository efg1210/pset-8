import java.util.*;

public class Exercises {

    
    public static void main(String[] args) {
        Exercises a = new Exercises();
                
        a.clumps(new String[] {"abc", "1", "2", "3", "abc", "7", "7", "7", "abc", "1", "2", "3", "abc"});
    }
    
    /*
     * In pset-8/tests/:
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
        String[] secondArray = Arrays.copyOfRange(values, (values.length - number), values.length);
        
        //String[] newArray = Arrays.copyOf(firstArray, firstArray.length);
        
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
	
	public int difference(int[] numbers) {        
        if (numbers == null || numbers.length < 1) {
            return -1;
        }
        
        Arrays.sort(numbers);
        
        return (numbers[numbers.length - 1] - numbers[0]);
	}
	
	public double biggest(double[] numbers) {
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
		    return -1;
		}
		
		for (double value : numbers) {
		    if (value < 0) {
		        return -1;
		    }
		}
		
		double first = numbers[0];
		double middle = numbers[(numbers.length -1) / 2];
		double last = numbers[numbers.length - 1];
		
		if (first > middle || first == middle) {
		    if (first > last || first == last) {
		        return first;
		    }
		}
		
		if (middle > first || middle == first) {
		    if (middle > last || middle == last) {
		        return middle;
		    }
		}
		
		if (last > first || last == first) {
		    if (last > middle || last == middle) {
		        return last;
		    }
		}
	    		
		return -1;
	}
	
	public String[] middle(String[] values) {
	    if (values == null || values.length < 3 || values.length % 2 == 0) {
            return new String[0];
        }
		
	    String first = values[((values.length - 1) / 2) - 1];
	    String middle = values[((values.length - 1) / 2)];
	    String last = values[((values.length - 1) / 2) + 1];
	    
		return new String[] {first, middle, last};	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
	    if (numbers == null || numbers.length < 3) {
	        return false;
	    }
	    
	    for (int i = 1; i < numbers.length - 1; i++) {
	        if ((numbers[i - 1] == (numbers[i] - 1)) && (numbers[i] == (numbers[i + 1] - 1))) {
	            return true;
	        }
	    }
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) {
		    return false;
		}
		
		//checks if everything is x
		int counter = 0;
		for (int value : numbers) {
		    if (value == x) {
		        counter++;
		    }
		}
		if (counter == numbers.length) {
		    return true;
		}
		
		//checks if every other is x
		counter = 0;
		for (int i = 0; i < 2; i++) {
		    for (int j = i; j < numbers.length; j += 2) {
    		    if (numbers[j] == x) {
    		        counter++;
    		    }
		    }
		    if (numbers.length % 2 == 1 && numbers[0] == x && numbers[numbers.length - 1] == x) {
		        if (counter == ((numbers.length + 1) / 2)) {
	                return true;
	            }
		    } else {
		        if (counter == numbers.length / 2) {
	                return true;
	            }
		    }
		}
				
		//checks if every third is x
		counter = 0;
        for (int i = 0; i < 3; i++) {
            counter = 0;
            for (int j = i; j < numbers.length; j += 3) {
                if (numbers[j] == x) {
                    counter++;
                }
            }
            if (counter == numbers.length / 3) {
                return true;
            }
        }
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
	    if (numbers == null || numbers.length < 3) {
            return false;
        }
        
        for (int i = 1; i < numbers.length - 1; i++) {
            if ((numbers[i - 1] % 2 == 0) && (numbers[i] % 2 == 0) && (numbers[i + 1] % 2 == 0)) {
                return true;
            }
            if ((numbers[i - 1] % 2 == 1) && (numbers[i] % 2 == 1) && (numbers[i + 1] % 2 == 1)) {
                return true;
            }
        }
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
	    if (numbers == null || numbers.length < 2) {
	        return false;
	    }
	    
	    for (int i = 0; i < numbers.length; i++) {
	        int right = 0;
            int left = 0;
	        for (int j = 0; j < numbers.length; j++) {
	            if (j < i) {
	                right += numbers[j];
	            } else {
	                left += numbers[j];
	            }
	        }
	        if (right == left) {
	            return true;
	        }
	    }
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
	    if (values == null) {
	        return -1;
	    }
	    for (String s : values) {
	        if (s == null) {
	            return -1;
	        }
	    }
	    
	    int clumps = 0;
        String lastValue = "";
        int index = 0;
	    
	    for (int i = 0; i < values.length; i++) {
	        if (lastValue == values[i]) {
	            if (index + 1 == i) {
	                clumps++;
	            }
	        } else {
	            lastValue = values[i];
	            index = i;
	        }
	    }
		
		return clumps;		// default return value to ensure compilation
	}
}
