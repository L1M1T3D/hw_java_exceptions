import java.util.regex.Pattern;

public class Validator {

    private static final int MAX_LENGTH = 20;
    private static final String VALID_PATTERN = "^[a-zA-Z0-9_]+$";

    public static void validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        // Проверка логина
        if (login.length() > MAX_LENGTH || !Pattern.matches(VALID_PATTERN, login)) {
            throw new WrongLoginException("Login должен содержать только латинские буквы, цифры, знак подчеркивания и быть не длиннее 20 символов.");
        }

        // Проверка пароля
        if (password.length() > MAX_LENGTH || !Pattern.matches(VALID_PATTERN, password)) {
            throw new WrongPasswordException("Password должен содержать только латинские буквы, цифры, знак подчеркивания и быть не длиннее 20 символов.");
        }

        // Проверка подтверждения пароля
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и ConfirmPassword должны совпадать.");
        }
    }
}
