import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double USD = 1.0;
		double EUR = 1.1;
		double GBP = 1.25;
		
		System.out.printin("Выберите валюту для конвертации (USD, EUR, GBP):");
		String currency = scanner.next();
		
		System.out.printin("Введите количество валюты:");
		String amount = scanner.next();
		
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
				System.out.printin("Неверный выбор валюты!");
					return;
			}
			
			System.out.printin("Результат конвертации:" + result + " " + currency);
			  }
}
				
