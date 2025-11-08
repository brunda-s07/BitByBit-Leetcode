class Solution {
    public int maximumWealth(int[][] accounts) {
     int n=accounts.length;
     int m=accounts[0].length;
     int i,j,c;
     int sum,max=0;
     for(i=0;i<n;i++) 
     {
        sum=0;
        for(j=0;j<m;j++)
        {
            sum=sum+accounts[i][j];
        }
        if(sum>max)
        {
            c=max;
            max=sum;
            sum=c;
        }
     }
     return max;
    }
}
