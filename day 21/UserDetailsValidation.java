import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class UserDetailsValidation {
    public static void isValidFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static void isValidLastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static void isValidEmail(String email) {
        String regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static void isValidMobileNumber(String mobileNumber) {
        String regex = "^[91][_.][6-9]?[\\d]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static void isValidPassword(String password) {
        String regex = "^[0-9 a-z A-Z @]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static void isValidAllEmail() {
        ArrayList<String> email = new ArrayList<String>();
        // Valid emails
        email.add("Ankit@gmail.com");
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.566@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-111@abc.net");
        email.add("abc111@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");

        // Invalid emails
        email.add("abcgmail.com"); // must contains “@” symbol
        email.add("abc@.com.my"); // tld can not start with dot “.”
        email.add("abc123@.com");// tld can not start with dot “.”
        email.add("abc123@.com.com");// tld can not start with dot “.”
        email.add("abc123@gmail.a"); // “.a” is not a valid tld, last tld must contain at least two characters
        email.add("abc()*@gmail.com"); // email’s is only allow character, digit, underscore and dash
        email.add("abc@%*.com"); // email’s tld is only allow character and digit
        email.add("abc@abc@gmail.com"); // double “@” is not allow
        email.add("abc@gmail.com.1a"); // .1aemail’s tld which has two characters can not contain digit
        email.add(".abc@abc.com"); // email’s 1st character can not start with “.”
        email.add("abc@gmail.com.aa.au"); // can not have multiple email’s tld

        String regex = "^[a-z]+[a-z0-9+_.-]*[@][a-z0-9]+[.][a-z]{2,4}[.]*([a-z]{2,3})*$";
        Pattern pattern = Pattern.compile(regex);
        for (String emails : email) {
            Matcher matcher = pattern.matcher(emails);
            System.out.println(emails + " : " + matcher.matches());
        }
    }
}
