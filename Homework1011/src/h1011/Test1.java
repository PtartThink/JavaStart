package h1011;

public class Test1 {
    public static void main(String[] args) {
        SE se1 = new SE(5000);
        PM pm1 = new PM(6000);

        Calculatingsalarycategory.pay(se1);

        Calculatingsalarycategory.pay(pm1);
    }
}
