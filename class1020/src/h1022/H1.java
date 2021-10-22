package h1022;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        int a ;
        int b = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        while (b == 0){
            try {
                b = input.nextInt();
            }catch(Exception e) {
                b = 0;
                System.out.println("重输");

            }finally {
                b = input.nextInt();
            }
        }
        int c = a/b;
        System.out.println(c);
        }
    }

