import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){System.out.print("* ");
        }
        System.out.print("\n");    
        }
        sc.close();
    }   
}
