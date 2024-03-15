public class floatarray{
    public static void main(String[] args) {
        float [] marks={92.4f,92.2f,96.8f,94.3f,95.1f};
        float sum=0;
        for(float element : marks){
            sum += element;
        }
        System.out.println(sum);
    }
}