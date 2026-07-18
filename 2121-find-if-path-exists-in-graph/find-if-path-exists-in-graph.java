class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int e=edges.length;
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(i,new ArrayList());
        }
        for(int i=0;i<e;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            mp.get(u).add(v);
            mp.get(v).add(u);
        }

        Queue<Integer> q=new LinkedList<>();
        Set<Integer> vis=new HashSet<>();
        q.add(source); vis.add(source);
        while(!q.isEmpty()){
            int u=q.remove();
            if(u==destination) return true;
            for(int v:mp.get(u)){
                if(!vis.contains(v)){
                    q.add(v);vis.add(v);
                }
            }
        }
        return false;
    }
}