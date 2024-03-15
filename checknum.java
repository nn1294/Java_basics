public class checknum {
    public static void main(String[] args) {
        boolean check = false;
        int num=345;
        int [] numbers = {112,232,345,51,512,612};
        for(int element:numbers){
            if(element == num){
                check = true;
                break;
        }
            }

        if(check){
            System.out.println("Value is in the array");
        }
        else{
            System.out.println("The value is not in the array");
        }
    }
}
