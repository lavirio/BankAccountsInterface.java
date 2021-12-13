import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculateFolderSize();
    }


    public static void calculateFolderSize() {
        try {
            System.out.println("Введите путь до папки:");
            String path = new Scanner(System.in).nextLine();
            long byteSize = Files.walk(Paths.get(path)).map(Path::toFile).filter(File::isFile).mapToLong(File::length).sum();
            double gbSize = (byteSize / Math.pow(2, 30));
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            System.out.println("Размер папки " + path + " составляет " + decimalFormat.format(gbSize) + " Гб");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
