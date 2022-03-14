/**
 * @author DouDou
 * @create 14-Mar-2022 11:28 AM
 **/
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int maxprice = 0;
        int min =prices[0];
        for(int i=0; i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else if(prices[i]-min > maxprice){
                maxprice = prices[i]-min;
            }
        }
        return maxprice;
    }

    public static void main(String[] args) {
        int[] prices = {2,1};
        BestTimetoBuyandSellStock btb = new BestTimetoBuyandSellStock();
        System.out.println(btb.maxProfit(prices));
    }
}
