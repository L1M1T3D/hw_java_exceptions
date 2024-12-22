public class Main {
    public static void main(String[] args) {
        try {
            Validator.validateCredentials("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Валидация прошла успешно!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Проверка завершена.");
        }

        // Некорректные данные
        try {
            Validator.validateCredentials("java_skypro_go_too_long", "invalid_password", "invalid_password");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Проверка завершена.");
        }
    }
}
