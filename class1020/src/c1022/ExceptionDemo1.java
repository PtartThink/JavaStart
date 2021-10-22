package c1022;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        String string = null;
        int[] arr = new int[2];
        try{
            System.out.println(1);
            System.out.println(10/1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(arr[1]);
            System.out.println(string.length());
            System.out.println(6);
        }catch(ArithmeticException ex){
            System.out.println(4);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(5);
        }catch(NullPointerException ex){
            System.out.println("xxx");
        }catch (Exception e) {
            System.out.println(9);
        }finally{//不管是否有异常，异常处没处理都会执行的代码
            System.out.println(8);
        }
        System.out.println(7);
    }

    }

