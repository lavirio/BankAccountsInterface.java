import Exception.*;
import Metro.SubwayLine;
import Metro.SubwayStation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static void downloadPageFromWebsite() throws IOException {
        String url = "https://ru.wikipedia.org/wiki/Список_станций_Московского_метрополитена";
        String html = Jsoup.parse(new URL(url), 0).html();
        List<String> website = new ArrayList<>();
        website.add(html);
        Files.write(Paths.get("src/Data/Wikipedia.html"), website);
    }

    private static Pattern stationName = Pattern.compile("((\\W+\\s)?)\\W+");
    private static Pattern colorName = Pattern.compile("#\\w+");
    private static Pattern lineNumber = Pattern.compile("^\\S+");

    private static Document downloadPage() throws Exception {
        String url = "https://ru.wikipedia.org/wiki/Список_станций_Московского_метрополитена";
        Document page = Jsoup.parse(new URL(url), 0);
        if (page.hasText()) {
            return page;
        }
        throw new LoadException("Can't download page from website!");
    }

    private static String getNameFromString(String stringName) {
        Matcher matcher = stationName.matcher(stringName);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String getColorIdFromString(String stringColor) {
        Matcher matcher = colorName.matcher(stringColor);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String getLineNumberFromString(String lineNumberString) {
        String number = lineNumberString.replaceAll("^0", "").trim();
        Matcher matcher = lineNumber.matcher(number);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            List<String> stations = new ArrayList<>();
            Document document = downloadPage();

            Element table = document.select("table").get(2);
            Elements rows = table.select("tr");
            Elements line = document.select("div.navbox").select("table.navbox-columns-table").select("a");

            line.forEach(element -> stations.add(element.text().replaceAll("\\s+","")));

            rows.stream().skip(1).forEach(element -> {
                SubwayStation subwayStation = new SubwayStation(getNameFromString(element.select("a").text()), getLineNumberFromString(element.select("span.sortkey").text()));
                SubwayLine subwayLine = new SubwayLine(element.select("span").attr("title"), getLineNumberFromString(element.select("span.sortkey").text()), getColorIdFromString(element.select("td").attr("style")));
                
            });

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}