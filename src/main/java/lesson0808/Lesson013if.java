package lesson0808;

public class Lesson013if {
    public static void main(String[] args) {
        int age=35;
        int b=26;
        int[] mass=new int[5];
        if(age>b){
            System.out.println("true");
        }
        String name="Vasiliy";
        if (name.length()>mass.length){
            System.out.println("true");
        }
        if(b%2==0){
            System.out.println("chet");
        }
    }
}
