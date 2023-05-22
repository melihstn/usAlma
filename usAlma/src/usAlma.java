import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class usAlma {
    static int us(){
        Scanner input = new Scanner(System.in);
        int taban, us, sonuc = 1;
        System.out.print("taban değerini giriniz : ");
        taban = input.nextInt();
        System.out.print("üs değerini giriniz : ");
        us = input.nextInt();

        for(int i = 1; i <= us; i++){
            sonuc *= taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {


        System.out.println("sonuç : " + us() );

    }
}
