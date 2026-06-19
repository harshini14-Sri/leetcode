class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] arr=new int[n];
        arr[0]=gain[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            arr[i]=gain[i]+arr[i-1];
            max=Math.max(max,arr[i]);
        }
            if(0>max) return 0;
        return max;
    }
}