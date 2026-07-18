class Solution {
    public int minCostConnectPoints(int[][] points) {

        List<Edges> alledges=new ArrayList<>();
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int x1=points[i][0], y1=points[i][1];
                int x2=points[j][0], y2=points[j][1];
                alledges.add(new Edges(i,j,(Math.abs(x1-x2)+Math.abs(y1-y2))));
            }
        }

        Collections.sort(alledges,(e1,e2)->{
            return e1.w-e2.w;
        });

        int cost=0;
        int select=0;
        UFDS d=new UFDS(points.length);
        for(Edges e:alledges){
            if(d.union(e.u,e.v)){
                cost+=e.w;
                System.out.println(e.w);
                select++;
                if(select==points.length-1) break;
            }
        }
        return cost;
    }
}

class Edges{
    int u,v,w;
    public Edges(int u,int v,int w){
        this.u=u;
        this.v=v;
        this.w=w;
    }
}

class UFDS{
    int n;
    int[] p;
    public UFDS(int n){
        this.n=n;
        p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=i;
        }
    }

    int find(int x){
        if(x==p[x]) return x;
        return p[x]=find(p[x]);
    }
    boolean union(int x,int y){
        int lx=find(x);
        int ly=find(y);
        if(lx==ly) return false;
        p[ly]=lx;
        return true;
    }
}