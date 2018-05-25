import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//https://www.youtube.com/watch?v=TIdF6_MvHzM Youtube Tutorial

public class WebCrawler {
	public static void main(String[] args) {
		try {
		Document doc = Jsoup.connect("http://www.jsoup.org/").get();
		Elements newsHeadlines = doc.select("a");
		for(Element e: newsHeadlines) {
			System.out.println(e.attr("abs:href"));
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
