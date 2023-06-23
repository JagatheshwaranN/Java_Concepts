package dsa.leetcode_problems;

public class _02_RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] person_accounts = {{1, 2, 3}, {3, 3, 2}};
        System.out.println(maximumWealth(person_accounts));
    }

    static int maximumWealth(int[][] accounts) {

        int maxwealth = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sumOfAccounts = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sumOfAccounts += accounts[person][account];
            }
            if (sumOfAccounts > maxwealth) {
                maxwealth = sumOfAccounts;
            }
        }
        return maxwealth;
    }
}
