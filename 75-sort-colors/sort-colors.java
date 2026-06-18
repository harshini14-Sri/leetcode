class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int s=0;
        int m=0;
        int e=n-1;
        while(m<=e){
            if(nums[m]==0){
                swap(nums,s,m);
                s++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums,m,e);
                e--;
            }
        }
    }

    void swap(int nums[],int a,int b){
        // a=nums[a]+nums[b];
        // b=a-nums[b];
        // a=a-b;

        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}