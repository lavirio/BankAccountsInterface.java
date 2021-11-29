import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double[] temperature = new double[10];
        int minTemperature = 32;
        int maxTemperature = 40;
        DecimalFormat decimalFormat = new DecimalFormat("##.#");
        int healthPeople = 0;
        double avrTemp = 0;

        for (double i : temperature) {
            temperature[(int) i] = minTemperature + Math.random() * ((maxTemperature - minTemperature) + 1);
            avrTemp += temperature[(int)i] / temperature.length;
            System.out.print(decimalFormat.format(temperature[(int) i]) + " ");
            if(temperature[(int) i] >= 36.2 && temperature[(int) i] <= 36.9){
                healthPeople++;
            }
        }
        System.out.println();
        System.out.println(healthPeople);
        System.out.println(decimalFormat.format(avrTemp));
    }
}