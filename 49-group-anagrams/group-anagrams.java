class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String st=new String(arr);
            mp.putIfAbsent(st,new ArrayList<>());
            mp.get(st).add(str);
        }
        return new ArrayList<>(mp.values());
    }  
}