package c1022;

public class Mother {
    private Girl girl;

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    //招女婿
    public void getSubSon(double salary) throws BoyfriendException {
        //女儿找男友的方法。
        try{
            girl.findBoyFriend(salary);
        }catch(BoyfriendException e){
            if(salary<10000){
                System.out.println("滚");
            }else{
                //System.out.println("可以");
                throw e;
            }

        }
    }

}
