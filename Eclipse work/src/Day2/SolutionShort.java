package Day2;

public class SolutionShort {
	//attempting project in O(log n) time
	public static int[] searchRange(int[] nums, int target) {
		int index []= {-1,-1};
		int min=0;
		int max=nums.length-1;
		//using a while loop because recursion wouldn't work here
		while (true) {
			//first check if list is empty, or only has one value
			if(nums.length==0||nums.length==1) {
				return index;
			}
			else if(nums[(min+max)/2]==target) {
				//if the target was found, check if the second target is before or after current place
				if(nums[((min+max)/2)+1]==target) {
					index[0]=(min+max)/2;
					index[1]=((min+max)/2)+1;
				}else if(nums[((min+max)/2)-1]==target) {
					index[0]=((min+max)/2)-1;
					index[1]=((min+max)/2);
				}
				return index;
				//keep on dividing the list in half to make search time faster
			}else if(nums[(min+max)/2]>target){
				max=(min+max)/2;
			}else if(nums[(min+max)/2]<target) {
				min=(min+max)/2;	
			}
		}
	}
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,5,6,7,8,9,10,11,11,12,34,56};
		int ans[]=searchRange(nums,12);
		System.out.println(ans[0]+" "+ans[1]);

	}
	

}
