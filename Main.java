import java.util.Scanner;

class domain {
    public static void main(String[] args) {
        int x = 30;
        int y = 40;
        System.out.println(x + y);

        int a = 20;
        long b = 10;
        System.out.println(a * b);

        int d = 70;
        double e = 9.99;
        System.out.println(d + e);
        // REMOVING THE BRACCATES FROM THE VALUE ANSWER WILL BE IN POWER OF 10 in ALU
        /*
         * int f = 100000;
         * int g = 100000;
         * long z = (long) f * g;
         * System.out.println(z);
         */
        /* 
        // BRCATING THE VALUE WILL GIVE THE RANDOM NO WHICH ONLY BE READ BY THE RAM
        int f = 100000;
        int g = 100000;
        long z = (long) (f * g);
        System.out.println(z);
        */
    
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    
    }
}
