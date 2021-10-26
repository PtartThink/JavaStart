package h1014;

public abstract class DrawSoft {
    private int zuobiaoxzhou;
    private int zuobiaoyzhou;
    private  String tuanyanse;


    public abstract void Draw();

    public int getZuobiaoxzhou() {
        return zuobiaoxzhou;
    }

    public int getZuobiaoyzhou() {
        return zuobiaoyzhou;
    }

    public String getTuanyanse() {
        return tuanyanse;
    }

    public void setTuanyanse(String tuanyanse) {
        this.tuanyanse = tuanyanse;
    }

    public void setZuobiaoxzhou(int zuobiaoxzhou) {
        this.zuobiaoxzhou = zuobiaoxzhou;
    }

    public void setZuobiaoyzhou(int zuobiaoyzhou) {
        this.zuobiaoyzhou = zuobiaoyzhou;
    }

}
