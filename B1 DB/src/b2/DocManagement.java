package b2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class DocManagement {
    private List<Library> documents;

    public DocManagement() {
        this.documents = new ArrayList<>();
    }

    public void addDoc(Library document) {
        this.documents.add(document);
    }

    public boolean deleteDoc(String id) {
        Library doc = this.documents.stream().filter(document -> document.getDocID().equals(id)).findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }
    public void showInfoDoc() {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }

    public List<Library> searchDocBook() {
        return this.documents.stream().filter(doc -> doc instanceof Book).collect(Collectors.toList());
    }

    public List<Library> searchDocMaga() {
        return this.documents.stream().filter(doc -> doc instanceof Magazine).collect(Collectors.toList());
    }

    public List<Library> searchDocNews() {
        return this.documents.stream().filter(doc -> doc instanceof Newspaper).collect(Collectors.toList());
    }
}
