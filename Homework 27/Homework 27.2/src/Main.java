import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Добро пожаловать в банк \"Чертово колесо\".\n" +
                    "Здесь вы сможите воспользоваться всеми услугами нашего банка:\n" +
                    "Для открытия счета напишите слово \"Открыть\",\n" +
                    "Для редактирования счета напишите слово \"Изменить\",\n" +
                    "Для снятия денег со счета напишите слово \"Снять\",\n" +
                    "Для пополнения счета напишите слово \"Пополнить\",\n" +
                    "Для перевода денежных средств напишите слово \"Перевести\",\n" +
                    "Для просмотра своего счета напишите слово \"Счета\"\n" +
                    "Для выхода мз банка напишите слово \"Выход\".\n" +
                    "Введите интересующую команду:");
            String action = new Scanner(System.in).nextLine();

            if (action.toLowerCase().startsWith("открыть")) {
                Bank.openBankAccount();
            } else if (action.toLowerCase().startsWith("выход")) {
                System.out.println("Вы вышли из банка");
                return;
            } else if (action.toLowerCase().startsWith("счета")) {
                Bank.list();
            } else if (action.toLowerCase().startsWith("изменить")) {
                Bank.change();
            } else if (action.toLowerCase().startsWith("снять")) {
                Bank.take();
            } else if (action.toLowerCase().startsWith("пополнить")) {
                Bank.put();
            } else if (action.toLowerCase().startsWith("перевести")) {
                Bank.transfer();
            } else {
                System.out.println("Команда не распознана");
            }
        }
    }
}