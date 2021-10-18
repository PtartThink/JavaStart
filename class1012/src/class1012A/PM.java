package class1012A;

public class PM extends Employee{
    private int exp;
    private double bonus;

    public int getExp() {
        return exp;
    }

    public double getBonus() {
        return bonus;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public PM(){

    }
    public PM(int id,String name,String gender,double salary,int exp,double bonus){
        this.setID(id);
        this.setName(name);



    }
}
