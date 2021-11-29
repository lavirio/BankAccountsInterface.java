import java.util.*;

public class Bank {
    public static Map<String, Client> bankStatements = new TreeMap<>();

    public static void openBankAccount() {
        System.out.println("Для открытия счета введите ФИО:");
        String name = new Scanner(System.in).nextLine();
        if (bankStatements.containsValue(name)) {
            System.out.println("Клиент с таким именем уже существует");
            return;
        }
        System.out.println("Уважаемый, " + name + ", Чертово колесо предлагает на выбор три разных счета:\n" +
                "1.Сберегательный счет:\n" +
                "Снятие без ограничений.\n" +
                "Пополнение без ограничений.\n" +
                "Перевод без ограничений.\n" +
                "2.Дебетова карта:\n" +
                "При снятии суммы до 50000 рублей, взимается комиссия 2%, а при снятии суммы свыше 50000 рублей, взимыется комиссия 1% от суммы перевода.\n" +
                "Пополнение без ограничений.\n" +
                "При перевод суммы до 25000, взимается комиссия 1%, а при снятии суммы свыше 50000 рублей, взимыется комиссия 0,5% от суммы перевода.\n" +
                "3.Кредитная карта:\n" +
                "При снятии суммы до 10000 рублей, взимается комиссия 2,5%, а при снятии суммы 10000 рублей до 50000 рублей, взимыется комиссия 2%, а при снятии суммы свыше 50000 рублей, взимается комиссия 1% от суммы перевода.\n" +
                "При пополнение на сумму до 15000 рублей, взимается комисся 5% от суммы перевода, а на сумму свыше 15000 рублей, комисся не взимается.\n" +
                "При перевод суммы до 50000 рублей, взимается комиссия 3%, а при переводе суммы свыше 50000 рублей, взимыется комиссия 0,5% от суммы перевода.\n" +
                "Выберете тип счета:");
        String typeOfAccount = new Scanner(System.in).nextLine();
        if (typeOfAccount.matches("1")) {
            System.out.println("Для открытия сберегательного счета введите номер мобильного телефона:");
            String mobileNumber = new Scanner(System.in).nextLine();
            System.out.println("Для открытия сберегательного счета введите email:");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Уважаемый, " + name + ", поздравляем с успешным открытием сберегательного счета");
            bankStatements.put(name, new Client(mobileNumber, email, new SavingsAccount()));
        } else if (typeOfAccount.matches("2")) {
            System.out.println("Для открытия дебитовой карты введите номер мобильного телефона:");
            String mobileNumber = new Scanner(System.in).nextLine();
            System.out.println("Для открытия дебетовой карты введите email:");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Уважаемый, " + name + ", поздравляем с успешным открытием дебетовой карты");
            bankStatements.put(name, new Client(mobileNumber, email, new DebitCard()));
        } else if (typeOfAccount.matches("3")) {
            System.out.println("Для открытия кредитной карты введите номер мобильного телефона:");
            String mobileNumber = new Scanner(System.in).nextLine();
            System.out.println("Для открытия кредитной карты введите email:");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Уважаемый, " + name + ", поздравляем с успешным открытием кредитной карты");
            bankStatements.put(name, new Client(mobileNumber, email, new CreditCard()));
        } else {
            System.out.println("Вы ввели неправильную цифру");
        }
    }

    public static void change() {
        System.out.println("Введите ФИО клиента:");
        String name = new Scanner(System.in).nextLine();
        if (!bankStatements.containsKey(name)) {
            System.out.println("Извините, клиент с таким ФИО не найден");
            return;
        }
        for (Map.Entry<String, Client> entry : bankStatements.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getKey() + ", " + entry.getValue());
            }
        }
        System.out.println("Напишите, что вы хотите изменить:");
        String action = new Scanner(System.in).nextLine();
        if (action.toLowerCase().startsWith("телефон")) {
            System.out.println("Введите новый номер мобильного телефона:");
            String newNumber = new Scanner(System.in).nextLine();
            System.out.println("Данные клиента " + name + " успешно обновлены");
            bankStatements.get(name).setMobileNumber(newNumber);
        } else {
            System.out.println("Введите новый email:");
            String newMail = new Scanner(System.in).nextLine();
            System.out.println("Данные клиента " + name + " успешно обновлены");
            bankStatements.get(name).setMobileNumber(newMail);
        }
    }

    public static void take() {
        System.out.println("Введите ФИО клиента:");
        String name = new Scanner(System.in).nextLine();
        if (!bankStatements.containsKey(name)) {
            System.out.println("Извините, клиент с таким ФИО не найден");
            return;
        }
        Client client = bankStatements.get(name);
        client.take(client.getBankAccount());
    }

    public static void put() {
        System.out.println("Введите ФИО клиента:");
        String name = new Scanner(System.in).nextLine();
        if (!bankStatements.containsKey(name)) {
            System.out.println("Извините, клиент с таким ФИО не найден");
            return;
        }
        Client client = bankStatements.get(name);
        client.put(client.getBankAccount());
    }

    public static void transfer() {
        System.out.println("Введите ФИО клиента:");
        String name = new Scanner(System.in).nextLine();
        if (!bankStatements.containsKey(name)) {
            System.out.println("Извините, клиент с таким ФИО не найден");
            return;
        }
        Client client = bankStatements.get(name);
        client.transfer(client.getBankAccount());
    }

    public static void list() {
        if (bankStatements.isEmpty()) {
            System.out.println("В банке не открыт ни один счет");
            return;
        }
        for (Map.Entry<String, Client> entry : bankStatements.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}