class Solution {
     List<List<Integer>> res=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0,candidates,target);
        return res;
    }
    void backtrack(int idx,int[] candidates, int target){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) continue;
            temp.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i]);
            temp.remove(temp.size()-1);
        }

    }
}