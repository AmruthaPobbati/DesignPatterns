public class Main {
    public static void main(String[] args) {
        String book = ""; // some lengthy string
        IBookParser bookParser = new ProxyBookParser(book);

        bookParser.getNoOfChapters();
        bookParser.getNoOfPages();
        bookParser.getChaptersByTopic();
    }
}