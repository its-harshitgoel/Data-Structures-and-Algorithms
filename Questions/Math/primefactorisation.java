import java.util.Scanner;

public class primefactorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        //(sqrt(N))
        for(int i = 2; i*i <= N; i++){

            //log(N)
            while(N % i == 0){
                System.out.print(i + " ");
                N /= i;
            }
        }

        if(N != 1){
            System.out.println(N);
        }

        //TC: sqrt(N)
    }
}
