class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int x=edges.length;
        UFDS d=new UFDS(x);
        for(int i=0;i<x;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            if(!d.union(u,v)) return edges[i];
            
        }
        return new int[0];
    }
}

class UFDS{
    int n;
    int[] parent;
    public UFDS(int n){
        this.n=n;
        parent=new int[n+1];
        for(int i=1;i<n+1;i++){
            parent[i]=i;
        }
    }

    int find(int x){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x]);
    }

    boolean union(int x,int y){
        int leadx=find(x),leady=find(y);
        if(leadx==leady) return false;
        parent[leady]=leadx;
        return true;
    }
}