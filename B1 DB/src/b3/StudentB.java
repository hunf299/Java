package b3;

import java.util.Arrays;

public class StudentB extends Student {
    String subject_1 = "Toan";
    String subject_2 = "Hoa";
    String subject_3 = "Sinh";

    public StudentB(String ID_num, String name, String address, int priority_level) {
        super(ID_num, name, address, priority_level);
    }

    @Override
    public String toString() {
        return "StudentB{" +
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
