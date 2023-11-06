package b3;

public class Student {
    String ID_num;
    String name;
    String address;
    int priority_level;

    public Student(String ID_num, String name, String address, int priority_level) {
        this.ID_num = ID_num;
        this.name = name;
        this.address = address;
        this.priority_level = priority_level;
    }

    public String getID_num() {
        return ID_num;
    }

    public void setID_num(String ID_num) {
        this.ID_num = ID_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority_level() {
        return priority_level;
    }

    public void setPriority_level(int priority_level) {
        this.priority_level = priority_level;
    }

    @Override
    public String toString() {
        return "ID_num=" + ID_num + ", name='" + name + '\'' + ", address='" + address + '\'' + ", priority_level=" + priority_level + ']';
    }
}
