package lesson0411.lesson0422;

import java.util.Objects;
import java.util.Random;

public class GotemBankClient extends Client {
   private String insideID;


    public GotemBankClient(String name, int number) {
        super(name, number);

        insideID= "ID"+new Random().nextInt(96325847);

        System.out.println("new bank ID = "+insideID);
    }


    public void printSomeInfo() {
        System.out.println("ID = "+insideID+" "+getName());
    }

    public static boolean maxLength(String str) {
        System.out.println("hello");
        return str.length() > 15 ? true : false;
    }

    @Override
    public void payPal() {
        System.out.println("Override abstract method");
    }

    @Override
    public String toString() {
        return "GotemBankClient{" +
                "insideID='" + insideID + '\'' +
                "name='"+getName()+'\''+
                '}';
    }
}
