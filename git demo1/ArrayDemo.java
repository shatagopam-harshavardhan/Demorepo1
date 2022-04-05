package demo;

public class ArrayDemo {
	
	static int sumArrayElements(int numbers[]) {
		int sum=0;
		for (int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[]= {10,20,30,40,50,60};
		
		int result=sumArrayElements(myArray);
		System.out.println("Addition of array elements is "+result);
		

	}

}
