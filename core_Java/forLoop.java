package core_Java;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];   // method 1 to declare the array
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
	
		for (int i=0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	
		
		for (int num: arr) {           //Enhanced for loop
			System.out.println(num);
		}
		
	}

}
