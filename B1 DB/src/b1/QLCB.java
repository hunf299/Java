package b1;

import b1.CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB{
    private List<CanBo> canbo;

    public QLCB() {
        this.canbo = new ArrayList<>();
    }
    public void addCanBo(CanBo canBo) {
        this.canbo.add(canBo);
    }
    public List<CanBo> searchCanBo(String name) {
        return this.canbo.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public void showListInfoCanBo () {
        this.canbo.forEach(o -> System.out.println(o.toString()));
    }
}
