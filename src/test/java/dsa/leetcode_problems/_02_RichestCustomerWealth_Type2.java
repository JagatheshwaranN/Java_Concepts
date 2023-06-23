package dsa.leetcode_problems;

public class _02_RichestCustomerWealth_Type2 {

    public static void main(String[] args) {
        int[][] person_accounts = {{1, 2, 3}, {3, 3, 2}};
        System.out.println(maximumWealth(person_accounts));
    }

    static int maximumWealth(int[][] accounts) {

        int maxwealth = Integer.MIN_VALUE;

        for (int[] onePersonActs : accounts) {
            int sumOfAccounts = 0;
            for (int account : onePersonActs) {
                sumOfAccounts += account;
            }
            if (sumOfAccounts > maxwealth) {
                maxwealth = sumOfAccounts;
            }
        }
        return maxwealth;
    }
}
