package h1012.h3;

public class Bus extends Car{
    //	公共汽车类 Bus
//	2. 增加属性 ： 限乘人数  count    //指最多能坐多少人
    private int count;

    public Bus(String brand, String type, double ranRL, double youRL,int count) {
        super(brand, type, ranRL, youRL);
        this.count = count;
        // TODO Auto-generated constructor stub
    }
    //	3. 重写父类方法 getMsg（）
    public String getMsg() {
        return "Car [brand=" + getBrand() + ", type=" + getType() + ", ranRL=" + getRanRL()
                + ", youRL=" + getYouRL() + "]"+count;
    }
    //	4. 重写父类方法  getGongLi（）  //super
//	    计算方法：油箱容量 /  燃油量 / 限乘人数 ×100
    public double getKm(){
        return getYouRL()/getRanRL()/count*100;
    }

    //	5. 添加重载方法
//	    getGongLi（double youL, double renShu）
//	功能：计算 当前的油箱容量 与 现在车上的人数 能走的路程
    public double getKm(double youL, double renShu){
        return youL/getRanRL()/renShu*100;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}

