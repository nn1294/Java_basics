import java.util.Scanner;
public class evennosum {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i=0;
        while(n!=0){
            sum = sum + 2*i;
            i=i+1;
            n=n-1;
        }
        System.out.print(sum);
    sc.close();
    }
}
