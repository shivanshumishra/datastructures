package array;

public class FindMaxMinArray {
	public static void main(String args[]) {
		int arr[] = {3,2,4,6,88,9,4,5};
		FindMaxMinArray obj = new FindMaxMinArray();
		obj.findMax(arr);
		obj.findMin(arr);
	}
	
	public void findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max :"+max);
	}
	
	public void findMin(int[] arr) {
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min :"+min);
	}
}
