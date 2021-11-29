public class Cat {
    private int weight;
    int feed;
    int pee;
    static int count;

    public Cat(int weight) {
        this.weight = weight;
        count++;
    }

    public Cat(String name) {
        name(name);
        weight = 1500;
        count++;
    }

    public void name(String name) {
        System.out.println(name);
    }

    public void feed() {
        double random = Math.random();
        if (weight <= 0) {
            System.out.println("Котик сдох!");
        }
        if (random >= 0.5) {
            weight += 100;
            feed += 100;
        } else {
            weight += 150;
            feed += 150;
        }
    }

    public void explode() {
        if (getWeight() <= 0 || getWeight() >= 2500 ){
            return;
        }
        while (getWeight() < 2500) {
            weight += 150;
        }
        if (getWeight() >= 2500) {
            System.out.println("Кот пережрал и взорвался!");
            count--;
        }
    }

    public void toilet() {
        if (getWeight() <= 0 || getWeight() >= 2500 ){
            return;
        }
        while (getWeight() > 0) {
            weight -= 50;
        }
        if (getWeight() <= 0) {
            System.out.println("Кот обоссался до смерти!");
            count--;
        }
    }

    public void pee() {
        weight -= 50;
        pee += 50;
    }

    public int getWeight() {
        return weight;
    }

    public int getFeed() {
        return feed;
    }

    public int getPee() {
        return pee;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return
                "вес: " + weight + " гр";
    }

}
