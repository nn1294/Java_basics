import java.util.Scanner;
public class percentagecal {
    public static void main(String[] args) {
        float marks;
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        float e = scan.nextFloat();
        marks = (a+b+c+d+e);
        float percent = (marks/500)*100;
        System.out.printf("Percentage Obtained: ");
        System.out.println(percent);
        scan.close();
    }

}
