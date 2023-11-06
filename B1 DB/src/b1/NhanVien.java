package b1;

import b1.CanBo;

public class NhanVien extends CanBo {
    String career;

    public NhanVien(String name, int age, String gender, String address, String career) {
        super(name, age, gender, address);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "b1.NhanVien[" + super.toString() + ", career='" + career + '\'' + ']';
    }
}
