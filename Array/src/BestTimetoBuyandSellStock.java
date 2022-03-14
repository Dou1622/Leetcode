/**
 * @author DouDou
 * @create 14-Mar-2022 3:13 PM
 **/
public class BestTimetoBuyandSellStock {
    public  int maxProfit(int[] prices){
        int maxprofit =0;
        int min = prices[0];
        for(int i =0; i< prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            if(maxprofit< prices[i]-min){
                maxprofit = prices[i]-min;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BestTimetoBuyandSellStock bt = new BestTimetoBuyandSellStock();
        System.out.println(bt.maxProfit(prices));
    }
}
