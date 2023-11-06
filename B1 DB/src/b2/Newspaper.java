package b2;

public class Newspaper extends Library {
    int releaseDay;

    public Newspaper(String docID, String publisherName, int copies, int releaseDay) {
        super(docID, publisherName, copies);
        this.releaseDay = releaseDay;
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }

    public String toString() {
        return "Newspaper{" + super.toString() + "Release Day = " + releaseDay + "}";
    }
}
