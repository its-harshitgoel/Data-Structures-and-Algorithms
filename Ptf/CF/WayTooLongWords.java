public class WayTooLongWords {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s = sc.nextLine();
            if(s.length()>10){
                System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
            }else{
                System.out.println(s);
            }
        }
        sc.close();
    }
}
