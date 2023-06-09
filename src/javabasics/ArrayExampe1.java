package javabasics;

public class ArrayExampe1 {
	
	
	//return array values from function.
	
	int arr[] = new int[4];
	
	public  int[] createArray() {
		
		for(int i=0;i<=3;i++) {
			arr[i] = i+2;
		}
		
		return arr;
	}
	
	public void printArray(int b[]) {
		
		for(int i=0;i<=3;i++) {
			
			System.out.println(b[i]);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayExampe1 a = new ArrayExampe1();
		int b[] = a.createArray();
		a.printArray(b);
		
		

	}

}
