import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.util.Scanner;

public class Main {

    private static Logger logger;
    private static Marker infoMarker = MarkerManager.getMarker("InputInfo");
    private static Marker errorMarker = MarkerManager.getMarker("ErrorInfo");
    private static Marker startMarker = MarkerManager.getMarker("StartInfo");

    public static void main(String[] args) {
        logger = LogManager.getRootLogger();
        logger.info(startMarker, "Program has been launched!");

        while (true) {
            try {
                System.out.println("Введите число A:");
                String numberA = new Scanner(System.in).nextLine();
                logger.info(infoMarker,"User input in a: " +  numberA);
                int a = Integer.parseInt(numberA);

                System.out.println("Введите число B:");
                String numberB = new Scanner(System.in).nextLine();
                logger.info(infoMarker,"User input in a: " +  numberB);
                int b = Integer.parseInt(numberB);

                Calculator calculator = new Calculator(a, b);
                logger.info(infoMarker,"Result = " + calculator.sum());
                System.out.println(calculator.sum());

            } catch (Exception e) {
                System.err.println("Error! Input wrong");
                logger.warn(errorMarker,"input wrong! " +  e.getMessage());
            }
        }
    }
}