class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
       
        int n=s.length();
        int res=mp.get(s.charAt(n-1));
        for(int i=0;i<n-1;i++){
        int sign=mp.get(s.charAt(i))<mp.get(s.charAt(i+1))?-1:1;
        res+=sign*mp.get(s.charAt(i));
        }
        return res;
    }
}