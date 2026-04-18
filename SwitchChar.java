import java.util.Scanner;
public class SwitchChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char alpha = sc.nextLine().charAt(0);
        switch(alpha){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            System.out.println("Vowel");
            default:
            System.out.println("consonant");
        }
    }
}
