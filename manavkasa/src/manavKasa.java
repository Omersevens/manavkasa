import java.util.Scanner;

public class manavKasa {
    public static void main (String[]args){

        double elmafyt, armutfyt, muzfyt, domatesfyt;


        elmafyt= 5.4 ;
        armutfyt= 4.6 ;
        muzfyt= 3.5;
        domatesfyt= 2.6;
        double elma, armut, muz, domates;

        Scanner input = new Scanner(System.in);
        System.out.println("kaç kg elma aldınız: ");
        elma = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.println("kaç kg armut aldınız: ");
        armut= input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("kaç kg muz aldınız: ");
        muz= input.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.println("kaç kg domates aldınız: ");
        domates= input.nextDouble();


        double topelma, toparmut, topmuz, topdomates, toplamTutar;

        topelma = elma * elmafyt;
        toparmut = armut * armutfyt;
        topmuz = muz * muzfyt;
        topdomates = domates * domatesfyt;

        toplamTutar = topelma+toparmut+topdomates+topmuz;

        System.out.println("toplam tutar : "+toplamTutar);





    }
}
