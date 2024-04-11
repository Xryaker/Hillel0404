package lesson0411;

public class ReturnExample {
    public static int check(int i) {
        if (i > 9) {
            return i;
        }
        System.out.println("lksnlkns;l");
        return 0;
    }

    public static boolean check(int[] mass, int t) {
        for (int i = 0; i < mass.length; i++) {
            if (equal(mass[i], t)) {
                return true;
            }
        }
        return false;
    }

    private static boolean equal(int i, int t) {
        return i == t;
    }
}
