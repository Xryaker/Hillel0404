package lesson0411;

public class MyUtil {


    public static void print() {
        String name = "Vasiliy";
        int age = 36;
        System.out.println("name - " + name + "\n" + "age : " + age);
    }

    public static void sum(int ch1, int ch2) {
        System.out.println("sum = "+(ch1+ch2));
    }
    public static int summ(int ch1,int ch2){
        int sum=ch1+ch2;
        return sum;
    }
    public static void prinInfo(String name, int age){
        System.out.println("name - " + name + "\n" + "age : " + age);
    }
    public static void prinInfo(String name, int age,String lastname){
        System.out.println("name - " + name + "\n" + "age : " + age+"\n"+"lastname - "+lastname);
    }
    public static void prinInfo(String name,String lastname){
        System.out.println("name - " + name + "\n" +"lastname - "+lastname);
    }
}
