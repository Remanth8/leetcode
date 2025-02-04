public class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(solution.coinChange(coins, amount));

        coins = new int[]{2};
        amount = 3;
        System.out.println(solution.coinChange(coins, amount)); 

        coins = new int[]{1};
        amount = 0;
        System.out.println(solution.coinChange(coins, amount)); 
    }
}
