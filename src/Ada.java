import java.util.Scanner;

public class Ada {
    public static void main(String[] args) {

        int np, tot, c, p, costo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese numero de personas: ");

        if (np > 200) {
            tot = np * 75;
        } else {
            if (np > 200) {
                tot = np * 85;
            } else {
                tot = np * 95;
            }
        }

        System.out.println("el total es : " + tot);
    }
}