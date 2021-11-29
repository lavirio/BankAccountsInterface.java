public class Main {
    public static void main(String[] args) {
        Human humanVasya = new Human("Вася", 'М', 22);

        Human humanPetya = new Human(humanVasya.getName(), humanVasya.gender, humanVasya.getAge());

        System.out.println("Имя: " + humanVasya.getName() + ", Пол: " + humanVasya.getGender() + ", Возраст: " + humanVasya.getAge());

        System.out.println("Имя: " + humanPetya.getName() + ", Пол: " + humanPetya.getGender() + ", Возраст: " + humanPetya.getAge());

        humanPetya.setName("Петя");
        System.out.println();

        System.out.println("Имя: " + humanVasya.getName() + ", Пол: " + humanVasya.getGender() + ", Возраст: " + humanVasya.getAge());

        System.out.println("Имя: " + humanPetya.getName() + ", Пол: " + humanPetya.getGender() + ", Возраст: " + humanPetya.getAge());

    }
}
