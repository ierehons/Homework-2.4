public class Main {
    public static void main(String[] args) {

        boolean result = Validator.validate("java_skypro_go112",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Логин и пароль верные");
        }
    }
}