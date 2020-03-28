 * Longest Common Subsequence
 * input: String a, String
 * output: Longest common subsequence between them
 * Brute Force: Generate 2^a.length subsequences and check if they exist in b O(2^a.length)*b.length
 * Recursive: (2^(m+n)) o(m*n)
 * lcs(a,b,i,j){
 *     if(i>=a.length || j>=b.length)return 0;
 *     if(a[i]==b[j]){
 *        return 1+lcs(a,b,i+1,j+1)
 *        }
 *     else{
 *        return Math.max(lcs(a,b,i+1,j),lcs(a,b,i,j+1));
 *        }
 *     }
 *
 * Memoized O(m*n) O(m*n)
 * lcs(a,b,i,j,dp){
 *     if(i>=a.length||j>=b.length)return 0;
 *     if(dp[i][j]!=-1)return dp[i][j];
 *     if(a[i]==b[j])return 1+dp[i-1][j-1];
 *     return Math.max(dp[i-1][j],dp[i][j-1]);
 *     }
 *
 * Dp Bottom Up O(m*n) O(m*n)
 * lcs(a,b){
 *     int[][] dp = new int[a.length+1][b.length+1];
 *     for(int i=0;i<a.length;i++)dp[i][0]=0;
 *     for(int j=0;j<=b.length;j++)dp[0][j]=0;
 *     for(int r=1;r<a.length;r++){
 *         for(int c=1;c<=b.length;c++){
 *             if(a[r]==b[c])dp[r][c]=1+dp[r-1][c-1];
 *             else dp[r][c]=Math.max(dp[r-1][c],dp[r][c-1]);
 *             }
 *         }
 *     }
 *
 * Tracing solution from dp table
 * start from rightmost down cell and trace back, if the value came from r-1,c-1 then add it to solution else go back to the value from where it came till r and col are greater than zero


