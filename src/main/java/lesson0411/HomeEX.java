package lesson0411;

import java.util.Scanner;

public class HomeEX {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ch1,ch2;
        String znak;
        System.out.println("Vvedite chislo 1 :");
        ch1=console.nextInt();
        System.out.println("Vvedite chislo 2 :");
        ch2=console.nextInt();
        System.out.println("Vvedite znak : ");
        znak=console.next();

        switch (znak){
            case "+":
                System.out.println("summa = "+MyMathUtils.sum(ch1, ch2));
                break;
            case "-":
                System.out.println( "otvet = "+MyMathUtils.ot(ch1,ch2) );
                break;
            default:
                System.out.println("Vveli nekorectnuy znak:)");

        }
    }

}
