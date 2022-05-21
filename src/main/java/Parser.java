import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;

public class Parser {

    public static void main(String[] args) throws IOException {
        Document page = getPage();
        // css query language
        Element tableWidth = page.select("Table[class=wt]").first();
        System.out.println(tableWidth);
        String date = "";
        System.out.println(date + "    Явление    Температура    Давление    Влажность    Ветер");
    }

    private static Document getPage() throws IOException{
        String url = "https://pogoda.spb.ru/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
}
