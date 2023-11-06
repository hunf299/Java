package b2;

public class Magazine extends Library {
    int ReleaseNo;
    int releaseMonth;

    public Magazine(String docID, String publisherName, int copies, int releaseNo, int releaseMonth) {
        super(docID, publisherName, copies);
        ReleaseNo = releaseNo;
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseNo() {
        return ReleaseNo;
    }

    public void setReleaseNo(int releaseNo) {
        ReleaseNo = releaseNo;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public String toString() {
        return "Magazine{" + super.toString() + "Release Number = " + ReleaseNo + ",Release Month = "+releaseMonth + "}";
    }
}
