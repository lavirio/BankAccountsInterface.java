public class Main {
    public static void main(String[] args) {
        int milk = 1000;
        int flour = 1000;
        int eggs = 1000;
        int sugar = 1000;
        int butter = 1000;
        int apples = 1000;
        boolean isContinue = false;

        if (flour >= 400 && sugar >= 10 && milk >= 1000 && butter >= 30) {
            System.out.println("Вы можете приготовить Pancakes!");
            isContinue = true;
        }
        if (milk >= 300 && eggs >= 5 && flour >= 5) {
            System.out.println("Вы можете приготовить Omelette");
            isContinue = true;
        }
        if (apples >= 3 && milk >= 100 && flour >= 300 && eggs >= 4) {
            System.out.println("Вы можете приготовить Apple pie!");
            isContinue = true;
        }
        if (!isContinue) {
            System.out.println("Вы ничего не можеете приготоивть!");
        }
    }
}
