import java.util.Scanner;

public class string1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName  +" " +  lastName;
        System.out.println(fullName.length());
        }
}
