class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int b=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            a++;
        }else{
           if(b<a){ 
            b=a;
           }
           a=0;
        }
        }
        if(a<b){
            return b;
        }
        return a;
    }
}