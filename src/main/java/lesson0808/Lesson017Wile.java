package lesson0808;

public class Lesson017Wile {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 3, 3, 5, 9, 7, 4, 6, 8};
        int i = 0;
        while (mass[i] % 2 == 0) {
            System.out.println(mass[i]);
            i++;
        }

        i=0;
        do{
            System.out.println(mass[i]);
            i++;
        }while (mass[i] % 2 == 0);
    }
}
