package lesson0808;

public class Lesson015Switch {
    public static void main(String[] args) {
        int i = 7;
        if (i == 1) {
            System.out.println("monday");
        }
        if (i == 7) {
            System.out.println("  ");
        }

        String name = "Valiy";
        switch (name) {
            default:
                System.out.println("bla bla bla");
                break;
            case "1":
                System.out.println("monday");
                break;
            case "2":
                System.out.println(" ");
                break;
            case "Vasiliy":
                System.out.println("my name is " + name);
                break;

        }
    }
}
