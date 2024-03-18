package interview;

import java.util.Arrays;

public class Stcok {
    public static void main(String args[]) {
        int[] prices = {7, 6, 5, 4, 10};
        int maxMoney = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            // 买入价格
            int buyPrice = prices[i];
            int[] temprices = Arrays.copyOfRange(prices, i + 1, prices.length);
            Arrays.sort(temprices);
            int max = Arrays.stream(temprices).max().getAsInt();
            if (max - buyPrice > 0 && max - buyPrice > maxMoney) {
                maxMoney = max - buyPrice;
            }
        }
        System.out.println(maxMoney);
    }
}
