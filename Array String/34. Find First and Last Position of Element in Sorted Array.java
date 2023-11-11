class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []res = {-1,-1};
        int lo = 0;
        int hi = nums.length-1;
        int mid = 0;
        while(lo<=hi)
        {
            mid = lo+(hi-lo)/2;
            if(nums[mid] == target)
            {
                res[0] = mid;
                hi = mid-1;
            }
            else if(nums[mid]<target){
                lo = mid+1;
            }
            else
            {
                hi = mid-1;
            }
        }
        lo = 0;
        hi = nums.length-1;
        mid = 0;
        while(lo<=hi)
        {
            mid = lo+(hi-lo)/2;
            if(nums[mid] == target)
            {
                res[1] = mid;
                lo = mid+1;
            }
            else if(nums[mid]<target){
                lo = mid+1;
            }
            else
            {
                hi = mid-1;
            }
        }
        return res;


    }
}
