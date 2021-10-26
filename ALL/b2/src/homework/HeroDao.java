package homework;

public class HeroDao {
    private static Hero[] heros = new Hero[20];
    static{//加入两个英雄
        heros[0] = new Hero(1, "菲兹", "中单", 500, 200, 3000);
        heros[1] = new Hero(5, "崔斯塔娜", "ADC", 4500, 100, 1500);
    }
    //1.遍历：一览英雄信息
    //关键点：1返回值，2参数，3具体实现
    public Hero[] getAllHero(){
        return heros;
    }
    //2.英雄添加，ID自动生成，名字不能重名，其余的自己填
    //设计一个获得最大id的方法
    public int getMaxId(){
        int max = 0;
        for(int i=0;i<heros.length;i++){
            if(heros[i]!=null&&heros[i].getId()>max){
                max = heros[i].getId();
            }
        }
        return max;//返回最大值
    }
    public boolean addHero(Hero hero){
        for(int i=0;i<heros.length;i++){
            //找空位
            if(heros[i]==null){
                heros[i] = hero;
                return true;
            }
        }
        return false;//没有空位添加失败
    }
    //6.根据名字查询英雄
    public Hero getHeroByName(String name){
        for(int i=0;i<heros.length;i++){
            if(heros[i]!=null&&heros[i].getName().equals(name)){
                return heros[i];//名字找到了，返回这个元素
            }
        }
        return null;
    }
    //3.根据名字删除英雄，没有名字删除失败
    public boolean deleteHeroByName(String name){
        for(int i=0;i<heros.length;i++){
            if(heros[i]!=null&&heros[i].getName().equals(name)){
                heros[i] = null;//名字找到了，删除
                return true;
            }
        }
        return false;
    }
    //4.输入ID，修改其他属性
	//public boolean updateHero(int id,String name,String job,int attk,int def,int hp){}
    public boolean updateHero(Hero hero){
        for(int i=0;i<heros.length;i++){
            if(heros[i]!=null&&heros[i].getId()==hero.getId()){//找到了
                heros[i] = hero;
                return true;

            }
        }
        return false;
    }
    //根据id查询英雄
    public boolean getHeroById(int id){
        for(int i=0;i<heros.length;i++){
            if(heros[i]!=null&&heros[i].getId()==id){
                return true;
            }
        }
        return false;
    }

}
