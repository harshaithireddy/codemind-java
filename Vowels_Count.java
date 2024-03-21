import java.util.Scanner;

public class Vowels {
    static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) cnt++;
        }
        
        System.out.println(cnt);
    }
}