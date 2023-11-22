package Builder;

public interface WebPageDirector {
    WebPage createArticle(String content);

    WebPage createForm(String title, String fields);
}

