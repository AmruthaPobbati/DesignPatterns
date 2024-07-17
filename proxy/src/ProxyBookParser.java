public class ProxyBookParser implements IBookParser{

    private RealBookParser realBookParser;
    private String book;

    public ProxyBookParser(String book) {
        this.realBookParser = null;
    }

    @Override
    public int getNoOfPages() {
        if (realBookParser == null) realBookParser = new RealBookParser(book);
        return realBookParser.getNoOfPages();
    }

    @Override
    public int getNoOfChapters() {
        if (realBookParser == null) realBookParser = new RealBookParser(book);
        return realBookParser.getNoOfChapters();
    }

    @Override
    public String getChaptersByTopic() {
        if (realBookParser == null) realBookParser = new RealBookParser(book);
        return realBookParser.getChaptersByTopic();
    }
}
