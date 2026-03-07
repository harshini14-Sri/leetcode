class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()) return 0;
        Map<Character,Integer> freq=new HashMap<>();
        int ws=0,we=0,mx=0,n=s.length();
        for(we=0;we<n;we++){
            char ch=s.charAt(we);
            freq.put(ch,1+freq.getOrDefault(ch,0));
            if(freq.get(ch)<=1){
                if(we-ws+1>mx){
                    mx=we-ws+1;
                }
            }else{
                while(ws<=we){
                    char rem=s.charAt(ws);
                    ws++;
                    freq.put(rem,freq.get(rem)-1);
                    if(freq.get(rem)==1){
                        break;
                    }
                }
            }
        }
        return mx;
    }
}