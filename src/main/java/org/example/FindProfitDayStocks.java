package org.example;

public class FindProfitDayStocks {
    public static void main(String[] args) {
        int[] stockPrice = {7, 1, 5, 2, 6, 4, 7};
        findProfitDayForStockGreedy(stockPrice, stockPrice.length);
    }

    private static void findProfitDayForStockGreedy(int[] stockPrice, int size) {
        int profit = 0;
        int lowestPrice = stockPrice[0];
        int buyIndex = 0;
        int sellIndex = 0;
        for (int i = 0; i < size; i++) {
            if (stockPrice[i] < lowestPrice) {
                lowestPrice = stockPrice[i];
            }
            for (int j = i; j < size; j++) {
                int tempProfit =  stockPrice[j] - stockPrice[i];
                if (tempProfit > profit) {
                    profit = tempProfit;
                    buyIndex = i;
                    sellIndex = j;
                }
            }
        }
        System.out.println("profit " + profit + " buy index " + buyIndex + " sell index " + sellIndex);
    }
}
