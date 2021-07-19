class Solution {
    public int solution(int[] money) {
        int answer = 0;
        
        int[] dp = new int[money.length];
        int[] dp2 = new int[money.length];
        
        dp[0] = money[0];
        dp[1] = money[0];
        
        dp2[0] = 0;
        dp2[1] = money[1];
        
        for(int i = 2; i < money.length; i++) {
        	dp[i] = Math.max(dp[i-2]+money[i], dp[i-1]);
        	dp2[i] = Math.max(dp2[i-2]+money[i], dp2[i-1]);
        }
        
        answer = Math.max(dp[dp.length-2], dp2[dp2.length-1]);
        
        return answer;
    }
}
