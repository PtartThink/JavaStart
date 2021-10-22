package c1022;

public class Father {
    private Mother mother;

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public void getSubSon(double salary){
        try {
            mother.getSubSon(salary);
        }catch (Exception e){
            System.out.println("对你好就行");
        }
    }

}
