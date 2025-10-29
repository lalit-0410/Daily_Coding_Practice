package LeetCodeArray;

public class BuySellOnSameDay {
    public static int profit(int[] prices){
        // int buy=prices[0];
        int profit=0;
        for(int i=1;i< prices.length;i++){
//            if(prices[i]>buy){
//                profit+= prices[i] - buy;
//            }
//            buy=prices[i];
//        }
            if(prices[i]>prices[i-1]){
                profit+= prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int[] prices2={1,2,3,4,5,6};
        System.out.println(profit(prices));
        System.out.println(profit(prices2));
    }
}
