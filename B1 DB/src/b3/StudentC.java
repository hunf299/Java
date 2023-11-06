package b3;

import java.util.Arrays;

public class StudentC extends Student {
    String subject_1 = "Van";
    String subject_2 = "Su";
    String subject_3 = "Dia";

    public StudentC(String ID_num, String name, String address, int priority_level) {
        super(ID_num, name, address, priority_level);
    }

    @Override
    public String toString() {
        return "StudentC{" +
                "ID_num=" + ID_num +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority_level=" + priority_level +
                ", Subject: subject_1='" + subject_1 + '\'' +
                ", subject_2='" + subject_2 + '\'' +
                ", subject_3='" + subject_3 + '\'' +
                '}';
    }
}
