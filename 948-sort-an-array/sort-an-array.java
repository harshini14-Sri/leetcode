class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }
    private int[] mergeSort(int[] nums){
        if(nums.length<=1) return nums;
        int mid=nums.length/2;
        int[] left=Arrays.copyOfRange(nums,0,mid);
        int[] right=Arrays.copyOfRange(nums,mid,nums.length);
        left=mergeSort(left);
        right=mergeSort(right);
        return merge(left,right);
    }
    private int[] merge(int[] left,int[] right){
        int i=0,j=0,k=0;
        int[] res=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]) res[k++]=left[i++];
            else res[k++]=right[j++];
        }
        while(i<left.length) res[k++]=left[i++];
        while(j<right.length) res[k++]=right[j++];
        return res;
    }
}