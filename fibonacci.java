import java.util.Scanner;

public class fibonacci {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        System.out.println(fibonacci(n));
        }   
}
