import java.util.Scanner;

class printFactorsInSorted{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i;

        for(i = 1; i*i < n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

        for(int j = i; j  >= 1; j--){
            if(n % j == 0){
                System.out.print(n/j + " ");
            }
        }
    }
}