package Builder;

public class DefaultWebPageDirector implements WebPageDirector{
    private WebPageBuilder webPageBuilder;

    public DefaultWebPageDirector(WebPageBuilder webPageBuilder) {
        this.webPageBuilder = webPageBuilder;
    }

    @Override
    public WebPage createArticle(String content) {
        String title = "Default Title";
        String header = "Default Header";
        String footer = "Default Footer";

        return webPageBuilder.createDefaultWebPage(title, header, content, footer);
    }

    @Override
    public WebPage createForm(String title, String fields) {
        String header = "Default Header";
        String footer = "Default Footer";

        return webPageBuilder.createDefaultWebPage(title, header, fields, footer);
    }
}
