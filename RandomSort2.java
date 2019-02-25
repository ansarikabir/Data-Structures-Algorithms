package lab3;

public class RandomSort2 {
	
	static void printArray(int arr[])
	 {
	     int n = arr.length;
	     for (int i=0; i<n; ++i)
	         System.out.print(arr[i]+" ");
	     System.out.println();
	 }
	public static void main(String args[])
	 {
		 int arraySize = 1000;
		 int A[]= new int[arraySize];
		 
		for (int i = 0; i < arraySize; i++) {	 	  
		// Generate a random array with values between 10 and 59
			 A[i] = (int) (Math.random() * 50) + 10;
		}
		printArray(A);
		InsertionSort ob = new InsertionSort();
	     ob.sort(A);
	     printArray(A);
	}

}
