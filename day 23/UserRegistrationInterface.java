
@FunctionalInterface
public interface UserRegistrationInterface {
    public abstract boolean validate(String value) throws InvalidUserException;

}