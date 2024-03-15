
public class recursivesum {
    public static int sumNum(int n,int sum){
        if(n==0){
            return sum;
        }
        return sumNum(n-1,sum+n);
        
    }
    public static void main(String []args){

        int n=5;
        int sum=0;
        int res=sumNum(n,sum);
        System.out.println(res);
    }
}
