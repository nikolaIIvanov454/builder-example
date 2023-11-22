package Builder;

public class WebPageBuilder {
    private WebPage currentWebPage;

    public WebPage createWebPage(String title, String header, String content, String footer) {
        return new WebPage(title, header, content, footer);
    }

    public void setCurrentWebPageTitle(String title) {
        this.currentWebPage.setTitle(title);
    }

    public void setCurrentWebPageHeader(String header) {
        this.currentWebPage.setHeader(header);
    }

    public void setCurrentWebPageContent(String content) {
        this.currentWebPage.setContent(content);
    }

    public void setCurrentWebPageFooter(String footer) {
        this.currentWebPage.setFooter(footer);
    }

    public WebPage createDefaultWebPage(String title, String header, String content, String footer){
        this.currentWebPage = new WebPage(title, header, content, footer);

        return this.currentWebPage;
    }
}
