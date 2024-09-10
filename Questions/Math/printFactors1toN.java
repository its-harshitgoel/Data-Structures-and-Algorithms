

import java.util.*;

public class printFactors1toN {
    static void initialiseArray(List<List<Integer>> ls, int n){
        for(int i = 0; i <= n; i++){
            ls.add(new ArrayList<>());
        }

        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j += i){
                ls.get(j).add(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        List<List<Integer>> ls = new ArrayList<>();
        initialiseArray(ls, n);
        System.out.println(ls);
    }
}
