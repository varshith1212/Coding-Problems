import java.util.*;

public class FuryNation {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n-1];
        int b[]=new int[n-1];

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();

        int parent[]=new int[n];

        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++) {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++) {
            ar.add(new ArrayList<Integer>());
        }
        for(int i=0;i<a.length;i++) {
            ar.get(a[i]-1).add(b[i]-1);
            ar.get(b[i]-1).add(a[i]-1);
        }
        int mod=1000000007;
        parent[0]=-1;
        FuryNation.dfs(0,-1,parent,ar,mod);

        int dp[]=new int[n];

        for(int i=0;i<n;i++) {
            FuryNation.dfs_1(i,parent[i],ar,mod,dp,i);
        }

        int sum=0;
        for(int i=0;i<dp.length;i++) {
            sum=((sum%mod)+dp[i])%mod;
        }
        System.out.println(sum);
    }

    static void dfs(int node,int parent1,int parent[],ArrayList<ArrayList<Integer>>a,int mod) {
        parent[node]=parent1;
        for(Integer x:a.get(node)) {
            if(x!=parent1) {
                dfs(x,node,parent,a,mod);
            }
        }
    }

    static void dfs_1(int node,int parent,ArrayList<ArrayList<Integer>>a,int mod,int dp[],int standing_node) {
        for(Integer x:a.get(node)) {
            if(x!=parent) {
                dfs_1(x,node,a,mod,dp,standing_node);
                if(standing_node<x) {
                    dp[standing_node]=((dp[standing_node]%mod)+1)%mod;
                }
            }
        }
    }
}