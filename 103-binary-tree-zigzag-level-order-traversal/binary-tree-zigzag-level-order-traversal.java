/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> lvl=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode cur=q.poll();
                if(flag){
                    lvl.add(cur.val);
                }
                else{
                    lvl.add(0,cur.val);
                }
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
                
            }
            res.add(lvl);
            flag=!flag;
        }
        return res;
    }
}