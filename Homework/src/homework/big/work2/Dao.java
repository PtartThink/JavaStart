package homework.big.work2;

public class Dao {
    private static Start[] heros = new Start[20];
      static{
          heros[0] = new Start(1, "菲兹", "中单", 500, 200, 3000);
          heros[1] = new Start(2, "崔斯塔娜", "ADC", 4500, 100, 1500);
      }



    public Start[] getHeros(){
        return heros;
    }


}
