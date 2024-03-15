import java.util.Scanner;
public class bitmanip {
    public static void main(String[] args) {
        int bitMask;
        int pos;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        System.out.println("'Enter the positon: '");
        pos = sc.nextInt();
        bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}
