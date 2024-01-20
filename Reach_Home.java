import java.util.*;
public class MyClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maxDist = x*5;
        if(maxDist >= y) System.out.println("YES");
        else System.out.println("NO");
    }
}
