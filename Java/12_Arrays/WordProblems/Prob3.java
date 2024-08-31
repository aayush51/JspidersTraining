package WordProblems;

/*
 
John is a shop keeper. He can bought N items from the producer, the i-th of which costs cost[1]. 
He can sell the i-th item at sell[i]. Initially, he has k dollars and e items in his shop. 
At any moment, his store can accommodate at most 1 item, which means he has to sell the previous 
item before boughting the next one from the producer.

What is the maximum profit he can achieve?

Note:
1) He can bought and sell any number of items
2) He can use the profit previously earned to bought new items.
3) One item can be bought and sold at most once
4) items can be bought and sold in any order and not necessarily in the order as given input

Function Description:
Complete the function solution(int n , int k ,int[] cost , int[]sell). The function takes the 
following 4 parameters and returns the solution.

N: represents the number of items
K: represents the initial amount
cost: represents the cost price of the items
sell: represents the selling price of the items

input:
N=2
K=50
cost =(25,30) 
sell =(25,37)

Output: 7

 */


public class Prob3 {
	public static void main(String[] args) {
		int n = 2;
		int k = 50;
		int[] cost = {25, 30};
		int[] sell = {25, 37};
		System.out.println("Maximum profit: " + solution(n, k, cost, sell));
	}


	public static int solution(int n, int k, int[] cost, int[] sell) {
		int currentFunds = k;
		boolean[] bought = new boolean[n];

		while (true) {
			int maxProfit = -1;
			int maxProfitIndex = -1;

			for (int i = 0; i < n; i++) {
				if (!bought[i] && currentFunds >= cost[i]) {
					int profit = sell[i] - cost[i];
					if (profit > maxProfit) {
						maxProfit = profit;
						maxProfitIndex = i;
					}
				}
			}

			if (maxProfitIndex == -1) {
				break;
			}

			currentFunds += sell[maxProfitIndex] - cost[maxProfitIndex];
			bought[maxProfitIndex] = true;  
		}

		return currentFunds-k;
	}


}
