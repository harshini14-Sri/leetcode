class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int a=0;
        int num=n;
        while(num>0){
            a=(a<<1)|1;
            num=num>>1;
        }
        return n^a;
    }
}