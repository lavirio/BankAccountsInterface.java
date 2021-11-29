public class Main {
    public static void main(String[] args) {
        Client client1 = new IndividualBusinessMan("Иван Абрамов");
        Client client2 = new LegalPerson("Алексей Шестаков");
        Client client3 = new PhysicalPerson("Наталья Жердева");
        System.out.println();
        client1.getInfo();
        System.out.println();
        client2.getInfo();
        System.out.println();
        client3.getInfo();
    }
}
