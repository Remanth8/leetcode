public class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // There is one way to make amount 0, that is to use no coins

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int amount = 5;
        int[] coins = {1, 2, 5};
        System.out.println(solution.change(amount, coins)); // Output: 4

        amount = 3;
        coins = new int[]{2};
        System.out.println(solution.change(amount, coins)); // Output: 0

        amount = 10;
        coins = new int[]{10};
        System.out.println(solution.change(amount, coins)); // Output: 1
    }
}
