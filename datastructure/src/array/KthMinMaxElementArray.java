package array;

import java.util.Arrays;

public class KthMinMaxElementArray {
	public static void main(String args[]) {
		int arr[] = {1,2,22,3,42,44,56,87,9};
		int k =2;
		KthMinMaxElementArray obj = new KthMinMaxElementArray();
		obj.kthMin(k, arr);
		obj.kthMax(k, arr);
		
	}
	public void kthMin(int k, int arr[]) {
		Arrays.sort(arr);
		System.out.println("kth smallest " + arr[k-1]);
	}
	public void kthMax(int k, int arr[]) {
		Arrays.sort(arr);
		System.out.println("kth largest " + arr[arr.length - k]);
	}
}
