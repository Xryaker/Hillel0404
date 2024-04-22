package lesson0411.lesson0422;

public class Lesson011 {
    public static void main(String[] args) {

        GotemBankClient gotemBankClient=new GotemBankClient("Vasiliy",123654)
                , client2=new GotemBankClient("Vasiliy",123654);

        gotemBankClient.printSomeInfo();

        System.out.println(gotemBankClient.equals(client2));
        System.out.println(client2);

        System.out.println(Client.maxLength("vasiliy"));
        System.out.println(GotemBankClient.maxLength("njjjd"));
    }
}
