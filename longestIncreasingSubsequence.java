/*
 * LongestIncreasingSubsequence
 * input: String a
 * output: Subsuence which is strictly increasing
 * BruteForce: generate all subsequences, check which is the largest and increasing O(2^n*n)
 * Recursive:
 * one character= result 1
 * starting from 2nd character either result is trying to add it in previous substrings or new starting from here
 * lis(a,i){
 *     if(i==0)return 1;
 *     for(int j=0;j<i;j++){
 *         if(a[j]<a[i])result=Math.max(result,1+lis(a,j));
 *         global=Math.max(global,result);
 *         }
 *     return result;
 *     }
 *
 * Memoized
 * lis(a,i){
 *     if(i==0)return 1;
 *     if(i<0)return 0;
 *     if(dp[i
 *     dp[i]=1;
 *     for(int j=0;j<i;j++){
 *          if(a[i]>a[j]){
 *              dp[i]=Math.max(dp[i],1+dp[j]);
 *              global=Mth.max(global,dp[i]);
 *          }
 *     }
 *     return dp[i];
 *     }
 *
 * DP
 * lis(a){
 * int[] dp = new inta.length];
 * for(int i=0;i<dp.length;i++)dp[i]=1;
 * for(int j=1;j<dp.length;j++){
 *     for(int k=0;k<j;k++){
 *         if(a[j]>a[k]){
 *             dp[j]=Math.max(dp[j],1+dp[k]);
 *             }
 *         }
 *     }
 *     int result = dp[0];
 * for(int element:dp)
 *     if(element>result)result=element;
 * return result;
 * }
