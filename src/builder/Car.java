package builder;

public class Car {

    private String fangxiangpan;
    private String luntai;
    private String fadongji;

    public String getFangxiangpan() {
        return fangxiangpan;
    }

    public void setFangxiangpan(String fangxiangpan) {
        this.fangxiangpan = fangxiangpan;
    }

    public String getLuntai() {
        return luntai;
    }

    public void setLuntai(String luntai) {
        this.luntai = luntai;
    }

    public String getFadongji() {
        return fadongji;
    }

    public void setFadongji(String fadongji) {
        this.fadongji = fadongji;
    }

    public void drive() {
        if (!this.fangxiangpan.equals("") && !this.fadongji.equals("null") && !this.luntai.equals("")) {
            System.out.println("车开动了");
        }
    }
}
