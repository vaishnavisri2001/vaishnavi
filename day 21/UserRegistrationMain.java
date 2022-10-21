import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);
    static String firstName;
    static String lastName;
    static String email;
    static String mobileNumber;
    static String password;
    static String AllMail;


    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        //calling method.
        userFirstName();
        userLastName();
        userEmail();
        userMobileNumber();
        userPassword();
        userAllMail();

    }
    public static void userFirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.nextLine();
        UserDetailsValidation.isValidFirstName(firstName);
    }

    public static void userLastName(){
        System.out.println("Enter your Last Name");
        lastName = scanner.nextLine();
        UserDetailsValidation.isValidFirstName(lastName);
    }

    public static void userEmail() {
        System.out.println("Enter your Email");
        email = scanner.nextLine();
        UserDetailsValidation.isValidEmail(email);
    }

    public static void userMobileNumber(){
        System.out.println("Enter your Mobile number ");
        mobileNumber = scanner.nextLine();
        UserDetailsValidation.isValidMobileNumber(mobileNumber);
    }
    public static void userPassword(){
        System.out.println("Enter your password");
        password = scanner.nextLine();
        UserDetailsValidation.isValidPassword(password);
    }
    public static void userAllMail(){
        System.out.println("Enter your AllMail");
        AllMail = scanner.nextLine();
        UserDetailsValidation.isValidPassword(AllMail);
    }
}