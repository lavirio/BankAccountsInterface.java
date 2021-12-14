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
            transferFolderToSufficientSize(byteSize,path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void transferFolderToSufficientSize(long byteSize, String path){
        if (byteSize < Math.pow(2,10)){
            double bitSize = byteSize / 8.0;
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            System.out.println("Размер папки " + path + " составляет " + decimalFormat.format(bitSize) + " байт");
        } else if (byteSize >= Math.pow(2,10) && byteSize < Math.pow(2,20)){
            double kiloByte = byteSize / Math.pow(2,10);
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            System.out.println("Размер папки " + path + " составляет " + decimalFormat.format(kiloByte) + " Кб");
        } else if (byteSize >= Math.pow(2,20) && byteSize < Math.pow(2,30)){
            double megaByte = byteSize / Math.pow(2,20);
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            System.out.println("Размер папки " + path + " составляет " + decimalFormat.format(megaByte) + " Мб");
        } else if (byteSize >= Math.pow(2,30) && byteSize < Math.pow(2,40)){
            double gigaByte = (byteSize / Math.pow(2, 30));
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            System.out.println("Размер папки " + path + " составляет " + decimalFormat.format(gigaByte) + " Гб");
        } else if (byteSize >= Math.pow(2,40) && byteSize < Math.pow(2,50)){
            double teraByte = byteSize / Math.pow(2,40);
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            System.out.println("Размер папки " + path + " составляет " + decimalFormat.format(teraByte) + " Тб");
        } else {
            System.out.println("Объем не распознан!");
        }


    }
}

