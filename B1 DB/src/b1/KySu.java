package b1;

import b1.CanBo;

public class KySu extends CanBo {
    String field;

    public KySu(String name, int age, String gender, String address, String field) {
        super(name, age, gender, address);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "b1.KySu[" + super.toString() + ", field='" + field + '\'' + ']';
    }
}
