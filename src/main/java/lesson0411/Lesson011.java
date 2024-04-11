package lesson0411;

public class Lesson011 {
    public static void main(String[] args) {
        MyUtil.print();
        MyUtil.sum(2,3);
        int s=MyUtil.summ(2,10);
        System.out.println(s);
        String ss="Vasiliy";
        MyUtil.prinInfo(ss,MyUtil.summ(25,10));
        MyUtil.prinInfo("Vasiliy",35);
        MyUtil.prinInfo(ss,s);
        MyUtil.prinInfo("Vasiliy",34,"Shevchenko");
        MyUtil.prinInfo("vasiliy","Shevchenko");
        MyUtil.prinInfo("Vasiliy",34,"Shevchenko");
        String str=String.valueOf(2.5);
    }

}
