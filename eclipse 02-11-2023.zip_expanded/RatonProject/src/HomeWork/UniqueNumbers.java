package HomeWork;

public class UniqueNumbers {

	public static void main(String[] args) {
		int[]mixNumbers ={ 12, 10, 9, 2, 45, 2, 10, 10, 45}; 
		printUniqueNumbers(mixNumbers);
		
	}
	
	public static void printUniqueNumbers(int[]arr) {
		
		for(int j =0; j<arr.length; j++) {
			int testNumber = arr[j];
			boolean unique = true;
			
			for(int i=0; i<arr.length; i++) {
				if(j == i) {
					continue;
				}
				if(testNumber == arr[i]) {
					unique = false;
					break;
			}	
		}
			
		if(unique) {
			System.out.println(testNumber + ",");
		}
	}
		System.out.println();
    }
    }

