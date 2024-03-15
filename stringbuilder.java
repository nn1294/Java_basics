import java.util.*;
public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'S');
        System.out.println(sb);       
    }
}