package b2;

public class Book extends Library {
    String authorName;
    int pageNo;

    public Book(String docID, String publisherName, int copies, String authorName, int pageNo) {
        super(docID, publisherName, copies);
        this.authorName = authorName;
        this.pageNo = pageNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "authorName=" + authorName + '\'' +
                ", pageNo=" + pageNo +
                '}';
    }
}
