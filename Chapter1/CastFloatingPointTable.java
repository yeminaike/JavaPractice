package Chapter1;

import java.util.Scanner;

public class CastFloatingPointTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float A, B;
        System.out.print("(A  B   pow(A, B)");
        System.out.println( );
       A = 1;
       B = 2;

        System.out.print((int)A +  "     "+(int)B +  "     "+(int)Math.pow(A , B));
        System.out.println(  );
        A++;
        B++;
        System.out.print((int)A + "      "+(int)B + "     "+(int)Math.pow(A, B));
        System.out.println(   );
        A++;
        B++;
        System.out.print((int)A +"        "+(int)B + "     "+(int)Math.pow(A, B));
        System.out.println(  );
        A++;
        B++;

        System.out.print((int)A +"        "+(int)B +"      "+(int)Math.pow(A, B));
        System.out.println(   );
        A++;
        B++;

        System.out.print((int)A +"  v       "+(int)B +"      "+(int)Math.pow(A, B));
        System.out.println(    );

       A++;
       B++;
    }



}
