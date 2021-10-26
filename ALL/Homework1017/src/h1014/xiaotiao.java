package h1014;

public class xiaotiao extends DrawSoft{

    @Override
    public void Draw() {
        System.out.println("绘制线条");

    }

    private int Zhongdianyzhouzuobiao;
    private int zhongdianxzhouzuobiao;


    public int getZhongdianxzhouzuobiao(){
        return zhongdianxzhouzuobiao;
    }


    public int getZhongdianyzhouzuobiao(){
        return Zhongdianyzhouzuobiao;
    }


    public void setZhongdianxzhouzuobiao(int zhongdianxzhouzuobiao) {
        this.zhongdianxzhouzuobiao = zhongdianxzhouzuobiao;
    }

    public void setZhongdianyzhouzuobiao(int zhongdianyzhouzuobiao) {
        Zhongdianyzhouzuobiao = zhongdianyzhouzuobiao;
    }

}
