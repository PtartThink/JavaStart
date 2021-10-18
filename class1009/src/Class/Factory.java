package Class;

public class Factory {

    public Phone makephone(){
        Phone phone = new Phone("huawei",6999,"mate50");
        return phone;

    }

    public Phone makeBus(){
        Phone bus = new Phone("BYD","h01");
        return bus;

    }

    public Phone call(){
        Phone call = new Phone("李华","xxx",9999,"xxxx");
        return call;
    }
}
