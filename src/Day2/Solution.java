package Day2;

public class Solution {
	 
	public int[] searchRange(int[] nums, int target) {
		//goes through the list checking each value one by one
		int index []= {-1,-1};
		int n=0;
		for (int k=0;k<nums.length;k++) {
			if(nums[k]==target) {
				index[n]=k;
				n++;
			}
		}
		return index;
	}


}