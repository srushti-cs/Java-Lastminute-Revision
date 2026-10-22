 class RichestWealth {
     static void main(String[] args) {
         int[][] accounts={{1,5},{7,3},{3,5}};
         int ans= maximumWealth(accounts);
         System.out.println(ans);
     }
     public static int maximumWealth(int[][] accounts) {
//         int sum=0;
         int wealth=0;
         for(int i=0;i< accounts.length;i++)
         {
                int sum=0;
             for(int j=0;j<accounts[i].length;j++)
             {
                  sum= sum+accounts[i][j] ;

             }
             if(sum>=wealth)
             {
                 wealth= sum;
             }
         }
         return wealth;
     }
 }

