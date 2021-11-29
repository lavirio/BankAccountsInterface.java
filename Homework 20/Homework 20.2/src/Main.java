public class Main {
    public static void main(String[] args) {
        Printer basketLev = new Printer();
        basketLev.append("\"Как я провел лето?\"");
        basketLev.append("\"Как хорошо в солнечном лесу!\"","Деревья пахнт осенними листьями.");
        basketLev.append("\"День в Сочи\"","Летний зной, только начинал окутывать недавно пробудившаюся от ночной дремты солнечный берег Сочи.",5);
        basketLev.getDocumentCount();
        basketLev.getPagesCount();
        basketLev.print("Корзина Льва:");
        basketLev.getDocumentCount();
        basketLev.getPagesCount();
        basketLev.printerCheck();

        Printer basketAnton = new Printer();
        basketAnton.print("Корзина Антона:");
    }
}
