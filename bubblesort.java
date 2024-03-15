import java.util.Scanner;

public class bubblesort {

    
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int [] elements = new int[size];
        for(int i=0;i<size;i++){
            elements[i] = sc.nextInt();
        }
        for(int i=0;i<elements.length-1;i++){
            for(int j=0;j<elements.length-i-1;j++){
                if(elements[j]>elements[j+1]){
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(elements[i]+ " ");
        }
sc.close();
    }
}
