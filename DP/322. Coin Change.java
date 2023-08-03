class Solution {
    HashMap <Integer,Integer> x = new HashMap <Integer,Integer>();
    public int coinChange(int[] coins, int amount) {
        x.put(0,0);
        for(int num : coins){
            x.put(num,1);
        }
        return coinChange2(coins,amount);
    }
    public int coinChange2(int[] coins, int amount) {
        if(!x.containsKey(amount)){
            int numOfCoins = -1;
            for(int i=0;i<coins.length;i++){
                if(amount-coins[i]>=0){
                    int temp = coinChange2(coins,amount-coins[i]);
                    if(temp>=0){
                        if(numOfCoins==-1){
                            numOfCoins = temp;
                        }else{
                            numOfCoins = Math.min(numOfCoins,temp);
                        }
                        
                    }
                }
            }
            if(numOfCoins==-1){
                x.put(amount,-1);
            }else{
                x.put(amount,numOfCoins+1);
            }
        }
        
        return x.get(amount);
    } 
}
