import java.util.Scanner;
public class fibonacciseries {
    public static void printFib(int n,int a,int b){
        if(n==2){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFib(n-1,b, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        printFib(n,a,b);
    }   
}
