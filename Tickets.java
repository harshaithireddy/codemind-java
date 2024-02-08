import java.util.*;

public class Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a * 4 > 1000) System.out.println("NO");
        else System.out.println("YES");
    }
}