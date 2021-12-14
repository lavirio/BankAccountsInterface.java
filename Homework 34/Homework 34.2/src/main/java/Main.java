import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(copyFolder());
    }

    private static boolean copyFolder() throws IOException {
        System.out.println("Введите путь к папке, которую хотите скопировать:");
        String srcPath = new Scanner(System.in).nextLine();
        File src = new File(srcPath);

        System.out.println("Введите путь к новой папке:");
        String targetPath = new Scanner(System.in).nextLine();
        File target = new File(targetPath);
        if (target.exists()) {
            System.out.println("Файл уже существует!");
        } else {
            try {
                FileUtils.copyDirectory(src,target);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
