package b3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    public ArrayList<Student> candidates;

    public TuyenSinh() {
        this.candidates = new ArrayList<>();
    }

    public void addCandidate(Student candidate) {
        this.candidates.add(candidate);
    }

    public void showInfoCandidate() {
        this.candidates.stream().forEach(candidate -> System.out.println(candidate.toString()));
    }

    public List<Student> searchCandidate(String id) {
        return this.candidates.stream().filter(candidate -> candidate.getID_num().equals(id)).collect(Collectors.toList());
    }
}
