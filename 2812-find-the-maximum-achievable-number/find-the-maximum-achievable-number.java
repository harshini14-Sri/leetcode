class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int sum=num;
        for(int i=0;i<t;i++){
            sum+=2;
        }
        return sum;
    }
}