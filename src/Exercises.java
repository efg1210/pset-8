import java.util.*;

public class Exercises {

    
    public static void main(String[] args) {
        Exercises a = new Exercises();
                
        a.everywhere(new int[] {1, 2, 3, 2, 5, 2, 7, 2, 9}, 2);
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
	
//	public int largestNumber(int[] numbers) {
//        int largest = -1;
//        int counter = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            int oldCounter = counter;
//            for (int value : numbers) {
//                if (numbers[i] > value) {
//                    counter++;
//                }
//            }
//            if (oldCounter < counter) {
//                largest = numbers[i];
//                oldCounter = counter;
//            }
//        }
//        
//        return largest;
//    }
//	
//	public int smallestNumber(int[] numbers) {
//        int smallest = -1;
//        int counter = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            int oldCounter = counter;
//            for (int value : numbers) {
//                if (numbers[i] < value) {
//                    counter++;
//                    System.out.println("numbers[i]: " + numbers[i]);
//                    System.out.println("value: " + value);
//                    System.out.println("counter: " + counter);
//                    System.out.println();
//                }
//            }
//            
//            if (oldCounter < counter) {
//                smallest = numbers[i];
//                oldCounter = counter;
//            }
//        }
//        
//        return smallest;
//    }
	
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
		// write your code here
	    if (values == null || values.length < 3 || values.length % 2 == 0) {
            return new String[0];
        }
		
	    String first = values[((values.length - 1) / 2) - 1];
	    String middle = values[((values.length - 1) / 2)];
	    String last = values[((values.length - 1) / 2) + 1];
	    
		return new String[] {first, middle, last};	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
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
		
		int counter = 0;
		for (int value : numbers) {
		    if (value == x) {
		        counter++;
		    }
		}
		if (counter == numbers.length) {
		    return true;
		}
		
		counter = 0;
		for (int i = 1; i < (numbers.length - 1); i++) {
		    if (numbers[i] != x) {
		        if (numbers[i - 1] == x && numbers[i + 1] == x) {
		            counter++;
		        }
		    }
		}
		if (counter == (numbers.length / 2)) {
		    return true;
		}
		
//		counter = 0;
//		int counterGoal = ((2 * (numbers.length / 3)) - 2);
//		
//		for (int i = 1; i < (numbers.length - 1); i++) {
//		    if (numbers[i] != x) {
//		        if (numbers[i - 1] == x || numbers[i + 1] == x) {
//                    counter++;
//                }
//		    }
//		}
//		if (counter == counterGoal && numbers[1] == x) {
//            return true;
//        }
		
		/*
		 * there are a number sets of 3
		 * counter go up twice for each set of three
		 * then minus 1
		 * 
		 * so math:
		 * divide length by 3
		 * multiply by (2/3) to get 2/3s of that
		 * -2
		 * that is what counter should equal
		 */
		
//		System.out.println("counter: " + counter);
//		System.out.println("counterGoal: " + counterGoal);
//		System.out.println("counter == (numbers.length / 3): " + (counter == (numbers.length / 3)));
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
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
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
