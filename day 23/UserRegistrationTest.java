import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {

    static UserRegistration userRegistration = new UserRegistration();

    @BeforeClass
    public static void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void testUserFirstName_whenValid_ShouldReturnSuccess() {
        try {
            boolean result = userRegistration.validateFirstName.validate("Ankit");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserFirstName_whenInValid_ShouldReturnException() {
        try {
            boolean result = userRegistration.validateFirstName.validate("ankit");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserLastName_whenValid_ShouldReturnSucess() {
        try {
            boolean result = userRegistration.validateLastName.validate("Ghosh");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserLastName_whenInValid_ShouldReturnException() {
        try {
            boolean result = userRegistration.validateLastName.validate("ghosh");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserEmailID_whenValid_ShouldReturnSucess() {
        try {
            boolean result = userRegistration.validateEmailID.validate("ankit123@gmail.com");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserEmailID_whenInValid_ShouldReturnException() {
        try {
            boolean result = userRegistration.validateEmailID.validate("13@gmail");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }


    @Test
    public void testUserMobileNumber_whenValid_ShouldReturnSucess() {
        try {
            boolean result = userRegistration.validateMobileNumber.validate("91 9999999999");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserMobileNumber_whenInValid_ShouldReturnException() {
        try {
            boolean result = userRegistration.validateMobileNumber.validate("181881");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserPassword_whenValid_ShouldReturnSucess() {
        try {
            boolean result = userRegistration.validatePassword.validate("Atom123@");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testUserPassword_whenInValid_ShouldReturnException() {
        try {
            boolean result = userRegistration.validatePassword.validate("transition");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }
}
