public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Алекс:");

        System.out.println("Кот № 1, " + cat1);


        cat1.feed();
        cat1.feed();
        cat1.feed();

        System.out.println("Вес кота № 1: " + cat1.getWeight() + " гр., закинулся хавкой. Съел целых " + cat1.getFeed() + " гр. жратвы");

        cat1.pee();
        cat1.pee();

        System.out.println("Вес кота № 1: " + cat1.getWeight() + " гр., с кайфом посикал. Выссал целых " + cat1.getPee() + " гр. жидкостки");
        cat1.explode();
        cat1.toilet();

        System.out.println(getKitten());
        System.out.println(Cat.getCount());


    }

    private static Cat getKitten(){
        return new Cat(1100);
    }
}