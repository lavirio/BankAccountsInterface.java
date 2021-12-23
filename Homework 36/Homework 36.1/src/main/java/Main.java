import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try {
            Set<String> stringListParse = new TreeSet<>();
            String url = "https://lenta.ru";
            Document documentParse = Jsoup.parse(new URL(url), 0);
            Elements elementsParse = documentParse.select("img");
            elementsParse.forEach(element -> stringListParse.add(element.attr("abs:src")));
            Files.write(Paths.get("data/links.txt"), stringListParse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
