class Solution {
    int j = 0;
    private void sortIt(int[] nums, int cnt, int n) {
        while(cnt > 0) {
            nums[j] = n;
            j++;
            cnt--;
        }
        return; 
    }
    public void sortColors(int[] nums) {
        
        int zeroCnt = 0;
        int oneCnt = 0;
        int twoCnt = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) zeroCnt++;
            else if(nums[i] == 1) oneCnt++;
            else twoCnt++;
        }
        
        sortIt(nums, zeroCnt, 0);
        sortIt(nums, oneCnt, 1);
        sortIt(nums, twoCnt, 2);
        
        return ; 
    }
}
