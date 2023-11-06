package b3;

import java.util.Arrays;

public class StudentA extends Student {
    String subject_1 = "Hoa";
    String subject_2 = "Ly";
    String subject_3 = "Toan";

    public StudentA(String ID_num, String name, String address, int priority_level) {
        super(ID_num, name, address, priority_level);
    }

    @Override
    public String toString() {
        return "StudentA{" +
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
