package Builder;

public class Main {
    public static void main(String[] args) {
        WebPageBuilder builder = new WebPageBuilder();
        DefaultWebPageDirector defaultWebPageDirector = new DefaultWebPageDirector(builder);

        WebPage articlePage = defaultWebPageDirector.createArticle("Article Content");

        WebPage formPage = defaultWebPageDirector.createForm("Form Title", "Form Fields");

        System.out.println("Article Title: " + articlePage.getTitle());
        System.out.println("Article Content: " + articlePage.getContent());

        System.out.println("Form Title: " + formPage.getTitle());
        System.out.println("Form Fields: " + formPage.getContent());
    }
}
