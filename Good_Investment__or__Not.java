import java.util.*;

public class Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(b * 2 <= a) System.out.println("YES");
        else System.out.println("NO");
    }
}