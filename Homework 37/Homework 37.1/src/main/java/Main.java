import Exception.*;
import Metro.SubwayLine;
import Metro.SubwayStation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    private static final Pattern stationName = Pattern.compile("((\\W+\\s)?)\\W+");
    private static final Pattern colorName = Pattern.compile("#\\w+");
    private static final Pattern lineNumber = Pattern.compile("^\\S+");
    private static final String filePath = "src/Data/Wikipedia.html";

    private static List<String> downloadPageFromWebsite() throws Exception {
        String url = "https://ru.wikipedia.org/wiki/Список_станций_Московского_метрополитена";
        String html = Jsoup.parse(new URL(url), 0).html();
        if (html.isEmpty()) {
            throw new LoadException("Can't download page from website!");
        }
        List<String> website = new ArrayList<>();
        website.add(html);
        return website;
    }

    private static Document getDocumentFromComputer(List<String> website) throws Exception {
        Files.write(Paths.get(filePath), website);
        File htmlFile = new File(filePath);
        if (htmlFile.isFile()) {
            return Jsoup.parse(htmlFile, "UTF-8");
        }
        throw new ReadFileException("Can't read file from computer");
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
        String number = lineNumberString.replaceAll("^0", "").replaceAll("[A-я]+", "");
        Matcher matcher = lineNumber.matcher(number);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            List<SubwayLine> lines = new ArrayList<>();
            List<SubwayStation> stations = new ArrayList<>();

            Document document = getDocumentFromComputer(downloadPageFromWebsite());

            Element table = document.select("table").get(2);
            Elements rows = table.select("tr");

            rows.stream().skip(1).forEach(element -> {
                SubwayStation subwayStation = new SubwayStation(getNameFromString(element.select("a").text()), getLineNumberFromString(element.select("span.sortkey").text()));
                SubwayLine subwayLine = new SubwayLine(element.select("span").attr("title"), getLineNumberFromString(element.select("span.sortkey").text()), getColorIdFromString(element.select("td").attr("style")));
                List<String> linesId = lines.stream().map(SubwayLine::getLineId).collect(Collectors.toList());
                if (!linesId.contains(subwayLine.getLineId())) {
                    lines.add(subwayLine);
                }
                stations.add(subwayStation);
                lines.forEach(line -> stations.forEach(station -> {
                    if (line.getLineId().equals(station.getLineId())) {
                        line.addStationToLine(station);
                    }
                }));
            });
            lines.forEach(subwayLine -> System.out.println("Линия " + subwayLine.getLineId() + " - " + subwayLine.getLineName() + " - " + subwayLine.stationCount() + " станции - " + subwayLine.getColor()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}