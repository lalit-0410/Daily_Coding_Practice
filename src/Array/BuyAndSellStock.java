package Array;

public class BuyAndSellStock {
    public static void buySellStock(int[] prices){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int sellPrice=0;
        int bestBuy=0;
        for(int i=0;i<prices.length;i++){
            //a day when we sell stock and make some profit
            if(buyPrice<prices[i]){

                int todayProfit=prices[i]-buyPrice;

                if(todayProfit>maxProfit){
                    maxProfit=todayProfit;
                    sellPrice=prices[i];
                    bestBuy=buyPrice;
                }
            }
            //a day when we buy stock
            else {

                buyPrice=prices[i];
            }
        }
        System.out.println("Buying at "+bestBuy);
        System.out.println("Selling at "+sellPrice);
        System.out.println("The maximum profit is "+maxProfit);
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        buySellStock(prices);
    }
}
