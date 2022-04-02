package array;

import java.util.Arrays;

/*
 * if arr =  0,1,1,0,2,1,2,2
 * o/p -> 0,0,1,1,1,2,2,2
 * */
public class DutchFlagProblem {
	int nums[];
	public static void main(String args[]) {
		int[] arr = {2,2,1,1,0,0,1,1};
		DutchFlagProblem problem = new DutchFlagProblem(arr);
		problem.solve();
		problem.showResult();
	}
	
	public DutchFlagProblem(int[] arr) {
		this.nums = arr;
	}
	
	public void solve() {
		int i = 0;
		int j = 0;
		int pivot = 1;
		int k = nums.length - 1 ;
		
		while(j<=k) {
			if(nums[j] < pivot) {
				swap(i,j);
				i++;
				j++;
			}
			else if(nums[j] > pivot) {
				swap(j,k);
				k--;
			}
			else {
				j++;
			}
		}
	}
	
	public void swap(int index1,int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp; 
	}
	
	public void showResult() {
		System.out.print(Arrays.toString(nums));
	}
}
