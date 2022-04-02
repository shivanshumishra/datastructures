package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; 
		
		ReverseArray problem = new ReverseArray();
		problem.solve(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public int[] solve(int[] nums) {
		int lowIndex = 0;
		int highIndex = nums.length - 1;
		while(lowIndex < highIndex) {
			swap(nums,lowIndex,highIndex);
			lowIndex++;
			highIndex--;
		}
		return nums;
	}
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
