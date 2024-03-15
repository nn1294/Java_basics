import java.util.Scanner;

public class array2d {
    public static void main(String[] args){
        int rows,columns;
        Scanner sc=new Scanner(System.in);
        rows = sc.nextInt();
        columns = sc.nextInt();
        int[][] bus = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                bus[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(bus[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
