public class Fakultat {

    // Rekursive Berechnung von n!
    public static int rek(int n) {
        if (n == 0)
            return 1;
        return n * rek(n - 1);
    }

    // Iterative Berechnung mit einer for-Schleife
    public static int iterativFor(int n) {
        int erg = 1;
        for (int i = n; i > 0; i--) {
            erg = erg * i;
        }
        return erg;
    }

    // Iterative Berechnung mit einer while-Schleife
    public static int iterativWhile(int n) {
        int erg = 1;
        while (n > 0) {
            erg = erg * n;
            n = n - 1;
        }
        return erg;
    }

    // Hauptmethode
    public static void main(String[] args) {
        int n = 5;

        System.out.println("rekursiv:       " + rek(n));
        System.out.println("iterativ (for): " + iterativFor(n));
        System.out.println("iterativ (while): " + iterativWhile(n));
    }
}
