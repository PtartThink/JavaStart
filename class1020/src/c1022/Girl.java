package c1022;

public class Girl {
    //找对象
    //throws声明方法时向外抛出异常
    public void findBoyFriend(double salary) throws Exception {
        if(salary>30000){
            System.out.println("可以");
        }else{
            throw new Exception();//向外抛出异常。
        }
    }
}
