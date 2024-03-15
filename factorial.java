import java.util.Scanner;

public class factorial {
    public static int factorial(int n,int fact){
        if(n==0){
            return fact;
        }
        return factorial(n-1, fact*n);
    }
    public static void main(String[] args) {
        int n;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int res = factorial(n,fact);
        System.out.println(res);
    }
}
