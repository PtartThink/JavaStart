package WorldTeacher;

public class God {

    public static Person makeChild(Person person1,Person person2){
        if(person1.getSex()!=person2.getSex()){
            if(person1.getSex() =='男' ){
                if (person1.getAge()>=23){
                    if (person2.getAge()>=20){
                        Person child = new Person();
                        child.setAge(1);
                        child.setXing(person1.getXing());
                        child.setName(person2.getXing());
                        int random = (int)(Math.random()*2);
                        if(random==0){
                            child.setSex('男');
                        }else {
                            child.setSex('女');
                        }
                        return child;
                    }else {
                        System.out.println("妈妈年龄不足");
                        return null;
                    }
                }else {
                    System.out.println("爸爸年龄不足");
                    return null;
                }

            }else{//person2是爸爸
                if (person2.getAge()>=23){
                    if (person1.getAge()>=20){
                        Person child = new Person();
                        child.setAge(1);
                        child.setXing(person2.getXing());
                        child.setName(person1.getXing());
                        int random = (int)(Math.random()*2);
                        if(random==0){
                            child.setSex('男');
                        }else {
                            child.setSex('女');
                        }
                        return child;
                    }else {
                        System.out.println("妈妈年龄不足");
                        return null;
                    }
                }else {
                    System.out.println("爸爸年龄不足");
                    return null;
                }
            }
        }else {
            System.out.println("同性不能生育！");
            return null;
        }
    }
}
