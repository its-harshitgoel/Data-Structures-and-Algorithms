import java.util.Scanner;

public class countFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int cnt = 0;

        for(int i = 1; i*i <=n; i++){
            if(n % i == 0){
                if(i*i == n){
                    cnt++;
                }else{
                    cnt+=2;
                }
            }
        }

        System.out.println(cnt);
    }
}
