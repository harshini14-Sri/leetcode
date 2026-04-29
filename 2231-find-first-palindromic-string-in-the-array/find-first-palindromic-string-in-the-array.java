class Solution {
    public String firstPalindrome(String[] words) {
        for(String val:words){
            if(isPalindrome(val)) return val;

        }
        return "";
    }
    private boolean isPalindrome(String val){
        int i=0,j=val.length()-1;
        while(i<j){
             if(val.charAt(i)!=val.charAt(j)) return false;
             i++;
             j--;
        }
       return true;
    }
}