class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        for(int i=0;i<sorted.length-1;i++){
            if(sorted[i]==sorted[i+1]){
                ans[0]=sorted[i];
            }
        }
        int n=nums.length;
        int ex=n*(n+1)/2;
        int act=0;
        for(int j=0;j<nums.length;j++){
            act=nums[j]+act;
        }
        ans[1]=ex-(act-ans[0]);
        return ans;
    }
}