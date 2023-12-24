import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    // Хранение пользователей (логин, пароль)
    private final Map<String, String> users = new HashMap<>();
    // Хранение балансов пользователей
    private final Map<String, Double> accountBalances = new HashMap<>();
    // Список транзакций
    private final List<Transaction> transactions = new ArrayList<>();
    // Доступные купюры в банкомате (номинал, количество)
    private final Map<Integer, Integer> availableBills = new HashMap<>();

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.initializeUsers();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Login");
            System.out.println("2.Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.login(scanner);
                    atm.performOperations(scanner);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Пользователь вводит логин и пароль, метод проверяет их валидность
    private void login(Scanner scanner) {
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }

    // Имитация пользователей
    private void initializeUsers() {
        users.put("user1", "pass1");
        users.put("user2", "pass2");
    }

    // Обрабатывает различные операции
    private void performOperations(Scanner scanner) {
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Transactions");
            System.out.println("5. Logout");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    viewTransactions();
                    break;
                case 5:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Выводит текущий баланс счета
    private void checkBalance() {
        System.out.println("Current Balance: " + accountBalances.get(getCurrentUser()));
    }

    // Возвращает текущего пользователя
    private String getCurrentUser() {
        return "user1";
    }

    // Обрабатывает операцию внесения средств
    private void deposit(Scanner scanner) {
        System.out.println("Enter deposit amount:");
        double amount = scanner.nextDouble();
        deposit(amount);
    }

    // Функция пополнения счета
    private void deposit(double amount) {
        // Имитация случайных проблем с приемом купюр
        if (Math.random() < 0.1) {
            System.out.println("Deposit failed. The bill was not accepted.");
            return;
        }

        // Добавляем транзакцию в список
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount));
        // Обновляем текущий баланс с помощью функции слияния
        accountBalances.merge(getCurrentUser(), amount, Double::sum);
        System.out.println("Deposit successful!");
        checkBalance();
    }

    // Обрабатывает операцию снятия средств
    private void withdraw(Scanner scanner) {
        System.out.println("Enter withdrawal amount:");
        double amount = scanner.nextDouble();
        withdraw(amount);
    }

    // Функция снятия со счета
    private void withdraw(double amount) {
        transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount));
        accountBalances.merge(getCurrentUser(), -amount, Double::sum);
        dispenseBills(amount);
        System.out.println("Withdrawal successful!");
        checkBalance();
    }

    // Обрабатывает снятие средств, формируя сумму из доступных банкнот
    private void dispenseBills(double amount) {
        for (Map.Entry<Integer, Integer> entry : availableBills.entrySet()) {
            int bill = entry.getKey();
            int count = entry.getValue();

            int billsToDispense = (int) (amount / bill);
            int billsDispensed = Math.min(billsToDispense, count);

            availableBills.merge(bill, -billsDispensed, Integer::sum);

            amount -= billsDispensed * bill;

            if (amount == 0) {
                break;
            }
        }
    }

    // Просмотр транзакций
    private void viewTransactions() {
        System.out.println("Recent Transactions:");
        for (int i = Math.max(0, transactions.size() - 10); i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            System.out.println(transaction);
        }
    }

    // Выход из системы
    private void logout() {
        System.out.println("Logging out...");
        System.exit(0);
    }
}

// Перечисление, представляющее типы транзакций
enum TransactionType {
    DEPOSIT,
    WITHDRAWAL
}

// Представляет объект транзакции с типом, суммой и временной меткой
class Transaction {
    private final TransactionType type;
    private final double amount;
    private final LocalDateTime timestamp;

    public Transaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        return "Transaction {" +
                "type = " + type +
                ", amount = " + amount +
                ", timestamp = " + formattedTimestamp +
                '}';
    }
}
