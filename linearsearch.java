import java.util.Scanner;

public class linearsearch {
        public static void main(String[] args) {
            int size;
            Scanner sc =new Scanner(System.in);
            size = sc.nextInt();
            int [] marks = new int[size];
            for(int i=0;i<size;i++){
                marks[i]=sc.nextInt();
            }
            System.out.println("Enter the element to be found: ");
            int element = sc.nextInt(); 
            for(int i=0;i<size;i++){
                if(element == marks[i]){
                    System.out.printf("Therefore the position of the element in the array: %d",i);
                }
            }
            sc.close();
        }
    }
