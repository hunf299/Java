package b1;

import b1.CanBo;

public class Congnhan extends CanBo {
    int level;

    public Congnhan(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "b1.Congnhan[" + super.toString() + ", level=" + level + ']';
    }
}
