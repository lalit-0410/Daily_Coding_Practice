package LeetCodeArray;

public class BuyAndSell {
    public static int profit(int[] prices){
        int buy=prices[0];
        int profit=0;
        for (int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            } else if (prices[i]-buy>profit) {
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices={7,11,22,6,33,4};
        System.out.println(profit(prices));
    }
}
