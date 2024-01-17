import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 100 == 0) {
            System.out.println("00");
        }
        else if((n % 100) > 0 && (n % 100) < 10) {
            System.out.println("0" + n % 100);
        }
        else {
            System.out.println(n % 100);
        }
    }
}