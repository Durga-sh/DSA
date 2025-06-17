package Array.MEDIUM;

public class StockBuyAndSell {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - min;
            maxProfit = Math.max(cost, maxProfit);
            min = Math.min(min, prices[i]);

        }

        return maxProfit;
    }

    public static void main(String args[]) {
        int arr1[] = { 7, 1, 5, 3, 6, 4 };
        int result = maxProfit(arr1);
        System.out.println(result);
    }

}
