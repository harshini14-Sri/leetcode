class Solution {
    public String[] findWords(String[] words) {
        List<String> ans=new ArrayList<>();
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        for(String s:words){
            String lower=s.toLowerCase();
            String row="";
            if(r1.contains(""+lower.charAt(0))) row=r1;
            else if(r2.contains(""+lower.charAt(0))) row=r2;
            else row=r3;

            boolean valid=true;
            for(int i=0;i<lower.length();i++){
                if(!row.contains(""+lower.charAt(i))){
                    valid=false;
                    break;
                }
            }

            if(valid) ans.add(s);
        }
        return ans.toArray(new String[0]);
        
    }
}