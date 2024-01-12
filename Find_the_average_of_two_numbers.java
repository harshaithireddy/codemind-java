import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        
        double avg = (a + b) / 2.0;
        
        System.out.printf("%.4f", avg);
    }
}