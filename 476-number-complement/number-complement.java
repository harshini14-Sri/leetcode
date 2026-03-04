class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        int a=0;
        int n=num;
        while(n>0){
            a=(a<<1)|1;
            n=n>>1;
        }
        return num^a;
    }
}