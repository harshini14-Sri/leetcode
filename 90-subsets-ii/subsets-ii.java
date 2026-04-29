class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0);
        return res;
    }
    public void backtrack(int[] nums,int idx){
        res.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(nums,i+1);
            temp.remove(temp.size()-1);

        }
    }
}