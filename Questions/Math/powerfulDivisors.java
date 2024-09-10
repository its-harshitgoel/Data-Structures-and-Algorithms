
import java.util.*;

class powerfulDivisors {
    int getMax(int[] A){
        int mx = 0;
        for(int a : A){
            mx = Math.max(mx, a);
        }
        return mx;
    }
    
    boolean isPowerOf2(int num){
        return (num & (num-1)) == 0;
    }
    
    public int[] solve(int[] A) {
        int max = getMax(A);
        
        int[] countDivisors = new int[max + 1];
        
        for(int i = 1; i <= max; i++){
            for(int j = i; j <= max; j+=i){
                countDivisors[j]++;
            }
        }
        
        int[] prefixSum = new int[max + 1];
        
        for(int i = 1; i <= max; i++){
            prefixSum[i] = prefixSum[i-1];
            if(isPowerOf2(countDivisors[i])){
                prefixSum[i]++;
            }
        }
        
        int[] ans = new int[A.length];
        
        for(int i = 0; i < A.length; i++){
            ans[i] = prefixSum[A[i]];
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = new powerfulDivisors().solve(A);  
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
       
    }
}
