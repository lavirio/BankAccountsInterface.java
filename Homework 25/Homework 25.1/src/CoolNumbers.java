import java.util.*;

public class CoolNumbers {
    static List<String> coolCarNumbersList = new ArrayList<>();
    static Set<String> coolCarNumbersHashSet = new HashSet<>();
    static Set<String> coolCarNumbersTreeSet = new TreeSet<>();

    public static void generateCoolNumbers() {
        final String[] carLetters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т"};
        int quantity = 0;
        for (String firstLetter : carLetters) {
            for (int number = 111; number < 1000; number += 111) {
                for (String secondLetter : carLetters) {
                    for (String thirdLetter : carLetters) {
                        for (int region = 1; region < 200; region++) {
                            String carNumber = firstLetter + number + secondLetter + thirdLetter + region;
                            coolCarNumbersList.add(carNumber);
                            coolCarNumbersHashSet.add(carNumber);
                            coolCarNumbersTreeSet.add(carNumber);
                            quantity++;
                        }
                    }
                }
            }
        }
        System.out.println(quantity);
    }

    public static void directSearchCoolNumber() {
        System.out.println("Введите номер для прямого поиска:");
        String number = new Scanner(System.in).nextLine();
        long startTime = System.nanoTime();
        System.out.println(coolCarNumbersList.contains(number) + " , " + (System.nanoTime() - startTime));
    }

    public static void binarySearchCoolNumber() {
        Collections.sort(coolCarNumbersList);
        System.out.println("Введите номер для бинарного поиска:");
        String number = new Scanner(System.in).nextLine();
        long startTime = System.nanoTime();
        System.out.println(Collections.binarySearch(coolCarNumbersList, number) + " , " + (System.nanoTime() - startTime));
    }

    public static void directHashSetSearchCoolNumber() {
        System.out.println("Введите номер для прямого поиска в HashSet:");
        String number = new Scanner(System.in).nextLine();
        long startTime = System.nanoTime();
        System.out.println(coolCarNumbersList.contains(number) + " , " + (System.nanoTime() - startTime));
    }

    public static void directTreeSetSearchCoolNumber() {
        System.out.println("Введите номер для прямого поиска в TreeSet:");
        String number = new Scanner(System.in).nextLine();
        long startTime = System.nanoTime();
        System.out.println(coolCarNumbersList.contains(number) + " , " + (System.nanoTime() - startTime));
    }
}