package b2;

public class Library {
    String docID;
    String publisherName;
    int copies;

    public Library(String docID, String publisherName, int copies) {
        this.docID = docID;
        this.publisherName = publisherName;
        this.copies = copies;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String toString() {
        return "Doc ID = " + docID + ",Publisher Name = " + publisherName + ",Release Num = " + copies + ",";
    }
}
