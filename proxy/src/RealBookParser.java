public class RealBookParser implements IBookParser{

    public RealBookParser(String book) {
        // resource intensive time-consuming task
    }

    @Override
    public int getNoOfPages() {
        return 0;
    }

    @Override
    public int getNoOfChapters() {
        return 0;
    }

    @Override
    public String getChaptersByTopic() {
        return "";
    }
}
