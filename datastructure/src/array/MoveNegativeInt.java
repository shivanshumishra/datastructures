package array;

import java.util.Arrays;

public class MoveNegativeInt {
	int nums[];
	public static void main(String args[]) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		MoveNegativeInt obj = new MoveNegativeInt(arr);
		obj.solve();
		obj.showResult();
	}

	public MoveNegativeInt(int arr[]) {
		this.nums = arr;
	}
	
	public void solve() {
		int i =0;
		int j = 0;
		int k = nums.length -1 ;
		int pivot = 0 ;
		while(j<=k) {
			if(nums[j]<pivot) {
				swap(i,j);
				i++;
				j++;
			}
			else if(nums[j]>pivot) {
				swap(j,k);
				k--;
			}
			else {
				j++;
			}
		}
	
	}
	
	public void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public void showResult() {
		System.out.print(Arrays.toString(nums));
	}
}
