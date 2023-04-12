import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD, EUR, GBP;

        USD = 1;

        System.out.println("Введите курс евро к доллару:");
        EUR = scanner.nextDouble();

        System.out.println("Введите курс фунта стерлингов к доллару:");
        GBP = scanner.nextDouble();

        System.out.println("Введите сумму для конвертации:");
        double amount = scanner.nextDouble();

        System.out.println("Выберите валюту для конвертации (USD, EUR, GBP):");
        String currency = scanner.next();

        double result = 0.0;

        switch (currency) {
            case "USD":
                result = amount * USD;
                break;
            case "EUR":
                result = amount * EUR;
                break;
            case "GBP":
                result = amount * GBP;
                break;
            default:
                System.out.println("Неверный выбор валюты.");
                return;
        }

        System.out.println("Результат конвертации: " + result + " " + currency);
    }
}
