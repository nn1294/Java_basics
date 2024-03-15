import java.util.Scanner;

public class recursion1 {
    public static void printNum(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printNum(n);
        sc.close();
    }
    
}
