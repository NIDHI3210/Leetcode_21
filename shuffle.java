class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[n*2];
        int left=0;
        int right=n;
        int i=0;
        while(left<n){
            ans[i++]=nums[left++];
            ans[i++]=nums[right++];
        }
        return ans;
    }
}
