import java.util.Scanner;

public class checkVowel {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ONLY Alphabet ");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Enter Character  are vowel ");
                break;
            default:
                System.out.println("Enter Character  are Consonant ");
        }

    }

}
