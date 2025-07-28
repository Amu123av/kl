class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums, target, 0, nums.length - 1);}
         private int binarysearch(int[] nums, int target, int si, int ei) {
       
        int mid=si+(ei-si)/2;
        if(si>ei){
            return -1;
        }
        if(nums[mid]==target){
        return mid;
        }
        if(nums[si]<=nums[mid]){
            if(nums[si]<=target && target <=nums[mid]){
            return binarysearch(nums,target,si,mid-1);}
            else{
                return binarysearch(nums,target,mid+1,ei);
            }
        }
        else{
            if(nums[mid+1]<=target && target<=nums[ei]){
                return binarysearch(nums,target,mid+1,ei);
            }
            else{
                return binarysearch(nums,target,si,mid-1);
            }
        }
    }
}