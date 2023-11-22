package Builder;

public class WebPage {
    private String title;
    private String header;
    private String content;
    private String footer;

    public WebPage(String title, String header, String content, String footer) {
        this.title = title;
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
